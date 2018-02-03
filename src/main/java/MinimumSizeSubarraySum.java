public class MinimumSizeSubarraySum {
   public static int minSubArrayLen(int s, int[] nums) {
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
