import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LFUCache {

   private final int capacity;
   private final Map<Integer, Integer> keyToOccurance;
   private final List<Map<Integer, Integer>> values;
   public LFUCache(int capacity) {
      this.capacity = capacity;
      this.keyToOccurance = new HashMap<>();
      this.values = new ArrayList<>();

   }

   public int get(int key) {
      int place = keyToOccurance.getOrDefault(key, -1);

      if (place == -1) {
         return -1;
      }

      Integer value = values.get(place).remove(key);
      ++place;
      keyToOccurance.put(key, place);
      if (values.size() > place) {
         values.get(place).put(key, value);
      } else {
         Map<Integer, Integer> current = new LinkedHashMap<>();
         current.put(key, value);
         values.add(current);
      }
      return value;

   }

   public void put(int key, int value) {

      if (capacity == 0) {
         return;
      }

      int place = get(key);
      if (place != -1) {
         values.get(keyToOccurance.get(key)).put(key, value);
      } else {
         if (capacity == keyToOccurance.size()) {
            for (int index = 0; index < values.size(); index++) {
               Iterator<Integer> iterator = values.get(index).keySet().iterator();
               if (iterator.hasNext()) {
                  keyToOccurance.remove(iterator.next());
                  iterator.remove();
                  break;
               }
            }
         }
            keyToOccurance.put(key, 0);

            if (values.isEmpty()) {
               values.add(new LinkedHashMap<>());
            }
            Map<Integer, Integer> current = values.get(0);
            current.put(key, value);
         }
      }


}
