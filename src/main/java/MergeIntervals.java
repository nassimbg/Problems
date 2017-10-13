import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import common.Interval;

public class MergeIntervals {

   public static List<Interval> merge(List<Interval> intervals) {
      List<Interval> result = new ArrayList<>();

      if (intervals.isEmpty()) {
         return result;
      }
      Comparator<Interval> comparator = Comparator.comparingInt(p -> p.start);
      intervals = intervals.stream().sorted(comparator.thenComparingInt(p -> p.end))
        .collect(Collectors.toList());

      result.add(intervals.get(0));

      for (int index = 1; index < intervals.size(); index++) {
         int lastIndex = result.size() - 1;
         Interval lastInterval = result.get(lastIndex);
         Interval currentInterval = intervals.get(index);
         if (lastInterval.end >= currentInterval.start && lastInterval.end < currentInterval.end) {
            result.set(lastIndex, new Interval(lastInterval.start, currentInterval.end));
         } else if(lastInterval.end < currentInterval.start) {
            result.add(currentInterval);
         }
      }

      return result;

   }

}
