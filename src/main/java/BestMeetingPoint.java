public class BestMeetingPoint {
   public static int minTotalDistance(int[][] grid) {
      int totalTravelDistance = 0;
      int[] rowCount = new int[grid.length];
      int[] columnCount = new int[grid[0].length];

      for (int row = 0; row < grid.length; row++) {
         for (int column = 0; column < grid[0].length; column++) {
            if (grid[row][column] == 1) {
               rowCount[row]++;
               columnCount[column]++;
               totalTravelDistance += (row + column);
            }
         }
      }

      int rightRowsCount = 0;
      for (int row = grid.length-1; row >= 0; row--) {
         rightRowsCount += rowCount[row];
      }

      int rightColumnsCount = 0;

      for (int column = grid[0].length - 1; column >=0; column--) {
         rightColumnsCount+= columnCount[column];
      }

      int minDistance = totalTravelDistance;
      int firstValueInCurrentRow = totalTravelDistance;
      int currentDistance = totalTravelDistance;
      int previousRowCount = 0;
      for (int row = 0; row < grid.length; row++) {
         if (row > 0) {
            currentDistance = firstValueInCurrentRow = firstValueInCurrentRow + previousRowCount - rightRowsCount;
         }

         previousRowCount += rowCount[row];
         rightRowsCount -= rowCount[row];
         int previousColumnCount = 0;
         int currentRightColumns = rightColumnsCount;
         for (int column = 0; column < grid[0].length; column++) {
            if (column > 0) {
               currentDistance = currentDistance + previousColumnCount - currentRightColumns;
            }

            previousColumnCount += columnCount[column];
            currentRightColumns -= columnCount[column];
            minDistance = Math.min(minDistance, currentDistance);
         }
      }

      return minDistance;
   }
}
