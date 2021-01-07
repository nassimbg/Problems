public class MaximumSumObtainedOfAnyPermutation {
  public static int maxSumRangeQuery(int[] nums, int[][] requests) {
    int mod = (int)Math.pow(10, 9) + 7;

    return maxSumRangeQueryRec(mod, nums, requests, new int[nums.length], 0, new boolean[nums.length]);
  }

  private static int maxSumRangeQueryRec(int mod, int[] nums, int[][] requests, int[] currentResult, int currentSize, boolean[] taken) {
    if (currentSize == nums.length) {
      int sum = 0;

      for (final int[] request : requests) {
        int sumOfFirstVal = request[0] > 0 ? currentResult[request[0] - 1] : 0;
        sum = (sum + (currentResult[request[1]] - sumOfFirstVal )) % mod;
      }

      return sum;

    } else {
      int max = Integer.MIN_VALUE;
      for (int index = 0; index < nums.length; index++) {
        if (!taken[index]) {
          currentResult[currentSize] = nums[index] % mod;

          if (currentSize > 0) {
            currentResult[currentSize] = (currentResult[currentSize] + currentResult[currentSize - 1]) % mod;
          }
          taken[index] = true;
          max = Math.max(max, maxSumRangeQueryRec(mod, nums, requests, currentResult, currentSize + 1, taken));
          taken[index] = false;
        }
      }

      return max;
    }
  }
}
