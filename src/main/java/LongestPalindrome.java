public class LongestPalindrome {
   public static int longestPalindrome(String s) {

      // first 26 is for lower and second 26 is for upper
      char[] chars = new char[52];

      for (int index = 0; index < s.length(); index++) {
         char c = s.charAt(index);

         if (Character.isLowerCase(c)) {
            chars[c - 'a']++;
         } else {
            chars[c - 'A' + 26]++;
         }
      }

      boolean oddTake = false;
      int size = 0;
      for (char aChar : chars) {
         if (aChar > 0) {
            int evenValue = (aChar / 2) * 2;
            size += evenValue;

            if (!oddTake && aChar != evenValue) {
               oddTake = true;
               size++;
            }
         }
      }

      return size;

   }
}
