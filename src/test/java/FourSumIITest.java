import static org.junit.Assert.*;

import org.junit.Test;

public class FourSumIITest {

   @Test
   public void fourSumCount() {
      assertEquals(17, FourSumII.fourSumCount(new int[] { 0, 1, -1 }, new int[] { -1, 1, 0 }, new int[] { 0, 0, 1 }, new int[] { -1, 1, 1 }));
   }
}