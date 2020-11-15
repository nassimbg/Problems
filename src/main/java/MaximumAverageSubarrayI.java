public class MaximumAverageSubarrayI {

  public static double findMaxAverage(int[] nums, int k) {

    if (nums.length < k) {
      return 0;
    }
    final int[] cumSumArray = createCumSumArray(nums);

    double result = Integer.MIN_VALUE;
    for (int i = k - 1; i < nums.length; i++) {

      int start = i - k;

      int beginCum = 0;
      if (start >= 0) {
        beginCum = cumSumArray[start];
      }

      result = Math.max(result, (cumSumArray[i] - beginCum));
    }

    if (result == Integer.MIN_VALUE) {
      result = 0.0;
    }
    return result == 0 ? result : result/(k*1.00);
  }

  private static int[] createCumSumArray(final int[] nums) {
    int[] cumSum = new int[nums.length];

    int prev = 0;
    for (int i = 0; i < nums.length; i++) {
      prev = cumSum[i] = nums[i] + prev;
    }

    return cumSum;
  }
}
