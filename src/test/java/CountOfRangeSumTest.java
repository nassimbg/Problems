import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountOfRangeSumTest {

   @Test
   public void countRangeSum() {
      assertEquals(3, CountOfRangeSum.countRangeSum(new int[] { -2, 5, -1 }, -2, 2));
   }


   @Test
   public void countRangeSum2() {
      assertEquals(3, CountOfRangeSum.countRangeSum(new int[] {-2147483647,0,-2147483647,2147483647}
      ,-564
      ,3864));
   }
}