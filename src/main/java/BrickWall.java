import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrickWall {
   public static int leastBricks(List<List<Integer>> wall) {
      Map<Integer, Integer> endToFreq = new HashMap<>();

      int maxCount = 0;
      for(List<Integer> row : wall) {
         int currentColumn = 0;

         for(int brickIndex = 0; brickIndex < row.size() - 1; brickIndex++) {
            currentColumn += row.get(brickIndex);
            int freqOnColumn = endToFreq.getOrDefault(currentColumn, 0);

            endToFreq.put(currentColumn, ++freqOnColumn);
            if (maxCount < freqOnColumn) {
               maxCount = freqOnColumn;
            }
         }
      }

      return wall.size() - maxCount;
   }
}
