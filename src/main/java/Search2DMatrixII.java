import java.util.Arrays;

public class Search2DMatrixII {




   public static boolean searchMatrix(int[][] matrix, int target) {
      return searchBasedOnRow(matrix, target, 0 , matrix.length - 1);
   }

   private static boolean searchBasedOnRow(int[][] matrix, int target, int start, int end) {
      if (start <= end) {
         int row = (end+start) >>> 1;
         int[] currentRow = matrix[row];

         if (currentRow[0] > target) {
            return searchBasedOnRow(matrix, target, start, row - 1);
         } else if (currentRow[currentRow.length - 1] < target) {
            return searchBasedOnRow(matrix, target, row + 1, end);
         } else {

            if (searchColumns(target, currentRow)) {
               return true;
            }

            return searchBasedOnRow(matrix, target, start, row - 1) || searchBasedOnRow(matrix, target, row + 1, end);
         }
      }
      return false;
   }

   private static boolean searchColumns(int target, int[] currentRow) {
      int columnStart = 0;
      int columnEnd = currentRow.length - 1;

      while (columnStart <= columnEnd) {
         int mid = (columnStart + columnEnd) >>> 1;

         if (currentRow[mid] == target) {
            return true;
         }

         if (currentRow[mid] > target) {
            columnEnd = mid - 1;
         } else {
            columnStart = mid + 1;
         }
      }
      return false;
   }

   public static boolean searchMatrix2(int[][] matrix, int target) {
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
