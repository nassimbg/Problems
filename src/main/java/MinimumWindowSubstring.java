import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {


   public static String minWindow(String s, String t) {
      Map<Character, Integer> countPerCharT = new HashMap<>();

      for (int i = 0; i < t.length(); i++) {
         char key = t.charAt(i);
         int count = countPerCharT.getOrDefault(key, 0);
         countPerCharT.put(key, count + 1);
      }

      Map<Character, Integer> countPerCharS = new HashMap<>();
      int distinctCount = 0;
      int left = 0;
      int right = -1;

      int bestLeft = 0;
      int bestRight = Integer.MAX_VALUE;

      while (right < s.length() - 1) {
         while (right < s.length() - 1 && distinctCount < countPerCharT.size()) {
            char c = s.charAt(++right);

            int countInT = countPerCharT.getOrDefault(c, 0);
            if (countInT > 0) {
               int countInS = countPerCharS.getOrDefault(c, 0) + 1;
               countPerCharS.put(c, countInS);

               if (countInS == countInT) {
                  distinctCount++;
               }
            }
         }

         if (distinctCount == countPerCharT.size()) {
            if (bestRight - bestLeft > right - left) {
               bestLeft = left;
               bestRight = right;
            }
         }

         boolean passedInLeft = false;
         while (left <= right && distinctCount == countPerCharT.size()) {
            passedInLeft = true;
            char c = s.charAt(left++);

            int countInT = countPerCharT.getOrDefault(c, 0);
            if (countInT > 0) {
               int countInS = countPerCharS.getOrDefault(c, 0);
               if (countInS == countInT) {
                  distinctCount--;
               }

               countPerCharS.put(c, countInS - 1);
            }
         }

         if (passedInLeft && distinctCount + 1 == countPerCharT.size()) {
            if (bestRight - bestLeft > right - (left - 1)) {
               bestLeft = left - 1;
               bestRight = right;
            }
         }
      }



      if (bestRight == Integer.MAX_VALUE) {
         bestRight = 0;
      } else if (bestRight < s.length()) {
         bestRight++;
      }

      return s.substring(bestLeft,  bestRight);
   }

   public static String minWindow2(String s, String t) {

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
