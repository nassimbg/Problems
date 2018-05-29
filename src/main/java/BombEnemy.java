public class BombEnemy {
   static int solution(char[][] grid) {
      int maxValue = 0;

      int numberOfRows = grid.length;
      if (numberOfRows == 0 || grid[0].length == 0) {
         return maxValue;
      }

      int numberOfColumns = grid[0].length;
      int[] columndp = new int[numberOfColumns];
      int[] rowDp = new int[numberOfColumns];
      // initiale value
      for (int row = -1; row < numberOfRows; row++) {
         int numberOfEnimies = 0;
         for (int column = 0; column < numberOfColumns; column++) {

            if(getOption(grid, row,column) == 'W') {
               int currentRow = row;
               columndp[column] = 0;
               while ((++currentRow) < numberOfRows && getOption(grid, currentRow,column) != 'W') {
                  if (getOption(grid, currentRow,column) == 'E') {
                     columndp[column]++;
                  }
               }
               numberOfEnimies = 0;
            } else if (getOption(grid, row,column) == 'E') {
               numberOfEnimies++;
            } else {
               rowDp[column] = numberOfEnimies;
            }
         }

         numberOfEnimies = 0;
         for (int column = numberOfColumns - 1; column >= 0; column--) {
            char option = getOption(grid, row, column);
            if (option == 'E') {
               numberOfEnimies++;
            } else if (option == 'W') {
               numberOfEnimies = 0;
            } else {
               rowDp[column] += numberOfEnimies;
               maxValue = Math.max(rowDp[column] + columndp[column], maxValue);
            }
         }

      }
      return maxValue;
   }

   private static char getOption(char[][] grid, int row, int column) {
      return  row >=0 && column >=0 ? grid[row][column] : 'W';
   }
}
