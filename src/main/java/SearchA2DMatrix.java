import java.util.Arrays;

public class SearchA2DMatrix {
   public static boolean searchMatrix(int[][] matrix, int target) {
      if (matrix.length == 0 || matrix[0].length == 0) {
         return false;
      }

      int relativePosition = binarySearchOnRows(matrix, target);

      relativePosition = Arrays.binarySearch(matrix[relativePosition], target);

      return relativePosition >= 0;

   }

   private static int binarySearchOnRows(int[][] matrix, int target) {
      int left = 0;
      int right = matrix.length - 1;

      while (left <= right) {
         int mid = (left + right)/2;
         int value = matrix[mid][0];
         if (value == target) {
            return mid;
         }

         if (value > target) {
            right = mid - 1;
         } else {
            left = mid + 1;
         }

      }
      return right >= 0 ? right : ++right;
   }
}
