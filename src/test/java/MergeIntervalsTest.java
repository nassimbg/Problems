import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import common.Interval;

public class MergeIntervalsTest {
   @Test
   public void merge() throws Exception {


      List<Interval> intervals = new ArrayList<>();
      intervals.add(new Interval(1,3));
      intervals.add(new Interval(2,6));
      intervals.add(new Interval(8,10));
      intervals.add(new Interval(15,18));

      MergeIntervals.merge(intervals);
   }

}