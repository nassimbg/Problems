import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CountingBitsTest {

   @Test
   public void countBits() {
      assertArrayEquals(new int[] { 0, 1, 1, 2, 1, 2 }, CountingBits.countBits(5));
   }

}