public class LongestLineOfConsecutiveOneInMatrix {
   static int find(int[][] matrix) {

      if (matrix.length == 0 || matrix[0].length == 0) {
         return 0;
      }

      int max = 0;
      for (int row = 0; row < matrix.length; row++) {
         for (int col = 0; col < matrix[0].length; col++) {
            for (int direction = 0; direction < 8; direction++) {
               max = Math.max(max, findLongest(matrix, row, col, direction));
            }
         }
      }

      return max;
   }

   static int findLongest(int[][] matrix, int row, int col, int direction) {
      if (row >= 0 && col >= 0 && row < matrix.length && col < matrix[0].length && matrix[row][col] == 1) {

         int max = 0;

         if (direction == 0) {
            max = findLongest(matrix, row + 1, col, direction);
         }

         if (direction == 1) {
            max = findLongest(matrix, row, col + 1, direction);
         }

         if (direction == 4) {
            max = findLongest(matrix, row + 1, col + 1, direction);
         }

         if (direction == 7) {
            max = findLongest(matrix, row - 1, col + 1, direction);
         }

         return max + 1;
      } else {
         return 0;
      }
   }
}
