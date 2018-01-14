public class ShortestPalindrome {
   public static String shortestPalindrome(String s) {

      if(s == null || s.isEmpty()) {
         return s;
      }

      int maxRight = 0;
      for (int index = 0; index < s.length(); index++) {

         maxRight = getMaxRight(s, maxRight, index, index);
         maxRight = getMaxRight(s, maxRight, index, index + 1);
      }

      return new StringBuilder(s.substring(maxRight + 1)).reverse().append(s).toString();
   }

   private static int getMaxRight(String s, int maxRight, int left, int right) {
      while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
         --left;
         ++right;
      }

      ++left;
      --right;
      if (left == 0) {
         maxRight = Math.max(maxRight, right);
      }
      return maxRight;
   }
}
