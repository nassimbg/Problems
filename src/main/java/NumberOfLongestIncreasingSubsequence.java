public class NumberOfLongestIncreasingSubsequence {

  public static int findNumberOfLIS(int[] nums) {

    int maxCount = 0;
    int maxSize = 0;

    int[][] dp = new int[nums.length][2];

    for (int index = 0; index < nums.length; index++) {
      dp[index][0] = 1;
      dp[index][1] = 1;
      for (int j = 0; j < index; j++) {
        if (nums[j] < nums[index] && dp[j][1] + 1 >= dp[index][1]){
          if (dp[j][1] + 1 > dp[index][1]) {
            dp[index][1] = dp[j][1] + 1;
            dp[index][0] = 0;
          }

          dp[index][0] += dp[j][0];
        }
      }

      if (dp[index][1] >= maxSize) {
        if (dp[index][1] > maxSize) {
          maxSize = dp[index][1];
          maxCount = 0;
        }
        maxCount += dp[index][0];
      }
    }

    return maxCount;
  }
}
