import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimeToBuyAndSellStockCoolDownTest {

   @Test
   public void maxProfit() {
      assertEquals(3, BestTimeToBuyAndSellStockCoolDown.maxProfit(new int[] {1, 2, 3, 0, 2}));
   }

}