public class LongestPalindromicSubstring {

   private int maxIndex = 0;
   private int minIndex = 0;


   public String longestPalindrome(String s) {
      int n = s.length();
      String res = null;

      boolean[][] dp = new boolean[n][n];

      for (int i = n - 1; i >= 0; i--) {
         for (int j = i; j < n; j++) {
            dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);

            if (dp[i][j] && (res == null || j - i + 1 > res.length())) {
               res = s.substring(i, j + 1);
            }
         }
      }

      return res;
   }

   //todo you can refactor the code
   public static String longestPalindrome1(String s) {

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
