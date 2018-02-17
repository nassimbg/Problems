import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class WordPatternII {
   public static boolean wordPatternMatch(String pattern, String str) {
      return dfsMatch(pattern, 0, str, 0, new HashMap<>(), new HashSet<>());
   }

   private static boolean dfsMatch(String pattern, int startPatter, String str, int startStr, Map<Character, String> characterStringHashMap, Set<String> strings) {

      boolean reachedEndOfPattern = startPatter >= pattern.length();
      boolean reachedEndOfStr = startStr >= str.length();
      if (reachedEndOfPattern || reachedEndOfStr) {
         return reachedEndOfPattern && reachedEndOfStr;
      }

      char charAt = pattern.charAt(startPatter);
      String representingValueOfChar = characterStringHashMap.get(charAt);

      boolean currentMatches = false;
      for (int i = startStr + 1; i < str.length(); i++) {
         String currentRep = str.substring(startStr, i);

         if (representingValueOfChar == null && !strings.contains(currentRep)) {
            characterStringHashMap.put(charAt, currentRep);
            strings.add(currentRep);

            currentMatches = dfsMatch(pattern, startPatter + 1, str, i + 1, characterStringHashMap, strings);

            characterStringHashMap.remove(charAt);
            strings.remove(currentRep);
         } else if (Objects.equals(representingValueOfChar,currentRep)) {
            currentMatches = dfsMatch(pattern, startPatter + 1, str, i + 1, characterStringHashMap, strings);
         }

         if (currentMatches) {
            return true;
         }
      }

      return false;
   }
}

