public class MaximalRectangle {

   /**
    * This problem is based on the idea of LargestRectangleInHistogram.
    * Where we iterate row by row, starting from the last row, and calculate for every column its current height (number of consecutive 1s from the previous rows for this column).
    * After that we calculate the maximum area we currently have with respect to this specific row.
    *
    * @param matrix of 1s and 0s
    * @return the maximum area inside the matrix
    */
   public static int maximalRectangle(char[][] matrix) {

      if(matrix.length == 0 || matrix[0].length == 0) {
         return 0;
      }

      int numberOfRows = matrix.length;
      int numberOfColumns = matrix[0].length;
      int[] dp = new int[numberOfColumns];

      for (int column = 0; column < numberOfColumns; ++column) {
         dp[column] = convertCharToInt(matrix[numberOfRows - 1][column]);
      }

      int maxArea = LargestRectangleInHistogram.largestRectangleArea(dp);

      for(int row = numberOfRows - 2; row >=0; --row) {
         for(int column = 0; column < numberOfColumns; ++column) {
            int value = convertCharToInt(matrix[row][column]);
            dp[column] = (1 + dp[column]) * value;
         }
         maxArea = Math.max( maxArea, LargestRectangleInHistogram.largestRectangleArea(dp));
      }

      return maxArea;
   }

   private static int convertCharToInt(char ch) {
      return ch - '0';
   }
}
