public class MinimumSizeSubarraySum {


   public static int minSubArrayLen(int s, int[] nums) {
      int bestLeft = 0;
      int bestRight = Integer.MAX_VALUE;

      int left = 0;
      int right = -1;
      int sum = 0;
      while(right < nums.length - 1) {

         while (right < nums.length - 1 && sum < s) {
            sum += nums[++right];
         }

         if (sum >= s) {
            if (bestRight - bestLeft > right - left) {
               bestRight = right;
               bestLeft = left;
            }
         }

         while (left <= right && sum >= s) {
            if (bestRight - bestLeft > right - left) {
               bestRight = right;
               bestLeft = left;
            }

            sum -= nums[left++];
         }
      }

      if (bestRight == Integer.MAX_VALUE) {
         bestRight = -1;
      }

      return bestRight - bestLeft + 1;
   }

   public static int minSubArrayLen2(int s, int[] nums) {
      int minLength = Integer.MAX_VALUE;
      int sum = 0;

      int start = 0;

      for (int i = 0; i < nums.length; i++) {
         sum += nums[i];

         while (sum>=s && start<=i) {
            minLength = Math.min(minLength, i - start + 1);
            sum = sum - nums[start++];
         }

      }

      return minLength == Integer.MAX_VALUE ? 0 : minLength;
   }
}
