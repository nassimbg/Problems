public class CoinChangeTwo {
   public static int change(int amount, int[] coins) {

      int[] dp = new int[amount + 1];
      dp[0] = 1;

      for (int coinIndex = coins.length - 1; coinIndex >= 0; coinIndex--) {
         for(int partialAmount = 1; partialAmount <= amount; partialAmount++) {
            if (partialAmount >= coins[coinIndex]) {
               dp[partialAmount] += dp[partialAmount - coins[coinIndex]];
            }
         }
      }

      return dp[amount];
   }
}
