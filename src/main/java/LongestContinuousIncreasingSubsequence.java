public class LongestContinuousIncreasingSubsequence {

  public static int findLengthOfLCIS(int[] nums) {
    int max = 0;
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i == 0 || nums[i - 1] < nums[i]) {
        count++;
        max = Math.max(count, max);
      } else {
        count = 1;
      }
    }

    return max;
  }
}
