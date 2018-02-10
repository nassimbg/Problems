import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PerfectSquaresTest {

   @Test
   public void numSquares() {
      assertEquals(3, PerfectSquares.numSquares(12));
   }

   @Test
   public void numSquares2() {
      assertEquals(2, PerfectSquares.numSquares(13));
   }
}