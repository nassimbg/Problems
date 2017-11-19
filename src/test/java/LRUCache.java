import java.util.Iterator;
import java.util.LinkedHashMap;

public class LRUCache {

   private final int capacity;
   LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

   public LRUCache(int capacity) {
      this.capacity = capacity;
   }

   public int get(int key) {
      Integer value = map.remove(key);
      if (value == null) {
         return -1;
      }

      map.put(key, value);

      return value;
   }

   public void put(int key, int value) {
      Integer remove = map.remove(key);

      if(map.size() == capacity) {
         Iterator<Integer> iterator = map.keySet().iterator();
         iterator.next();
         iterator.remove();
      }
      map.put(key, value);
   }
}
