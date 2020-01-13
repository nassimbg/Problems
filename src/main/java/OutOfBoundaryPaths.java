import java.util.Arrays;

public class OutOfBoundaryPaths {

   private static int mod = 7 + (int)Math.pow(10, 9);

   public static int findPaths(int m, int n, int N, int i, int j) {

      int[][][] memo = new int[m][n][N + 1];
      for(int[][] l:memo)
         for(int[] sl:l)
            Arrays.fill(sl,-1);
      return findPaths2(m, n, N, i, j, memo);
   }

   public static int findPaths2(int m, int n, int N, int i, int j, int[][][] dp) {

      if (isOutOfBound(m, n, i, j)) {
         return N >= 0 ? 1 : 0;
      }

      if (N == 0) {
         return 0;
      }

      if (dp[i][j][N] >= 0) {
         return dp[i][j][N];
      }

      int i1 = (findPaths2(m, n, N - 1, i + 1, j, dp) + findPaths2(m, n, N - 1, i, j + 1, dp)) % mod;
      int i2 = (i1 + findPaths2(m, n, N - 1, i, j - 1, dp)) % mod;
      int val = ((i2 + findPaths2(m, n, N - 1, i - 1, j, dp)) % mod);

      return dp[i][j][N] = val;

   }

   private static boolean isOutOfBound(int m, int n, int i, int j) {
      return j == -1 || j == n || i == -1 || i == m;
   }
}
