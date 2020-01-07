public class ZeroOneMatrix {
   public static int[][] updateMatrix(int[][] matrix) {
      if (matrix.length == 0 || matrix[0].length == 0) {
         return new int[0][0];
      }

      int rows = matrix.length;
      int columns = matrix[0].length;
      int[][] result = new int[rows][columns];

      for (int row = 0; row < rows; row++) {
         for (int column = 0; column < columns; column++) {
            if (matrix[row][column] == 1) {
               boolean[][] dp = new boolean[rows][columns];
               result[row][column] = dfs(matrix, row, column, dp);
            }
         }
      }

      return result;
   }

   private static int dfs(int[][] matrix, int row, int column, boolean[][] result) {


      if (matrix[row][column] == 0) {
         return 0;
      }
      result[row][column] = true;

      int maxValue = Integer.MAX_VALUE;

      if (row > 0 && !result[row - 1][column]) {
         maxValue= Math.min(maxValue, dfs(matrix, row - 1, column, result) + 1);
      }

      if (row + 1 < matrix.length && !result[row + 1][column]) {
         maxValue = Math.min(maxValue, dfs(matrix, row + 1, column, result) + 1);
      }

      if (column > 0 && !result[row][column - 1]) {
         maxValue = Math.min(maxValue, dfs(matrix, row, column - 1, result) + 1);
      }

      if (column + 1 < matrix[0].length && !result[row][column + 1]) {
         maxValue = Math.min(maxValue, dfs(matrix, row, column + 1, result) + 1);
      }

      if (maxValue == Integer.MAX_VALUE) {
         maxValue = 0;
      }
      result[row][column] = false;
      return maxValue;
   }
}
