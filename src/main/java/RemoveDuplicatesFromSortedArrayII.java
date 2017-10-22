public class RemoveDuplicatesFromSortedArrayII {
   public static int removeDuplicates(int[] nums) {

      int slow = 0;
      for (int fast = 0; fast < nums.length; fast++) {
         if (fast < 2 || nums[fast] != nums[slow - 2]) {
            nums[slow++] = nums[fast];
         }
      }

      return slow;
   }
}
