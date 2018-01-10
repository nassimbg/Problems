import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumSizeSubarraySumTest {
   @Test
   public void minSubArrayLen() throws Exception {
      assertEquals(2, MinimumSizeSubarraySum.minSubArrayLen(7, new int[] { 2, 3, 1, 2, 4, 3 }));
   }

}