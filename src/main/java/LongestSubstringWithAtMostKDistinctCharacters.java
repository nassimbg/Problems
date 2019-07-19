import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistinctCharacters {

   public static String longest(String s, int k) {
      if (s == null || s.isEmpty()) {
         return s;
      }

      Map<Character, Integer> chars = new HashMap<>();

      int bestLeft = 0;
      int bestRight = 0;

      int left = 0;
      int right = -1;

      while(right < s.length() - 1) {

         while(right < s.length() - 1 && chars.size() <= k) {
            char charAt = s.charAt(++right);

            int count = chars.getOrDefault(charAt, 0);
            chars.put(charAt, count + 1);
         }

         int temp = chars.size() > k ? right - 1 : right;
         if (temp - left > bestRight - bestLeft) {
            bestLeft = left;
            bestRight = temp;
         }

         while (left < right && chars.size() > k) {
            char charAt = s.charAt(left++);

            int decrementedCount = chars.getOrDefault(charAt, 0) - 1;
            if (decrementedCount == 0) {
               chars.remove(charAt);
            } else {
               chars.put(charAt, decrementedCount);
            }
         }
      }

      return s.substring(bestLeft, bestRight + 1);
   }

   static int lengthOfLongestSubstringTwoDistinct(String s, int k) {
      Map<Character, Integer> freq = new HashMap<>();
      int maxSize = 0;

      int start = 0;
      int end = 0;
      int length = s.length();
      while (start < length && end < length) {

         while (end < length && freq.size() <= k) {
            char c = s.charAt(end);

            int currentFreq = freq.getOrDefault(c, 0);
            freq.put(c, currentFreq + 1);

            if (freq.size() <= k) {
               maxSize = Math.max(maxSize, end - start + 1);
            }
            end++;
         }

         while (start < end && freq.size() > k) {
            char c = s.charAt(start++);
            int currentFreq = freq.get(c);

            if (currentFreq == 1) {
               freq.remove(c);
            } else {
               freq.put(c, currentFreq - 1);
            }
         }
      }

      return maxSize;
   }


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
