import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimeToBuyAndSellStockIIITest {
   @Test
   public void maxProfit() throws Exception {
      assertEquals(0, BestTimeToBuyAndSellStockIII.maxProfitWithFirstOptimization(new int[]{1}));
   }

   @Test
   public void maxProfit1() throws Exception {
      assertEquals(0, BestTimeToBuyAndSellStockIII.maxProfitWithFirstOptimization(new int[]{2, 1}));
   }

   @Test
   public void maxProfit2() throws Exception {
      assertEquals(1, BestTimeToBuyAndSellStockIII.maxProfitWithFirstOptimization(new int[]{1, 2}));
   }
}