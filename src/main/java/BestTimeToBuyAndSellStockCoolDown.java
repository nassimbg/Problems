public class BestTimeToBuyAndSellStockCoolDown {
   public static int maxProfit(int[] prices) {

      if (prices.length ==0) {
         return 0;
      }

      int maxProfitAfterBuy = -prices[0];

      int maxProfitFromLastSell = 0;
      int profitMinus1 = 0;
      int profitMinus2 = 0;

      for (int i = 1; i < prices.length; i++) {
         int currentProfit = prices[i] + maxProfitAfterBuy;

         maxProfitFromLastSell = Math.max(maxProfitFromLastSell, profitMinus2);

         maxProfitAfterBuy = Math.max(maxProfitFromLastSell - prices[i], maxProfitAfterBuy);

         profitMinus2 = profitMinus1;
         profitMinus1 = currentProfit;
      }

      return Math.max(maxProfitFromLastSell, Math.max(profitMinus1, profitMinus2));
   }
}
