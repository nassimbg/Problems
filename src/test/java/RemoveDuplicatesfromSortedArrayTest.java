import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveDuplicatesfromSortedArrayTest {
   @Test
   public void removeDuplicates() throws Exception {
      int[] nums = new int[] {1,1,2};
      assertEquals(2, RemoveDuplicatesfromSortedArray.removeDuplicates(nums));
   }

   @Test
   public void removeDuplicates1() throws Exception {
      int[] nums = new int[] {1};
      assertEquals(1, RemoveDuplicatesfromSortedArray.removeDuplicates(nums));
   }

   @Test
   public void removeDuplicates2() throws Exception {
      int[] nums = new int[] {};
      assertEquals(0, RemoveDuplicatesfromSortedArray.removeDuplicates(nums));
   }

}