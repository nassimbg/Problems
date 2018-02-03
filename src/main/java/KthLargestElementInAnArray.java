import java.util.Random;

public class KthLargestElementInAnArray {
   public static int findKthLargest(int[] nums, int k) {
      return quickSelect(nums, k, 0, nums.length - 1);
   }

   private static int quickSelect(int[] nums, int k, int start, int end) {

      int pivot = partition(nums, start, end);

      int pivotLargestRank = end - pivot + 1;
      if (pivotLargestRank == k) {
         return nums[pivot];
      }

      if (k < pivotLargestRank) {
         return quickSelect(nums, k, pivot + 1, end);
      }

      return quickSelect(nums, k - pivotLargestRank, start, pivot - 1);
   }

   private static int partition(int[] nums, int start, int end) {
      int pivot = new Random().nextInt(end - start + 1) + start;

      int pivotValue = nums[pivot];
      nums[pivot] = nums[end];
      nums[end] = pivotValue;

      int i = start;
      int j = end - 1;

      while(i<=j) {
         if (nums[i] > pivotValue && nums[j] <= pivotValue) {
            int swapper = nums[i];
            nums[i++] = nums[j];
            nums[j--] = swapper;

         } else {
            if(nums[j] > pivotValue) {
               --j;
            }

            if (nums[i] <= pivotValue) {
               ++i;
            }
         }
      }

      nums[end] = nums[i];
      nums[i] = pivotValue;
      return i;
   }
}
