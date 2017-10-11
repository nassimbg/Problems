import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

   public static List<Integer> spiralOrder(int[][] matrix) {
      int numberOfRows = matrix.length;

      if (numberOfRows == 0) {
         return new ArrayList<>();
      }
      List<Integer> result = new ArrayList<>(numberOfRows * matrix[0].length);
      int level = 0;

      while(true) {
         ++level;

         // upper row
         for (int i = level -1; i <= matrix[0].length - level; ++i) {
            result.add(matrix[level -1][i]);
         }

         if(level -1 == numberOfRows - level || matrix[0].length - level == level -2) {
            return result;
         }
         // right column
         for (int i = level; i < numberOfRows - level; ++i) {
            result.add(matrix[i][matrix[0].length - level]);
         }

         // bottom row
         for (int i = matrix[0].length - level; i >= level -1 ; --i) {
            result.add(matrix[numberOfRows - level][i]);
         }

         if(level == numberOfRows - level || matrix[0].length - level == level -1) {
            return result;
         }

         // left column
         for (int i = numberOfRows - 1 - level; i>=level; --i) {
            result.add(matrix[i][level-1]);
         }

      }
   }
}
