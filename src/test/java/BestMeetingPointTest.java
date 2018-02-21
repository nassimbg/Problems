import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestMeetingPointTest {

   @Test
   public void minTotalDistance() {
      int[][] grid = new int[][] {
        {1,0,0,0,1},
        {0,0,0,0,0},
        {0,0,1,0,0}
      };

      assertEquals(6, BestMeetingPoint.minTotalDistance(grid));
   }

   @Test
   public void minTotalDistance1() {
      int[][] grid = new int[][] {{1, 0, 1, 0, 1},
        {0, 1, 0, 0, 0},
        {0, 1, 1, 0, 0}};

      assertEquals(11, BestMeetingPoint.minTotalDistance(grid));
   }
}