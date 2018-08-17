public class LongestRepeatingCharacterReplacement {
   public static int characterReplacement(String s, int k) {
      int left = 0;
      int right = -1;

      int[] chars = new int[26];

      int maxLength = 0;
      int currentK = 0;

      while(right < s.length() - 1 && left < s.length()) {
         int indexRightCharInAlpha = s.charAt(right + 1) - 'A';
         int currentPeakIndex = findPeakIndex(chars);
         boolean isRightCharMaxChar = currentPeakIndex == -1 || currentPeakIndex == indexRightCharInAlpha;

         if (k == currentK && !isRightCharMaxChar) {
            char leftChar = s.charAt(left++);

            chars[leftChar - 'A']--;
         } else {
            ++right;
            chars[indexRightCharInAlpha]++;
         }

         int windowLength = right - left + 1;
         int peakIndex = findPeakIndex(chars);
         currentK = peakIndex == -1 ? k : windowLength - chars[peakIndex];

         if (k >= currentK && right > left) {
            maxLength = Math.max(maxLength, windowLength);
         }
      }
      return maxLength;
   }


   private static int findPeakIndex(int[] chars) {

      int maxValue = 0;
      int bestIndex = -1;
      for (int index = 0; index < chars.length; index++) {

         if (maxValue < chars[index]) {
            bestIndex = index;
            maxValue = chars[index];
         }
      }

      return bestIndex;
   }
}
