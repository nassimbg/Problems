import java.util.Arrays;

public class Search2DMatrixII {
   public static boolean searchMatrix(int[][] matrix, int target) {
      if (matrix.length == 0 || matrix[0].length == 0) {
         return false;
      }

      int lastRow = binarySearchOfLastPotentialRow(matrix, target);

      int firstRow = binarySearchOfFirstPotentialRow(matrix, target);

      if (matrix[lastRow][0] == target || matrix[firstRow][matrix[firstRow].length - 1] == target) {
         return true;
      }

      for (int i = firstRow; i <= lastRow; i++) {
         if (Arrays.binarySearch(matrix[i], target) >= 0) {
            return true;
         }
      }

         return false;

   }

   private static int binarySearchOfLastPotentialRow(int[][] matrix, int target) {
      int left = 0;
      int right = matrix.length - 1;

      while(left<= right) {
         int current = (left + right)/2;
         int currentValue = matrix[current][0];
         if (currentValue == target) {
            return current;
         }

         if (currentValue > target) {
            right = current - 1;
         } else {
            left = current + 1;
         }
      }
      return right >= 0 ? right : ++right;
   }

   private static int binarySearchOfFirstPotentialRow(int[][] matrix, int target) {
      int left = 0;
      int right = matrix.length - 1;

      while(left<= right) {
         int current = (left + right)/2;
         int currentValue = matrix[current][matrix[current].length - 1];
         if (currentValue == target) {
            return current;
         }

         if (currentValue > target) {
            right = current - 1;
         } else {
            left = current + 1;
         }
      }
      return left == 0? left : left-1;
   }
}
