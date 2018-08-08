import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SplitArrayLargestSumTest {

   @Test
   public void splitArray() {
      assertEquals(18, SplitArrayLargestSum.splitArray(new int[] { 7, 2, 5, 10, 8 }, 2));
   }
}