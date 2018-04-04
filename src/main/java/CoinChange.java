public class CoinChange {
   public static int coinChange(int[] coins, int amount) {
      int[] dp = new int[amount + 1];

      dp[0] = 1;

      for (int coinIndex = coins.length - 1; coinIndex >= 0; --coinIndex) {
         for (int currentAmount = 0; currentAmount <= amount; currentAmount++) {

            int diff = currentAmount - coins[coinIndex];
            if (diff >= 0) {
               int smallerAmount = dp[diff];
               if (smallerAmount > 0) {
                  dp[currentAmount] = dp[currentAmount] > 0 ? Math.min(dp[currentAmount], smallerAmount + 1) : smallerAmount + 1;
               }
            }
         }
      }

      return dp[amount] - 1;
   }
}
