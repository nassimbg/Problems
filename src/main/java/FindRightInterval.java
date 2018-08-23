import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import common.Interval;

public class FindRightInterval {
   public static int[] findRightInterval(Interval[] intervals) {

      List<Integer> indices = new ArrayList<>();
      for(int i = 0; i < intervals.length; ++i) {
         indices.add(i);
      }

      indices.sort(Comparator.comparingInt(i -> intervals[i].start));


      int[] result = new int[intervals.length];

      if (intervals.length > 0) {
         result[indices.get(intervals.length - 1)] = -1;
      }

      for(int index = intervals.length - 2; index >=0; --index) {
         Integer intervalIndex = indices.get(index);
         int startingIndex = Collections.binarySearch(indices, intervalIndex, (i1, i2) -> intervals[i1].start - intervals[i2].end);

         if (startingIndex < 1) {
            startingIndex = -startingIndex - 1;
         }

         result[intervalIndex] = startingIndex == intervals.length ? -1 : indices.get(startingIndex);

      }

      return result;
   }
}
