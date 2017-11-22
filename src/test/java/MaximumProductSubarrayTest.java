import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumProductSubarrayTest {
   @Test
   public void maxProduct() throws Exception {
      assertEquals(6, MaximumProductSubarray.maxProduct(new int[] { 2, 3, -2, 4 }));
   }

   @Test
   public void maxProduct1() throws Exception {
      assertEquals(-1, MaximumProductSubarray.maxProduct(new int[] { -1 }));
   }

   @Test
   public void maxProduct2() throws Exception {
      assertEquals(-2, MaximumProductSubarray.maxProduct(new int[] { -2}));
   }


   @Test
   public void maxProduct3() throws Exception {
      assertEquals(0, MaximumProductSubarray.maxProduct(new int[] { 0}));
   }

   @Test
   public void maxProduct4() throws Exception {
      assertEquals(Integer.MIN_VALUE, MaximumProductSubarray.maxProduct(new int[] { Integer.MIN_VALUE}));
   }

   @Test
   public void maxProduct5() throws Exception {
      assertEquals(24, MaximumProductSubarray.maxProduct(new int[] { -2, 3,-4}));
   }

   @Test
   public void maxProduct6() throws Exception {
      assertEquals(12, MaximumProductSubarray.maxProduct(new int[] { -4,-3,-2}));
   }

   @Test
   public void maxProduct7() throws Exception {
      assertEquals(108, MaximumProductSubarray.maxProduct(new int[] { -1,-2,-9,-6}));
   }
}