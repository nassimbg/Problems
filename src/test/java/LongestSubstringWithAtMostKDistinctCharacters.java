public class LongestSubstringWithAtMostKDistinctCharacters {
   public static String findSubString(String s, int k) {

      if(s == null || s.isEmpty()) {
         return s;
      }

      int[] charsCount = new int[128];
      int distinctCount = 0;

      int bestStart = 0;
      int bestEnd = 0;

      int start = 0;
      int end = 0;

      while (start <= end && end < s.length()) {
         char c = s.charAt(end);

         if (charsCount[c] == 0 && distinctCount == k) {
            while (distinctCount == k) {
               if (--charsCount[s.charAt(start)] == 0) {
                  --distinctCount;
               }
               ++start;
            }
         } else {
            if (charsCount[c]++ == 0) {
               ++distinctCount;
            }
            if (end - start > bestEnd - bestStart) {
               bestStart = start;
               bestEnd = end;
            }
            ++end;
         }
      }

      return s.substring(bestStart, bestEnd + 1);
   }
}
