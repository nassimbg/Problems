import java.util.TreeSet;

public class MaxSumOfRectangleNoLargerThanK {
   public static int maxSumSubmatrix(int[][] matrix, int k) {
      if (matrix.length == 0 || matrix[0].length == 0) {
         return 0;
      }

      int maxSum = Integer.MIN_VALUE;

      int numberOfColumns = matrix[0].length;
      for (int column = 0; column < numberOfColumns; column++) {

         int[] sum = new int[matrix.length];
         for (int relativeColumn = column; relativeColumn < numberOfColumns; relativeColumn++) {
            for (int row = 0; row < matrix.length; row++) {
               sum[row] += matrix[row][relativeColumn];
            }

            TreeSet<Integer> tree = new TreeSet<>();
            int currentCum = 0;
            for(int currentSum : sum) {
               tree.add(currentCum);
               currentCum += currentSum;

               Integer lowerCumm = tree.ceiling(currentCum - k);

               if (lowerCumm != null && currentCum - lowerCumm <= k) {
                  maxSum = Math.max(maxSum, currentCum - lowerCumm);
               }
            }

         }
      }

      return maxSum;
   }
}
