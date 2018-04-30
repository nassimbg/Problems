import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import common.Interval;

public class DataStreamAsDisjointIntervals {

   static class SummaryRanges {

      TreeSet<Interval> intervals;

      /**
       * Initialize your data structure here.
       */
      public SummaryRanges() {
         intervals = new TreeSet<>((i1, i2) -> i1.start - i2.start);
      }

      public void addNum(int val) {
         Interval interval = new Interval(val, val);

         Interval lower = intervals.lower(interval);
         Interval higher = intervals.higher(interval);

         if (lower != null) {

            if (lower.end >= val) {
               return;
            }
            if (lower.end == val - 1) {
               intervals.remove(lower);
               interval.start = lower.start;

            }
         }

         if (higher != null && higher.start == val + 1) {
            intervals.remove(higher);
            interval.end = higher.end;
         }

         intervals.add(interval);

      }

      public List<Interval> getIntervals() {
         return new ArrayList<>(intervals);
      }
   }
}
