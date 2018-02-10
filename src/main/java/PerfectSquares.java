public class PerfectSquares {
   public static int numSquares(int n) {

      int[] dp = new int[n + 1];

      int sqrt = (int) Math.sqrt(n);
      for (int i = 1; i <= sqrt; i++) {
         int square = i*i;

         for (int j = 0; j<= n; j++) {

            if(square == 1) {
               dp[j] = j;
            } else {
               int diff = j - square;
               if (diff >=0) {
                  dp[j] = Math.min(dp[j], dp[diff] + 1);
               }
            }
         }
      }
      return dp[n];
   }



}
