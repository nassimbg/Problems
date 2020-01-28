import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

   public String minWindow(String s, String t) {

      Map<Character, Integer> freqPerChar = new HashMap<>();
      int length = t.length();
      for (int index = 0; index < length; index++) {
         freqPerChar.compute(t.charAt(index), (k, v) -> v == null ? 1 : v + 1);
      }

      int totalNumberOfCharsNeeded = t.length();

      int bestLeft = 0;
      int bestRight = Integer.MAX_VALUE;

      int leftIndexS = 0;
      int rightIndexS = 0;
      int numberOfCharsTook = 0;
      Map<Character, Integer> currentCharsTook = new HashMap<>();

      int sLength = s.length();
      while (leftIndexS < sLength && rightIndexS < sLength) {

         while (rightIndexS < sLength && numberOfCharsTook < totalNumberOfCharsNeeded) {
            char c = s.charAt(rightIndexS);
            int freqInT = freqPerChar.getOrDefault(c, 0);

            if (freqInT != 0) {
               int freqInCurrent = currentCharsTook.getOrDefault(c, 0);
               currentCharsTook.put(c, freqInCurrent + 1);

               if (freqInCurrent < freqInT) {
                  numberOfCharsTook++;
               }
            }

            if (numberOfCharsTook == totalNumberOfCharsNeeded && (rightIndexS - leftIndexS) < (bestRight - bestLeft)) {
               bestRight = rightIndexS;
               bestLeft = leftIndexS;
            }
            rightIndexS++;
         }


         while (leftIndexS < sLength && leftIndexS <= rightIndexS && numberOfCharsTook == totalNumberOfCharsNeeded) {
            char c = s.charAt(leftIndexS++);
            int freqInT = freqPerChar.getOrDefault(c, 0);

            if (freqInT != 0) {
               int freqInCurrent = currentCharsTook.getOrDefault(c, 0);
               currentCharsTook.put(c, freqInCurrent - 1);

               if (freqInCurrent <= freqInT) {
                  numberOfCharsTook--;
               }
            }

            if (numberOfCharsTook == totalNumberOfCharsNeeded && (rightIndexS - 1 - leftIndexS) < (bestRight - bestLeft)) {
               bestRight = rightIndexS - 1;
               bestLeft = leftIndexS;
            }
         }

      }

      return bestLeft > bestRight || bestRight == Integer.MAX_VALUE ? "" : s.substring(bestLeft, bestRight + 1);
   }


   public static String minWindowStartingFromMinus1(String s, String t) {
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
}
