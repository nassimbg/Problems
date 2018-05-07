import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LineReflection {
   static boolean solve(int[][] points) {
      Map<Integer, List<Integer>> ysCombination = buildYsCombination(points);

      int reflectionLine = Integer.MAX_VALUE;

      //pay attention for a point on the reflection line
      for (List<Integer> sameLevelXs : ysCombination.values()) {
         sameLevelXs.sort(Comparator.naturalOrder());
         int start = 0;
         int end = sameLevelXs.size() - 1;

         while (start <= end) {
            int mid = (sameLevelXs.get(start) + sameLevelXs.get(end))>>1;

            if (reflectionLine != Integer.MAX_VALUE && reflectionLine != mid) {
               return false;
            }
            reflectionLine = mid;
            ++start;
            --end;
         }
      }

      return true;
   }

   private static Map<Integer, List<Integer>> buildYsCombination(int[][] points) {
      Map<Integer, List<Integer>> combineYs = new HashMap<>();

      for (int[] point : points) {
         combineYs.computeIfAbsent(point[1], k -> new ArrayList<>()).add(point[0]);
      }
      return combineYs;
   }
}
