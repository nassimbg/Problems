public class LongestPalindromicSubstring {

   //todo you can refactor the code
   public static String longestPalindrome(String s) {

      if(s == null || s.equals("")) {
         return "";
      }

      int startIndex = 0;
      int endIndex = 0;
      for (int index = 0; index < s.length(); index++) {

         int distance = 0;
         while(index - distance >= 0 && index + distance < s.length() && s.charAt(index - distance) == s.charAt(index + distance)) {
            ++distance;
         }
         --distance;

         if (endIndex - startIndex + 1 < 2*distance + 1) {
            startIndex = index - distance;
            endIndex = index + distance;
         }


         distance = 0;
         while(index - distance >= 0 && index + distance + 1< s.length() && s.charAt(index - distance) == s.charAt(index + distance + 1)) {
            ++distance;
         }

         if (endIndex - startIndex + 1 < 2*distance) {
            startIndex = index - (distance -1);
            endIndex = index + distance;
         }
      }

      return s.substring(startIndex, endIndex+ 1);

   }
}
