import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class WiggleSortIITest {

   @Test
   public void wiggleSort() {
      int[] nums = { 1, 5, 1, 1, 6, 4 };
      WiggleSortII.wiggleSort(nums);
      assertArrayEquals(new int[] {1,5,1,4,1,6}, nums);
   }

   @Test
   public void wiggleSort2() {
      int[] nums = {1, 3, 2, 2, 3, 1};
      WiggleSortII.wiggleSort(nums);
      assertArrayEquals(new int[] {2,3,1,3,1,2}, nums);
   }

   @Test
   public void wiggleSort3() {
      int[] nums = {};
      WiggleSortII.wiggleSort(nums);
      assertArrayEquals(new int[] {}, nums);
   }

   @Test
   public void wiggleSort4() {
      int[] nums = {1};
      WiggleSortII.wiggleSort(nums);
      assertArrayEquals(new int[] {1}, nums);
   }

   @Test
   public void wiggleSort5() {
      int[] nums = {5, 3};
      WiggleSortII.wiggleSort(nums);
      assertArrayEquals(new int[] {3,5}, nums);
   }

   @Test
   public void wiggleSort6() {
      int[] nums = {1,1,2,1,2,2,1};
      WiggleSortII.wiggleSort(nums);
      assertArrayEquals(new int[] {1,2,1,2,1,2,1}, nums);
   }



   @Test
   public void wiggleSort7() {
      int[] nums = {1,2,2,1,2,1,1,1,1,2,2,2};
      WiggleSortII.wiggleSort(nums);
      assertArrayEquals(new int[] {1,2,1,2,1,2,1,2,1,2,1,2}, nums);
   }

   @Test
   public void wiggleSort8() {
      int[] nums = {4,5,5,6};
      WiggleSortII.wiggleSort(nums);
      assertArrayEquals(new int[] {5,6,4,5}, nums);
   }

}