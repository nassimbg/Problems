import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency {
   public static String frequencySort(String s) {
      Map<Character, Integer> chars = new HashMap<>();

      for (int i = 0; i < s.length(); i++) {
         char c = s.charAt(i);

         int count = chars.getOrDefault(c, 0);
         chars.put(c, count + 1);
      }

      ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(chars.entrySet());
      entries.sort(new Comparator<Map.Entry<Character, Integer>>() {
         @Override
         public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
            return o2.getValue() - o1.getValue();
         }
      });

      StringBuilder str = new StringBuilder();
      for (Map.Entry<Character, Integer> entry : entries) {
         char c = entry.getKey();
         for (Integer i = 0; i < entry.getValue(); i++) {
            str.append(c);
         }
      }

      return str.toString();
   }
}
