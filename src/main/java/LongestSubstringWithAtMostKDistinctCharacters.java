import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistinctCharacters {


   public static String findSubString(String s, int k) {
      Map<Character, Integer> freq = new HashMap<>();

      int left = 0;
      int right = 0;

      int maxLength = 0;
      int currentLength= 0;

      int maxLeft = 0;

      while(left <= right && right < s.length() && left < s.length()) {

         while(freq.size() <= k && right < s.length()) {
            char currentRightChar = s.charAt(right++);
            int frequency = freq.getOrDefault(currentRightChar , 0);

            freq.put(currentRightChar , frequency + 1);
            currentLength++;
            if (freq.size()<=k && currentLength > maxLength) {
               maxLength = currentLength;
               maxLeft = left;
            }

         }

         while(freq.size() > k && left < s.length()) {
            char currentLeftChar = s.charAt(left++);
            int frequency = freq.get(currentLeftChar) - 1;

            if (frequency > 0) {
               freq.put(currentLeftChar, frequency - 1);
            } else {
               freq.remove(currentLeftChar);
            }
            currentLength--;
         }

         if (freq.size()<=k && currentLength > maxLength) {
            maxLength = currentLength;
            maxLeft = left;
         }
      }

      return s.substring(maxLeft, maxLength + maxLeft);
   }



   public static String findSubString2(String s, int k) {

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
