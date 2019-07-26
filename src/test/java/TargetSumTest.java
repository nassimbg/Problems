import static org.junit.Assert.*;

import org.junit.Test;

public class TargetSumTest {

   @Test
   public void findTargetSumWays() {
      assertEquals(5, TargetSum.findTargetSumWays(new int[] { 1, 1, 1, 1, 1 }, 3));
   }
}