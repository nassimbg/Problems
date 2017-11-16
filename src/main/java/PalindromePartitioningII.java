public class PalindromePartitioningII {

   public static int minCut3(String s) {
      char[] c = s.toCharArray();
      int n = c.length;
      int[] cut = new int[n];
      boolean[][] pal = new boolean[n][n];

      for (int i = 0; i < n; i++) {
         int min = i;
         for (int j = 0; j <= i; j++) {
            if (c[j] == c[i] && (j + 1 > i - 1 || pal[j + 1][i - 1])) {
               pal[j][i] = true;
               min = j == 0 ? 0 : Math.min(min, cut[j - 1] + 1);
            }
         }
         cut[i] = min;
      }
      return cut[n - 1];
   }

   /**
    * This is the the same as the solution for the palindrom but here is modified to accomodate for the DP problem that we have
    * So at every palindrom obtained even its in intermediate one (not largest) apply the DP conditions
    * @param s
    * @return
    */
   public static int minCut(String s) {
      int[] dp = new int[s.length()];
      int start = 0;
      int end = s.length() - 1;

      for (int i = 0; i < dp.length; i++) {
         dp[i] = i;
      }

      for (int index = start; index <= end; index++) {
         int left = index;
         int right = index;

         while (left >= start && right <= end && s.charAt(left) == s.charAt(right)) {
            dp[right] = left == 0 ? 0 : Math.min(dp[left - 1] + 1, dp[right]);

            --left;
            ++right;
         }
         ++left;
         --right;

         left = index;
         right = index + 1;


         while (left >= start && right <= end && s.charAt(left) == s.charAt(right)) {
            dp[right] = left == 0 ? 0 : Math.min(dp[left - 1] + 1, dp[right]);

            --left;
            ++right;
         }
         ++left;
         --right;
      }

      return dp[end];
   }
   public static int minCut1(String s) {
      int[][] dp = new int[s.length()][s.length()];

      int numberOfPartitions = minCutRec(dp, s, 0, s.length() - 1);
      return numberOfPartitions > 0 ? numberOfPartitions - 1 : 0;
   }
   public static int minCutRec(int[][] dp, String s, int start, int end) {
      if (end < start) {
         return 0;
      }

      if (dp[start][end] > 0) {
         return dp[start][end];
      }
      int minPartitions = Integer.MAX_VALUE;
      for (int index = start; index <= end; index++) {
         int left = index;
         int right = index;

         while (left >= start && right <= end && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
         }
         ++left;
         --right;

         int maxLeft = left;
         int maxRight = right;

         left = index;
         right = index + 1;

         while (left >= start && right <= end && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
         }
         ++left;
         --right;

         if (maxRight - maxLeft < right - left) {
            maxLeft  = left;
            maxRight = right;
         }

         int numberOfPartitions = 1 + minCutRec(dp, s, start, maxLeft - 1) + minCutRec(dp, s, maxRight + 1, end);

         if (numberOfPartitions < minPartitions) {
            minPartitions = numberOfPartitions;
         }
      }

      return dp[start][end] = minPartitions;
   }
}
