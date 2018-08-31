import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class NextGreaterElementIITest {

   @Test
   public void nextGreaterElements() {
      int[] arr = {1,2,1};

      int[] actual = NextGreaterElementII.nextGreaterElements(arr);

      assertArrayEquals(new int[]{2,-1,2}, actual);
   }

   @Test
   public void nextGreaterElements2() {
      int[] arr = {};

      int[] actual = NextGreaterElementII.nextGreaterElements(arr);

      assertArrayEquals(new int[]{}, actual);
   }
}