import java.util.Arrays;

public class SearchInRotatedSortedArrayII {
   public static boolean search(int[] nums, int target) {

      if (nums.length == 0) {
         return false;
      }

      int minPosition = findMinimumPosition(nums, 0, nums.length - 1);

      int position;
      if(target <= nums[nums.length - 1]) {
         position = Arrays.binarySearch(nums, minPosition, nums.length, target);
      } else {
         position = Arrays.binarySearch(nums, 0, minPosition, target);
      }

      return position >=0;

   }

   private static int findMinimumPosition(int[] nums, int start, int end) {

      int mid = (start + end)/2;

      if (end <= start || (mid > start && nums[mid] < nums[mid - 1])) {
         return mid;
      }

      if (nums[mid] == nums[end]) {
         for (int index = start + 1; index <= end; index++) {
            if (nums[index] < nums[index - 1]) {
               return index;
            }
         }
         return start;
      }

      return nums[mid] > nums[end] ? findMinimumPosition(nums, mid + 1, end) : findMinimumPosition(nums, start, mid - 1);
   }

}
