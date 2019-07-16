public class IslandPerimeter {
   public static int islandPerimeter(int[][] grid) {

      for (int row = 0; row < grid.length; ++row) {
         for (int column = 0; column < grid[0].length; ++column) {
            if (grid[row][column] == 1) {

               return backTrack(grid, new boolean[grid.length][grid[0].length], row, column);
            }
         }
      }

      return 0;
   }

   private static int backTrack(int[][] grid, boolean[][] visited, int x, int y) {

      if (visited[x][y]) {
         return 0;
      }

      visited[x][y] = true;
      int myParam = 0;

      // check up
      if (x - 1 < 0 || grid[x-1][y] == 0) {
         myParam++;
      } else {
         myParam += backTrack(grid, visited, x-1, y);
      }


      // check down
      if (x + 1 >= grid.length || grid[x+1][y] == 0) {
         myParam++;
      } else {
         myParam += backTrack(grid, visited, x+1, y);
      }

      // check left
      if (y - 1 < 0 || grid[x][y-1] == 0) {
         myParam++;
      } else {
         myParam += backTrack(grid, visited, x, y-1);
      }

      // check right
      if (y + 1 >= grid[0].length || grid[x][y + 1] == 0) {
         myParam++;
      } else {
         myParam += backTrack(grid, visited, x, y + 1);
      }
      return myParam;
   }
}
