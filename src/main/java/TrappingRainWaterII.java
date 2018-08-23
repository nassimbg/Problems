import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TrappingRainWaterII {

   public int trapRainWater(int[][] heightMap) {

      if (heightMap.length == 0 || heightMap[0].length == 0) {
         return 0;
      }

      int columnsLength = heightMap[0].length;
      List<Deque<PreferredMetrics>> queues = new ArrayList<>(columnsLength);
      int[] volumns = new int[columnsLength];

      for (int rowIndex = 0; rowIndex < heightMap.length; rowIndex++) {


         for (int columnIndex = 0; columnIndex < columnsLength; columnIndex++) {
            if (rowIndex == 0) {
               Deque<PreferredMetrics> queue = new ArrayDeque<>();
               queues.add(queue);
            }

            Deque<PreferredMetrics> columnQueue = queues.get(columnIndex);

            int minBorderHeight = heightMap[rowIndex][columnIndex];
            int volumnLost = 0;

            while (!columnQueue.isEmpty() && columnQueue.peekLast().minBorderHeight < minBorderHeight) {
//               heightMap[columnQueue.pollLast().][columnIndex]

            }
         }
      }


      return 0;
   }

   private static class PreferredMetrics {
      private final int minBorderHeight;
      private final int volumnLost;
      private final int borderBlockRowIndex;

      private PreferredMetrics(int minBorderHeight, int volumeLost, int borderBlockRowIndex) {
         this.minBorderHeight = minBorderHeight;
         this.volumnLost = volumeLost;
         this.borderBlockRowIndex = borderBlockRowIndex;
      }
   }
}
