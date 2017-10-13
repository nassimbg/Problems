import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import common.Interval;

public class InsertInterval {
   public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {

      if (intervals.isEmpty()) {
         return Arrays.asList(newInterval);
      }
      int startIndex = -2;
      int endIndex = -2;
      Interval validInterval = new Interval(newInterval.start, newInterval.end);

      for (int index = 0; index < intervals.size(); index++) {
         Interval interval = intervals.get(index);
         if (startIndex != -2 && validInterval.start <= interval.start && interval.start <= validInterval.end) {
            endIndex = index;
            updateValidInterval(validInterval, interval);
         }

         if (startIndex == -2 && (isAInB(validInterval, interval) || isAInB(interval, validInterval))) {
            startIndex = index;
            endIndex = index;

            updateValidInterval(validInterval, interval);
         }

      }

      List<Interval> mergedList = new ArrayList<>(intervals.size() - (endIndex - startIndex));

      int index = -1;
      while (index < intervals.size()) {

         if (index == startIndex) {
            mergedList.add(validInterval);
            index = endIndex;
         } else if (index > -1) {
            Interval interval = intervals.get(index);
            mergedList.add(interval);
         }

         ++index;
         if (startIndex == -2 && (index== intervals.size() || validInterval.end <= intervals.get(index).start)) {
            mergedList.add(validInterval);
            startIndex = -3;
         }
      }

      return mergedList;
   }

   private static boolean isAInB(Interval validInterval, Interval interval) {
      return interval.start <= validInterval.start && interval.end >= validInterval.start;
   }

   private static void updateValidInterval(Interval validInterval, Interval interval) {
      validInterval.start = Math.min(interval.start, validInterval.start);
      validInterval.end = Math.max(interval.end, validInterval.end);
   }
}
