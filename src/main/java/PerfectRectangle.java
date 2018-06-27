import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class PerfectRectangle {
   public static boolean isRectangleCover(int[][] rectangles) {

      Comparator<int[]> comparator = (o1, o2) -> {

         if (o1[0] != o2[0]) {
            return o1[0] - o2[0];
         }

         if (o1[2] < 0 ^ o2[2] < 0) {
            return o1[2] - o2[2];
         }

         if (o1[1] != o2[1]) {
            return o1[1] - o2[1];
         }
         return o1[2] - o2[2];
      };

      PriorityQueue<int[]> queue = new PriorityQueue<>(comparator);
      TreeSet<int[]> availableSquares = new TreeSet<>(new Comparator<int[]>() {
         @Override
         public int compare(int[] o1, int[] o2) {
            return o1[1] - o2[1];
         }
      });

      for(int[] rec : rectangles) {
         int height = rec[3] - rec[1];

         // start point (x, y) and height
         // rec[0] = x
         // rec[1] = y
         // rec[2] = height
         queue.add(new int[] { rec[0], rec[1], height });
         queue.add(new int[] { rec[2], rec[1], -height });
      }


      int maxHeight = 0;

      final int[] firstEdge = queue.poll();
      availableSquares.add(firstEdge);

      int currentHeight = 0;
      int previousX = 0;

      if (firstEdge != null) {
         maxHeight = firstEdge[2];
         currentHeight = firstEdge[2];
         previousX = firstEdge[0];
      }

      while (!queue.isEmpty()) {
         int[] currentLine = queue.poll();
         int currentLineHeight = currentLine[2];
         int currentX = currentLine[0];

         if ((previousX != currentX && currentHeight != maxHeight) ||  currentHeight > maxHeight) {
            return false;
         }

         if (currentLineHeight > 0) {


            int[] ceiling = availableSquares.ceiling(currentLine);
            int[] floor = availableSquares.floor(currentLine);

            if (doIntervalsIntersect(ceiling, currentLine) || doIntervalsIntersect(floor, currentLine)) {
               return false;
            }

            availableSquares.add(currentLine);
            currentHeight += currentLineHeight;

         } else {
            availableSquares.remove(currentLine);
            currentHeight += currentLineHeight;
         }

         if (currentX == firstEdge[0]) {
            maxHeight += currentLineHeight;

         }

         previousX = currentX;
      }

      return currentHeight == 0;
   }

   private static boolean doIntervalsIntersect(int[] first, int[] second) {
      return first != null && second != null && (doIntervalFirstIntersectSecond(first, second) || doIntervalFirstIntersectSecond(second, first));
   }

   private static boolean doIntervalFirstIntersectSecond(int[] first, int[] second) {
      return first[1] <= second[1] && first[1] + first[2] > second[1];
   }
}
