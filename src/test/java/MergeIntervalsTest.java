import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MergeIntervalsTest {
   @Test
   public void merge() throws Exception {


      List<MergeIntervals.Interval> intervals = new ArrayList<>();
      intervals.add(new MergeIntervals.Interval(1,3));
      intervals.add(new MergeIntervals.Interval(2,6));
      intervals.add(new MergeIntervals.Interval(8,10));
      intervals.add(new MergeIntervals.Interval(15,18));

      MergeIntervals.merge(intervals);
   }

}