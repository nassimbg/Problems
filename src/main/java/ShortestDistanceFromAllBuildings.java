import java.util.ArrayDeque;
import java.util.Deque;

public class ShortestDistanceFromAllBuildings {


   public static int shortestDistanceBFS(int[][] grid) {


      int numberOfOnes = 0;
      for (int row = 0; row < grid.length; row++) {
         for (int col = 0; col < grid[0].length; col++) {
            if (grid[row][col] == 1) {
               numberOfOnes++;
            }
         }
      }

      int minDistance = Integer.MAX_VALUE;

      for (int row = 0; row < grid.length; row++) {
         for (int col = 0; col < grid[0].length; col++) {
            if (grid[row][col] == 0) {
               minDistance = Math.min(minDistance, getShortest(grid,new boolean[ grid.length][ grid[0].length], row, col, numberOfOnes));
            }
         }
      }

      return minDistance;
   }

   private static int getShortest(int[][] grid, boolean[][] visited, int row, int col, int numberOfOnes) {
      Deque<Point> queue = new ArrayDeque<>();

      queue.addLast(new Point(row, col));
      int level = -1;
      int distance = 0;
      int reachableOnes = 0;
      while (!queue.isEmpty()) {

         int levelSize = queue.size();
         level++;

         for (int counter = 0; counter < levelSize; counter++) {
            Point point = queue.pollFirst();

            int currentRow = point.row;
            int currentCol = point.col;
            if (grid[currentRow][currentCol] == 1) {
               distance += level;
               reachableOnes++;
            }

            if (grid[currentRow][currentCol] == 0) {
               addPoint(grid, currentRow + 1, currentCol, queue, visited);
               addPoint(grid, currentRow - 1, currentCol, queue, visited);
               addPoint(grid, currentRow , currentCol + 1, queue, visited);
               addPoint(grid, currentRow , currentCol -1, queue, visited);
            }
         }
      }

      return reachableOnes == numberOfOnes ? distance : Integer.MAX_VALUE;
   }

   private static void addPoint(int[][] grid, int row, int col, Deque<Point> queue, boolean[][] visited) {
      if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] != 2 && !visited[row][col]) {
         visited[row][col] = true;
         queue.addLast(new Point(row, col));
      }
   }


   private static class Point {
      private final int row;
      private final int col;

      private Point(int row, int col) {
         this.row = row;
         this.col = col;
      }
   }



    /**
     * we should add also to check that an empty spot reaches all buildings
     * @param matrix
     * @return
     */
    public static int SolutionDFS(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;



        int shortestPath = Integer.MAX_VALUE;
        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int columnIndex = 0; columnIndex < columns; columnIndex++) {
                if (matrix[rowIndex][columnIndex] == 0) {
                    int[][] visited = new int[rows][columns];
                    visited[rowIndex][columnIndex] = Integer.MAX_VALUE;
                    int currentPath = getShortestPath(matrix, visited, rowIndex, columnIndex, 0);
                    if (currentPath != 0) {
                        shortestPath = Math.min(shortestPath, currentPath);
                    }
                }
            }
        }

        return shortestPath;
    }

    private static int getShortestPath(int[][] matrix, int[][] visited, int rowIndex, int columnIndex, int distance) {
        if (rowIndex >= matrix.length || rowIndex < 0 || columnIndex < 0 || columnIndex >= matrix[rowIndex].length || matrix[rowIndex][columnIndex] == 2) {
            return 0;
        }

        int previousDistance = visited[rowIndex][columnIndex];
        if (matrix[rowIndex][columnIndex] == 1) {
            int distanceToAdd = 0;

            if (previousDistance == 0 || distance < previousDistance) {
                visited[rowIndex][columnIndex] = distance;
                distanceToAdd = distance - previousDistance;
            }

            return distanceToAdd;
        }

        if (matrix[rowIndex][columnIndex] == 0 && (previousDistance == 0 || distance < previousDistance )) {
            if (previousDistance != Integer.MAX_VALUE) {
                visited[rowIndex][columnIndex] = distance;
            }

            int nextDistance = distance + 1;

            return getShortestPath(matrix, visited, rowIndex + 1, columnIndex, nextDistance) +
                    getShortestPath(matrix, visited, rowIndex - 1, columnIndex, nextDistance) +
                    getShortestPath(matrix, visited, rowIndex, columnIndex + 1, nextDistance) +
                    getShortestPath(matrix, visited, rowIndex, columnIndex - 1, nextDistance);
        }

        return 0;
    }
}
