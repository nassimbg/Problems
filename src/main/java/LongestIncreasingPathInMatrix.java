public class LongestIncreasingPathInMatrix {
   public static int longestIncreasingPath(int[][] matrix) {

      if (matrix.length == 0) {
         return 0;
      }

      int[][] dp = new int[matrix.length][matrix[0].length];
      boolean[][] visited = new boolean[matrix.length][matrix[0].length];

      int max = 0;
      for (int row = 0; row < matrix.length; row++) {
         for (int column = 0; column < matrix[0].length; column++) {
            max = Math.max(max, dfs(row, column, matrix, dp, visited));
         }
      }

      return max;
   }

   private static int dfs(int row, int column, int[][] matrix, int[][] dp, boolean[][] visited) {

      if (visited[row][column]) {
         return 0;
      }

      if (dp[row][column] != 0) {
         return dp[row][column];
      }

      visited[row][column] = true;

      if (row + 1 < matrix.length && matrix[row + 1][column] > matrix[row][column]) {
         dp[row][column] = Math.max(dfs(row + 1, column, matrix, dp, visited), dp[row][column]);
      }

      if (row > 0 && matrix[row - 1][column] > matrix[row][column]) {
         dp[row][column] = Math.max(dfs(row - 1, column, matrix, dp, visited), dp[row][column]);
      }

      if (column + 1 < matrix[0].length && matrix[row][column + 1] > matrix[row][column]) {
         dp[row][column] = Math.max(dfs(row, column + 1, matrix, dp, visited), dp[row][column]);
      }

      if (column > 0 && matrix[row][column - 1] > matrix[row][column]) {
         dp[row][column] = Math.max(dfs(row, column - 1, matrix, dp, visited), dp[row][column]);
      }

      visited[row][column] = false;

      return ++dp[row][column];
   }
}
