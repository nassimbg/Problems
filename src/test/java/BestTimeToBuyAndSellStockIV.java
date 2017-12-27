public class BestTimeToBuyAndSellStockIV {
   public int maxProfit(int k, int[] prices) {

      if (prices.length == 0) {
         return 0;
      }

      // for this part (k > len/2) check: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/solution/
      int len = prices.length;
      if (k>len/2){ // simple case
         int ans = 0;
         for (int i=1; i<len; ++i){
            ans += Math.max(prices[i] - prices[i-1],0);
         }
         return ans;
      }
      int[] dp = new int[prices.length];
      // for this part its te same as BestTimeToBuyAndSellStockIII
      for (int row = 0; row < k; row++) {
         int bestToBuy = - prices[0];
         int previousSell = dp[0];

         for (int col = 1; col < prices.length; col++) {
            int candidateBestBuy = previousSell - prices[col];
            previousSell = dp[col];
            dp[col] = Math.max(dp[col], Math.max( dp[col - 1], prices[col] + bestToBuy));

            bestToBuy = Math.max(bestToBuy, candidateBestBuy);
         }
      }

      return dp[prices.length - 1];
   }
}
