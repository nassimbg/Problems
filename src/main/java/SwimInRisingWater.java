import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class SwimInRisingWater {
   public static int swimInWater(int[][] grid) {
      PriorityQueue<Point> minQueue = new PriorityQueue<>(new Comparator<Point>() {
         @Override
         public int compare(Point o1, Point o2) {
            return o1.water - o2.water;
         }
      });

      for(int row = 0; row < grid.length; ++row) {

         for(int column = 0; column < grid[0].length; ++column) {
            int water = row == 0 && column == 0 ? grid[row][column] : Integer.MAX_VALUE;

            minQueue.add(new Point(row, column, water));
         }
      }

      while (!minQueue.isEmpty()) {
         Point minPoint = minQueue.poll();
         int x = minPoint.x;
         int y = minPoint.y;

         if (x == grid.length - 1 && y == grid[x].length - 1) {
            return minPoint.water;
         }


         update(grid, minQueue, x + 1, y, minPoint.water);
         update(grid, minQueue, x - 1, y, minPoint.water);
         update(grid, minQueue, x, y + 1, minPoint.water);
         update(grid, minQueue, x, y - 1, minPoint.water);
      }

      return 0;

   }

   private static void update(int[][] grid, PriorityQueue<Point> minQueue, int x, int y, int currentWater) {
      if (x >= 0 && x < grid.length && y >=0 && y<grid[x].length) {
         currentWater = Math.max(currentWater, grid[x][y]);

         Iterator<Point> p = minQueue.iterator();

         Point node = null;
         while(p.hasNext()) {
            Point temp = p.next();

            if (temp.x == x && temp.y == y) {

               if (temp.water > currentWater) {
                  node = temp;
                  p.remove();
               }

               break;
            }
         }

         if (node != null) {
            node.water = currentWater;
            minQueue.add(node);
         }

      }
   }

   private static class Point {
      private int water;
      private final int x;
      private final int y;

      private Point(int x, int y, int water) {
         this.x = x;
         this.y = y;
         this.water = water;
      }
   }
}
