import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumSubarrayTest {
   @Test
   public void maxSubArray() throws Exception {

      assertEquals(6,MaximumSubarray.maxSubArrayRecursive(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
   }

}