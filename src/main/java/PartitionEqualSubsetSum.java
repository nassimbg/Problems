public class PartitionEqualSubsetSum {
   public static boolean canPartition(int[] nums) {
      int sum = 0;
      for(int number : nums) {
         sum += number;
      }

      if (sum % 2 == 1) {
         return false;
      }

      int halfSum = sum /2;

      boolean[] dp = new boolean[halfSum + 1];
      dp[0] = true;

      for(int number : nums) {
         for (int currentSum = halfSum; currentSum >= number; currentSum--) {
            dp[currentSum] |= dp[currentSum - number];
         }
      }

      return dp[dp.length - 1];
   }
}
