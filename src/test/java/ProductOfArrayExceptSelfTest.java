import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ProductOfArrayExceptSelfTest {
   @Test
   public void productExceptSelf() throws Exception {
      assertArrayEquals(new int[] { 24, 12, 8, 6 }, ProductOfArrayExceptSelf.productExceptSelf(new int[] { 1, 2, 3, 4 }));
   }


}