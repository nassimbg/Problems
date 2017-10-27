import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortedArrayTest {
   @Test
   public void merge() throws Exception {
      int[] nums1 = { 0 };
      MergeSortedArray.merge(nums1, 0 , new int[]{1}, 1);
      assertArrayEquals(new int[]{1}, nums1);

   }

}