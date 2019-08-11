import static org.junit.Assert.*;

import org.junit.Test;

public class KdiffPairsInAnArrayTest {

   @Test
   public void findPairs() {
      assertEquals(0, KdiffPairsInAnArray.findPairs(new int[] {1,2,3,4,5}, -1));
   }
}