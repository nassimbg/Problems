import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoinChangeTest {

   @Test
   public void coinChange() {
      assertEquals(3, CoinChange.coinChange(new int[] { 1, 2, 5 }, 11));
   }

   @Test
   public void coinChange2() {
      assertEquals(-1, CoinChange.coinChange(new int[] { 2}, 3));
   }
}