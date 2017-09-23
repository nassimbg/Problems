import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class NextPermutationTest {
   @Test
   public void nextPermutation() throws Exception {

      int[] nums = { 1, 2, 3 };
      NextPermutation.nextPermutation(nums);

      assertArrayEquals(new int[] {1,3,2}, nums);
   }

   @Test
   public void nextPermutation2() throws Exception {

      int[] nums = {3,2,1 };
      NextPermutation.nextPermutation(nums);

      assertArrayEquals(new int[] {1,2,3}, nums);
   }
   @Test
   public void nextPermutation3() throws Exception {

      int[] nums = {1,1,5 };
      NextPermutation.nextPermutation(nums);

      assertArrayEquals(new int[] {1,5,1}, nums);
   }

   @Test
   public void nextPermutation4() throws Exception {

      int[] nums = {1,3,2 };
      NextPermutation.nextPermutation(nums);

      assertArrayEquals(new int[] {2,1,3}, nums);
   }


   @Test
   public void nextPermutation5() throws Exception {

      int[] nums = {2,3,1,3,3 };
      NextPermutation.nextPermutation(nums);

      assertArrayEquals(new int[] {2,3,3,1,3}, nums);
   }

   @Test
   public void nextPermutation6() throws Exception {

      int[] nums = {2,1,2,2,2,2,2,1};
      NextPermutation.nextPermutation(nums);

      assertArrayEquals(new int[] {2,2,1,1,2,2,2,2}, nums);
   }
}