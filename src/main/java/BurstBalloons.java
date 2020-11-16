public class BurstBalloons {
   public static int maxCoins(int[] nums) {

      if(nums.length == 0)
         return 0;
      int[][] dp = new int[nums.length][nums.length];

      for (int left = nums.length - 1; left >= 0; left--) {
         for (int length = 1; length <= nums.length - left; length++) {
            int right = left + length - 1;

            int valueBeforeLeft = left == 0 ? 1 : nums[left -1];
            int valueAfterRight = right == nums.length - 1 ? 1 : nums[right + 1];


            for (int k = left ; k <= right; k++) {
               dp[left][right] = Math.max(dp[left][right],( k != left ? dp[left][k - 1] : 0) + (k != right ? dp[k + 1][right] : 0) + (valueAfterRight * valueBeforeLeft * nums[k]));
            }
         }
      }

      return dp[0][nums.length - 1];
   }
}
