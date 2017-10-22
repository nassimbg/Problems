import java.util.Arrays;

public class SearchInRotatedSortedArray {

   public static int search(int[] nums, int target) {

      if (nums.length <= 3) {
         for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
               return i;
            }
         }
         return -1;

      }
      int minPosition = minPosition(nums, 0, nums.length - 1);

      int position;
      if (target <= nums[nums.length - 1]) {
         position = Arrays.binarySearch(nums, minPosition, nums.length, target);
      } else {
         position = Arrays.binarySearch(nums, 0, minPosition, target);
      }

      return position < 0 ? -1 : position;
   }

   static int minPosition(int[] nums, int start, int end) {

      if (end - start +1 <= 3) {
         int minIndex = start;
         for (int i = start +1; i <= end; i++) {
            if (nums[i] < nums[minIndex]) {
               minIndex = i;
            }
         }
         return minIndex;

      }

      int middle = (start + end)/2;
      if (nums[middle] < nums[middle - 1]) {
         return middle;
      }
      if (nums[middle] > nums[end]) {
         return  minPosition(nums, middle + 1, end);
      }

      return minPosition(nums, start, middle - 1);
   }
}
