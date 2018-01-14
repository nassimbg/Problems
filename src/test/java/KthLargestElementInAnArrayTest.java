import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthLargestElementInAnArrayTest {
   @Test
   public void findKthLargest() throws Exception {
      assertEquals(5, KthLargestElementInAnArray.findKthLargest(new int[] { 3, 2, 1, 5, 6, 4}, 2));
   }

   @Test
   public void findKthLargest2() throws Exception {
      assertEquals(5, KthLargestElementInAnArray.findKthLargest(new int[] { 5}, 1));
   }
}