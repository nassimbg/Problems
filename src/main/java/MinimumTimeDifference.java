import java.util.List;
import java.util.TreeSet;

public class MinimumTimeDifference {

   private static final int MAX_MINUTES = 24 * 60;

   public static int findMinDifference(List<String> timePoints) {
      TreeSet<Integer> times = new TreeSet<>();

      int minDiff = Integer.MAX_VALUE;

      for (String timePoint : timePoints) {
         int minutes = transformToMin(timePoint);

         Integer ceilingTime = times.ceiling(minutes);
         if (ceilingTime != null) {
            minDiff = Math.min(minDiff, ceilingTime - minutes);
         }

         if (!times.isEmpty()) {
            Integer last = times.last();
            if (last != null) {
               minDiff = Math.min(minDiff, (MAX_MINUTES + minutes) - last);
            }
         }

         Integer floorTime = times.floor(minutes);
         if (floorTime != null) {
            minDiff = Math.min(minDiff, minutes - floorTime);
         }

         if (!times.isEmpty()) {
            Integer first = times.first();
            if (first != null) {
               minDiff = Math.min(minDiff, (MAX_MINUTES + first) - minutes);
            }
         }


         times.add(minutes);
      }

      return minDiff;
   }

   private static int transformToMin(String timePoint) {
      String[] times = timePoint.split(":");

      return (Integer.parseInt(times[0]) * 60) + Integer.parseInt(times[1]);
   }
}
