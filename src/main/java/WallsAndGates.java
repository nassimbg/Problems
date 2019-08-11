import java.util.ArrayDeque;
import java.util.Deque;

import common.Point;

public class WallsAndGates {

   static void fillGridUsingBFS(int[][] grid) {

      for (int row = 0; row < grid.length; row++) {
         for (int col = 0; col < grid[0].length; col++) {
            if (grid[row][col] == Integer.MAX_VALUE) {
               grid[row][col] = fillEachEmptySpaceBFS(grid, row, col);
            }
         }
      }
   }

   private static int fillEachEmptySpaceBFS(int[][] grid, int row, int col) {
      Deque<Point> queue = new ArrayDeque<>();
      boolean[][] visited = new boolean[grid.length][grid[0].length];

      queue.addLast(new Point(row, col));
      visited[row][col] = true;

      int level = -1;

      while(!queue.isEmpty()) {
         int levelSize = queue.size();
         level++;
         for (int counter = 0; counter < levelSize; counter++) {
            Point point = queue.pollFirst();

            if (grid[point.x][point.y] == -1) {
               continue;
            }

            if (grid[point.x][point.y] == 0) {
               return level;
            }

            fill(grid, point.x + 1, point.y, visited, queue);
            fill(grid, point.x - 1, point.y, visited, queue);
            fill(grid, point.x , point.y + 1, visited, queue);
            fill(grid, point.x ,point.y - 1, visited, queue);
         }
      }
      return Integer.MAX_VALUE;
   }

   private static void fill(int[][] grid, int x, int y, boolean[][] visited, Deque<Point> queue) {
      if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && !visited[x][y]) {
         queue.addLast(new Point(x, y));
      }
   }

   static void fillGridUsingDFS(int[][] grid) {

      for (int row = 0; row < grid.length; row++) {
         for (int col = 0; col < grid[0].length; col++) {
            if (grid[row][col] == Integer.MAX_VALUE) {
               fillEachEmptySpaceDFS(grid, row, col);
            }
         }
      }
   }

   private static void fillEachEmptySpaceDFS(int[][] grid, int row, int col) {
      grid[row][col] = dfs(grid, row, col, 0, new boolean[grid.length][grid[0].length]);
   }

   private static int dfs(int[][] grid, int row, int col, int distance, boolean[][] visited) {
      int nearestGate = Integer.MAX_VALUE;

      if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length) {

         if (grid[row][col] == -1 || visited[row][col]) {
            return Integer.MAX_VALUE;
         }

         if (grid[row][col] == 0) {
            return distance;
         }

         visited[row][col] = true;

         int nextDistance = distance + 1;
         nearestGate = Math.min(nearestGate, dfs(grid, row + 1, col, nextDistance, visited));
         nearestGate = Math.min(nearestGate, dfs(grid, row - 1, col, nextDistance, visited));
         nearestGate = Math.min(nearestGate, dfs(grid, row , col + 1, nextDistance, visited));
         nearestGate = Math.min(nearestGate, dfs(grid, row , col - 1, nextDistance, visited));

         visited[row][col] = false;
      }

      return nearestGate;
   }
}
