public class DistinctSubsequences {
   public int numDistinct(String s, String t) {
      int[] dp = new int[s.length() + 1];
      for (int index = 0; index < s.length() + 1; index++) {
         dp[index] = 1;
      }

      int diagonalValue = dp[dp.length - 1];
      for (int indexT = t.length() - 1; indexT >= 0; indexT--) {
         for (int indexS = s.length(); indexS >= 0; indexS--) {
            int temp = dp[indexS];
            if (indexS == s.length()) {
               dp[indexS] = 0;
            } else {
               dp[indexS] = dp[indexS + 1];
               if (s.charAt(indexS) == t.charAt(indexT)) {
                  dp[indexS] += diagonalValue;
               }
            }
            diagonalValue = temp;
         }
      }

      return dp[0];
   }
}
