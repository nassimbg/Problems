public class MinimumWindowSubstring {

   public static String minWindow(String s, String t) {

      if (s == null || s.equals("") || t == null || t.equals("")) {
         return "";
      }

      int[] window = new int[128];
      boolean[] exist = new boolean[128];
      int distinctChars = 0;
      for (int index = 0; index < t.length(); ++index) {
         int charAt = t.charAt(index);

         ++window[charAt];
         exist[charAt] = true;
         if(window[charAt] == 1) {
            ++distinctChars;
         }
      }

      int numberOfDistinctCharsReachedFreq = 0;

      int startIndex = 0;
      int endIndex = -1;
      while (endIndex < s.length() - 1 && numberOfDistinctCharsReachedFreq < distinctChars) {
         int endIndexChar = s.charAt(++endIndex);

         if (exist[endIndexChar]) {
            int value = --window[endIndexChar];
            if (value == 0) {
               ++numberOfDistinctCharsReachedFreq;
            }
         }
      }

      if (numberOfDistinctCharsReachedFreq < distinctChars) {
         return "";
      }

      int bestStart = startIndex;
      int bestEnd = endIndex;

      while (true) {
         int charAtStart = s.charAt(startIndex);
         while(!exist[charAtStart] || window[charAtStart] != 0) {

            if (exist[charAtStart]) {
               ++window[charAtStart];
            }
            ++startIndex;
            charAtStart = s.charAt(startIndex);
         }

         if (endIndex - startIndex < bestEnd - bestStart) {
            bestEnd = endIndex;
            bestStart = startIndex;
         }

         if (endIndex == s.length() - 1) {
            return s.substring(bestStart, bestEnd + 1);
         }

         int charAtEndIndex = Integer.MIN_VALUE;

         while (endIndex < s.length() - 1 && charAtEndIndex != charAtStart) {
            charAtEndIndex = s.charAt(++endIndex);
            if(exist[charAtEndIndex]) {
               --window[charAtEndIndex];
            }
         }
      }
   }


}
