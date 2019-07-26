public class TargetSum {
   public static int findTargetSumWays(int[] nums, int S) {
      return dfs(nums, S, 0);
   }

   private static int dfs(int[] nums, int S, int index) {
      if (index == nums.length) {
         return S == 0 ? 1 : 0;
      } else {
         return dfs(nums, S - nums[index], index + 1) + dfs(nums, S + nums[index], index + 1);
      }
   }
}
