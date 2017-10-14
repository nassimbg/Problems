public class UniquePaths {

   public static int uniquePaths(int m, int n) {
      int[][] matrix = new int[m][n];
      matrix[m-1][n-1] = 1;

      for(int row = m - 1; row >= 0; --row) {
         for(int column = n - 1; column >= 0; --column) {
            if (column != n - 1) {
               matrix[row][column] += matrix[row][column + 1];
            }

            if (row != m - 1) {
               matrix[row][column] += matrix[row + 1][column];
            }

         }
      }

      return matrix[0][0];
   }
}
