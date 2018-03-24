public class LongestIncreasingSubsequence {
   public int lengthOfLIS(int[] nums) {

      int[] dp = new int[nums.length];
      int max = 0;

      for(int index = nums.length - 1; index >= 0; index--) {

         for (int i = index + 1; i < nums.length; i++) {

            if (nums[index] < nums[i]) {
               dp[index] = Math.max(dp[i], dp[index]);
            }
         }

         dp[index]++;

         max = Math.max(max, dp[index]);
      }

      return max;
   }
}
