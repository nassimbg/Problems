import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Created by nboughannam on 6/5/2017.
 */
public class TwoSumTest {
   @Test
   public void twoSum() throws Exception {
      int[] actualArray = new TwoSum().twoSum(new int[] { 3, 3 }, 6);

      assertArrayEquals(new int[] { 0, 1 },actualArray);
   }
}
