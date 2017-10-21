public class RemoveDuplicatesfromSortedArray {

   public static int removeDuplicates(int[] nums) {

      if (nums.length == 0) {
         return 0;
      }

      int resultSize = 1;
      while(resultSize < nums.length && nums[resultSize - 1] < nums[resultSize]) {
         ++resultSize;
      }

      for (int index = resultSize + 1; index < nums.length; index++) {
         if(nums[index - 1] < nums[index]) {
            nums[resultSize++] = nums[index];
         }
      }

      return resultSize;
   }
}
