public class BestTimeToBuyAndSellStockIII {

   /**
    * @see <a href="https://discuss.leetcode.com/topic/4766/a-clean-dp-solution-which-generalizes-to-k-transactions">explanation</a>
    * @param prices
    * @return
    */
   public static int maxProfitWithFirstOptimization(int[] prices) {

      if (prices.length == 0) {
         return 0;
      }
      int transactions = 2;
      int[][] dp = new int[transactions + 1][prices.length];

      for (int row = 1; row < transactions + 1; row++) {
         int maxProfitWithBuyingStock = - prices[0];
         for (int i = 1; i < prices.length; i++) {
            dp[row][i] = Math.max(Math.max(dp[row - 1][i], dp[row][i - 1]), prices[i] + maxProfitWithBuyingStock);

            // this here is a very important step that we should pay attention cz instead of at every price in a row we
            // do a for loop to see when is it best to buy the current stock along the way we save the max value
            maxProfitWithBuyingStock = Math.max(maxProfitWithBuyingStock, dp[row - 1][i - 1] - prices[i]);
         }

      }
      return dp[transactions][prices.length - 1];
   }

   public int maxProfitWithNestedLoops(int[] prices) {
      int[][] dp = new int[3][prices.length + 1];

      dp[0][0] = 0;

      for (int row = 0; row < 3; row++) {
         int previousMax = 0;
         for (int i = 0; i < prices.length + 1; i++) {
            dp[row][i] = 0;
            if (row > 0) {
               dp[row][i] = dp[row - 1][i];
            }

            if (i > 0 && dp[row][i] < dp[row][i - 1]) {
               dp[row][i] = dp[row][i - 1];
            }

            for (int k = i - 1; k > 0 && row > 0; --k) {
               dp[row][i] = Math.max(dp[row][i], prices[i - 1] - prices[k - 1] + dp[row - 1][k - 1]);
            }
         }

      }
      return dp[2][prices.length];
   }
}
