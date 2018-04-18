public class IntegerBreak {


   public static int integerBreak(int n) {

      int[] dp = new int[n + 1];
      if (n >=1) {
         dp[1] = 1;
         if (n >=2) {
            dp[2] = 1;
         }
      }
      for (int i = 2; i <= n; i++) {
         if (i >= 3) {
            dp[i] = Math.max(dp[i - 3] * dp[3], dp[i - 2] * dp[2]);
         }

         if (i < n) {
            dp[i] = Math.max(i, dp[i]);
         }
      }

      return dp[n];


   }

   public static int integerBreak2(int n) {

      int[] dp = new int[n + 1];
      dp[1] = 1;

      return dp(n, dp);
   }

   private static int dp(int n, int[] dp) {

      if (dp[n] != 0) {
         return dp[n];
      }
      dp[n] = n + 1 == dp.length ? 0 : n;
      for (int i = 1; i<=n/2; i++) {
         int val = n - i;
         dp[n] =  Math.max(dp(i,dp) * dp(val,dp), dp[n]);
      }

      return dp[n];
   }
}
