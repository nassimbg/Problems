public class MaximumSubarray {


   public static int maxSubArray(int[] nums) {

      if (nums.length == 0) {
         return 0;
      }
      int max = nums[nums.length - 1];
      for (int inverseIndex = nums.length - 2; inverseIndex >= 0; inverseIndex--) {
         nums[inverseIndex] = Math.max(nums[inverseIndex] + nums[inverseIndex + 1], nums[inverseIndex]);

         if (nums[inverseIndex] > max) {
            max = nums[inverseIndex];
         }
      }

      return max;
   }


   public static int maxSubArrayRecursive(int[] nums) {
         return maxArrayRec(nums, 0, nums.length - 1);
      }

      private static int maxArrayRec(int[] nums, int start, int end) {
         if (end  == start) {
            return nums[end];
         }

         int mid = (start + end)/2;

         int max = maxArrayRec(nums, start, mid);
         max = Math.max(max, maxArrayRec(nums, mid + 1, end));

         int localLeftMax = nums[mid];
         int localSum = nums[mid];
         for(int leftIterator = mid - 1; leftIterator >=start; --leftIterator) {
            localSum += nums[leftIterator];

            localLeftMax = Math.max(localSum, localLeftMax);
         }

         int localRightMax = nums[mid + 1];
         localSum = nums[mid + 1];
         for(int rightIterator = mid + 2; rightIterator <= end; ++rightIterator) {
            localSum += nums[rightIterator];

            localRightMax = Math.max(localSum, localRightMax);
         }

         int midMax = Math.max(localLeftMax + localRightMax, Math.max(localLeftMax, localRightMax));


         return Math.max(max, midMax);
      }
}
