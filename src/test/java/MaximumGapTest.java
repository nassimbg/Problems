import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumGapTest {
   @Test
   public void maximumGap() throws Exception {
      assertEquals(3, MaximumGap.maximumGap(new int[] { 3, 2, 4, 7, 5, 10 }));
   }


}