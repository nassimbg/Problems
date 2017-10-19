public class SetMatrixZeroes {
   public static void setZeroes(int[][] matrix) {

      boolean rowZeroIsZero = false;
      boolean columnZeroIsZero = false;
      for (int row = 0; row < matrix.length; row++) {
         for (int column = 0; column < matrix[0].length; ++column) {
            if (matrix[row][column] == 0) {
               rowZeroIsZero |= row == 0;
               columnZeroIsZero |= column == 0;
               matrix[0][column] = 0;
               matrix[row][0] = 0;
            }
         }
      }

      for (int row = 1; row < matrix.length; row++) {
         for (int column = 0; matrix[row][0] == 0 && column < matrix[0].length; ++column) {
            matrix[row][column] = 0;
         }
      }

      for (int column = 1; column < matrix[0].length; column++) {
         for (int row = 0; matrix[0][column] == 0 && row < matrix.length; ++row) {
            matrix[row][column] = 0;
         }
      }

      for (int column = 0; rowZeroIsZero && column < matrix[0].length; ++column) {
         matrix[0][column] = 0;
      }

      for (int row = 0; columnZeroIsZero && row < matrix.length; ++row) {
         matrix[row][0] = 0;
      }

   }
}
