import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumSizeSubarraySumEqualsKTest {

   @Test
   public void summation() {
      assertEquals(4, MaximumSizeSubarraySumEqualsK.summation(new int[] { 1, -1, 5, -2, 3 }, 3));
   }
}