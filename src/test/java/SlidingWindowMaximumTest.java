import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SlidingWindowMaximumTest {
   @Test
   public void maxSlidingWindow() throws Exception {
      assertArrayEquals(new int[]{3,3,5,5,6,7}, SlidingWindowMaximum.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3));
   }

   @Test
   public void maxSlidingWindow1() throws Exception {
      assertArrayEquals(new int[]{}, SlidingWindowMaximum.maxSlidingWindow(new int[]{}, 0));
   }
}