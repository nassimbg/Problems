public class BestTimeToBuyAndSellStockCoolDown {

   public static int maxProfit(int[] prices) {
      int maxProfitMinus = 0;
      int maxProfit = 0;

      int maxProfitTillBuying = prices.length > 0 ? -prices[0] : 0;

      for (int index = 1; index < prices.length; index++) {
         int maxBuying = Math.max(maxProfitTillBuying, maxProfitMinus - prices[index]);

         maxProfitMinus = Math.max(maxProfitMinus, maxProfit);
         maxProfit = Math.max(maxProfit, maxProfitTillBuying + prices[index]);

         maxProfitTillBuying = maxBuying;
      }

      return maxProfit;
   }

   public static int maxProfit2(int[] prices) {

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
