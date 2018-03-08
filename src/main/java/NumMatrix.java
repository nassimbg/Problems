public class NumMatrix {

   private final int[][] sum;

   public NumMatrix(int[][] matrix) {
      int rowLength = matrix.length;
      int columnLength = rowLength == 0 ? 0 : matrix[0].length;

      sum = new int[rowLength][columnLength];

      for (int row = 0; row < rowLength; row++) {
         for (int column = 0; column < columnLength; column++) {

            sum[row][column] = matrix[row][column];

            if (row > 0) {
               sum[row][column] += sum[row - 1][column];

               if (column > 0) {
                  sum[row][column] -= sum[row - 1][column - 1];
               }
            }

            if (column > 0) {
               sum[row][column] += sum[row][column - 1];
            }
         }
      }

   }

   public int sumRegion(int row1, int col1, int row2, int col2) {

      int value = sum[row2][col2];

      if (row1 > 0) {
         value -= sum[row1 - 1][col2];
      }

      if (col1 > 0) {
         value -= sum[row2][col1 - 1];

         if (row1 > 0) {
            value += sum[row1 - 1][col1 - 1];
         }
      }

      return value;

   }
}
