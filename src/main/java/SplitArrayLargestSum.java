public class SplitArrayLargestSum {

   public static int splitArray(int[] nums, int m) {
      int[] dp = new int[nums.length];

      for (int numberOfArrays = 1; numberOfArrays <= m; numberOfArrays++) {

         for (int lastIndex = nums.length - 1; lastIndex >= numberOfArrays - 1 ; lastIndex--) {
            int cumulative = 0;
            int minValue = Integer.MAX_VALUE;
            for (int startOfLastArrayIndex = lastIndex; startOfLastArrayIndex >= numberOfArrays - 1; startOfLastArrayIndex--) {
               cumulative += nums[startOfLastArrayIndex];

               int previousValue = Integer.MIN_VALUE;
               if (startOfLastArrayIndex > 0) {

                  previousValue = numberOfArrays == 1 ? Integer.MAX_VALUE : dp[startOfLastArrayIndex - 1];
               }

               minValue = Math.min(Math.max(previousValue, cumulative), minValue);
            }

            dp[lastIndex] = minValue;
         }
      }

      return dp[nums.length - 1];
   }
}
