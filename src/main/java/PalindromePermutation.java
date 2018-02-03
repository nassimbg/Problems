public class PalindromePermutation {
   public static boolean canPermutePalindrome(String s) {
      int freqChars = 0;

      int length = s.length();
      for (int index = 0; index < length; index++) {
        freqChars ^=1 << (s.charAt(index) - 'a');
      }

      int bitCount = Integer.bitCount(freqChars);

      boolean isEvenLength = length % 2 == 0;
      return isEvenLength && bitCount == 0 || (!isEvenLength && bitCount == 1);
   }
}
