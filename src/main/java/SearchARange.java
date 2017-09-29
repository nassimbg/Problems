public class SearchARange {

   public static int[] searchRange(int[] nums, int target) {

      int min = minBinarySearch(nums, 0, nums.length - 1, target);
      int max = maxBinarySearch(nums, 0, nums.length - 1, target);

      if (min == -1 || max == -1) {
         max = Math.max(min, max);
         return new int[] {max, max};
      }

      return new int[] {min, max};
   }

   static int minBinarySearch(int [] nums, int start, int end, int target) {
      if(start<= end) {
         int mid = (start + end)/2;
          if (nums[mid] < target) {
             return minBinarySearch(nums, mid+1, end, target);
          }

         int value = minBinarySearch(nums, start, mid - 1, target);

          if (value != -1) {
             return value;
          }

          if (nums[mid] == target) {
             return mid;
          }
      }

      return -1;
   }


   static int maxBinarySearch(int [] nums, int start, int end, int target) {
      if(start<= end) {
         int mid = (start + end)/2;
         if (nums[mid] > target) {
            return maxBinarySearch(nums, start, mid - 1, target);
         }

         int value = maxBinarySearch(nums, mid+1, end, target);

         if (value != -1) {
            return value;
         }

         if (nums[mid] == target) {
            return mid;
         }
      }

      return -1;
   }
}
