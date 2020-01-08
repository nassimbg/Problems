import static org.junit.Assert.*;

import org.junit.Test;

public class SubarraySumEqualsKTest {

   @Test
   public void subarraySum() {
      int count = SubarraySumEqualsK.subarraySum(new int[] { 1, 1, 1 }, 2);

      assertEquals(2, count);
   }
}