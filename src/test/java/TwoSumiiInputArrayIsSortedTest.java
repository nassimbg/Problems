import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSumiiInputArrayIsSortedTest {
   @Test
   public void twoSum() throws Exception {
      assertArrayEquals( new int[]{1,2}, TwoSumiiInputArrayIsSorted.twoSum(new int[]{2, 7, 11, 15}, 9));
   }

}