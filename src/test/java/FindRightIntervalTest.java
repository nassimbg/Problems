import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import common.Interval;

public class FindRightIntervalTest {

   @Test
   public void findRightInterval() {
      Interval[] intervals = { new Interval(3, 4), new Interval(2, 3), new Interval(1, 2) };

      int[] rightInterval = FindRightInterval.findRightInterval(intervals);

      assertArrayEquals(new int[]{-1,0,1},rightInterval);

   }
}