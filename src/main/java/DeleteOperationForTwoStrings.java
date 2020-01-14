public class DeleteOperationForTwoStrings {
   public static int minDistance(String word1, String word2) {
      if (word1 == null || word2 == null) {
         return 0;
      }

      int w1Length = word1.length();
      int w2Length = word2.length();
      int[] dp = new int[w1Length + 1];

      for (int col = w2Length; col >= 0; col--) {
         int previous = dp[w1Length];
         for (int row = w1Length; row >= 0; row--) {
            // dp(i,j) = dp(i, j+1) + 1
            int tempPrevious = dp[row];

            if (col < w2Length) {
               dp[row] = dp[row] + 1;
            } else {
               dp[row] = row == w1Length ? 0 : Integer.MAX_VALUE;
            }

            if (row < w1Length) {
               // dp(i,j) = dp(i + 1, j) + 1
               dp[row] = Math.min(dp[row], dp[row + 1] + 1);

               // dp(i,j) = dp(i + 1, j + 1)
               if (col < w2Length && word2.charAt(col) == word1.charAt(row)) {
                  dp[row] = Math.min(previous, dp[row]);
               }

            }
            previous = tempPrevious;
         }
      }

      return dp[0];
   }
}
