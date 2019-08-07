import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TTLCache<K, V> implements ICache<K, V>{

   private final int timoutMilli;

   private final Map<K, Value<V>> cache;
   private final Lock lock;


   TTLCache(int timoutSec) {
      cache = new LinkedHashMap<>();

      lock = new ReentrantLock();

      this.timoutMilli = timoutSec * 1000;
      ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
      Runnable cleaner = () -> {
         lock.lock();
         Iterator<Map.Entry<K, Value<V>>> iterator = cache.entrySet().iterator();
         long minTimeToStay = System.currentTimeMillis() - timoutMilli;

         while (iterator.hasNext()) {
            Map.Entry<K, Value<V>> next = iterator.next();
            long insertedTime = next.getValue().getTimstamp();

            if (insertedTime <= minTimeToStay) {
               iterator.remove();
            } else {
               break;
            }
         }

         lock.unlock();
      };
      scheduledExecutorService.scheduleAtFixedRate(cleaner, timoutSec, 1, TimeUnit.SECONDS);
   }

   @Override
   public void put(K key, V value) {
      lock.lock();
      cache.put(key, new Value<>(value));
      lock.unlock();
   }

   @Override
   public V get(K key) {
      V val = null;
      lock.lock();
      Value<V> value = cache.remove(key);

      if (value != null) {
         value.updateTime();
         val = value.getValue();
      }
      lock.unlock();

      return val;
   }

   @Override
   public V remove(K key) {
      lock.lock();
      Value<V> remove = cache.remove(key);
      lock.unlock();

      return remove != null ? remove.getValue() : null;
   }

   private static final class Value<V> {
      private long timstamp;
      private final V value;

      private Value(V value) {
         updateTime();
         this.value = value;
      }

      public long getTimstamp() {
         return timstamp;
      }

      public V getValue() {
         return value;
      }

      void updateTime() {
         this.timstamp = System.currentTimeMillis();
      }
   }
}

interface ICache<K, V> {
   void put(K key, V value);

   V get(K key);

   V remove(K key);
}
