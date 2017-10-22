import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveDuplicatesfromSortedArrayIITest {
   @Test
   public void removeDuplicates() throws Exception {
      int[] nums = new int[]{1,1,1,2,2,3};
      assertEquals(5, RemoveDuplicatesFromSortedArrayII.removeDuplicates(nums));
      assertArrayEquals(new int[]{1,1,2,2,3,3}, nums);
   }

   @Test
   public void removeDuplicates1() throws Exception {
      int[] nums = new int[]{1,1,2,2,3,3};
      assertEquals(6, RemoveDuplicatesFromSortedArrayII.removeDuplicates(nums));
      assertArrayEquals(new int[]{1,1,2,2,3,3}, nums);
   }


   @Test
   public void removeDuplicates2() throws Exception {
      int[] nums = new int[]{};
      assertEquals(0, RemoveDuplicatesFromSortedArrayII.removeDuplicates(nums));
      assertArrayEquals(new int[]{}, nums);
   }

   @Test
   public void removeDuplicates3() throws Exception {
      int[] nums = new int[]{1,1,1,1,1};
      assertEquals(2, RemoveDuplicatesFromSortedArrayII.removeDuplicates(nums));
      assertArrayEquals(new int[]{1,1,1,1,1}, nums);
   }


}