public class DiagonalTraverse {
   public static int[] findDiagonalOrder(int[][] matrix) {
      int size = 0;

      if (matrix.length == 0 || matrix[0].length == 0) {
         return new int[size];
      }

      int rows = matrix.length;
      int columns = matrix[0].length;
      size = rows * columns;

      int[] result = new int[size];

      int count = 0;
      int row = 0;
      int col = 0;
      boolean upwards = true;
      while (count < size) {

         result[count++] = matrix[row][col];

         if (upwards) {
            if (row != 0 && col + 1 < columns) {
               row--;
               col++;
            } else {
               upwards = false;
               if (col + 1 == columns) {
                  row++;
               } else {
                  col++;
               }
            }
         } else {
            if (col != 0 && row + 1 < rows)  {
               col--;
               row++;
            } else {
               upwards = true;
               if (row + 1 == rows) {
                  col++;
               } else {
                  row++;
               }
            }

         }
      }

      return result;
   }
}
