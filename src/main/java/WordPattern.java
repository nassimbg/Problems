import java.util.HashMap;
import java.util.Map;

public class WordPattern {
   public boolean wordPattern(String pattern, String str) {

      String[] split = str.split(" ");

      if (pattern.length() != split.length) {
         return false;
      }

      Map<Character, String> map = new HashMap<>();
      Map<String, Character> map2 = new HashMap<>();

      for (int i = 0; i < pattern.length(); i++) {
         char charAt = pattern.charAt(i);

         String word = split[i];

         if (!word.equals(map.computeIfAbsent(charAt, (k) -> word)) || charAt == map2.computeIfAbsent(word, (k) -> charAt)) {
            return false;
         }
      }

      return true;
   }
}
