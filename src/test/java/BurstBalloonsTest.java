import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BurstBalloonsTest {

   @Test
   public void maxCoins() {
      assertEquals(167, BurstBalloons.maxCoins(new int[] { 3, 1, 5, 8 }));
   }

}