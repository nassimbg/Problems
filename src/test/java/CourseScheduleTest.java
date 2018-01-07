import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CourseScheduleTest {
   @Test
   public void canFinish() throws Exception {
      assertTrue(CourseSchedule.canFinish(2, new int[][] { { 1, 0 } }));
   }

   @Test
   public void canFinish1() throws Exception {
      assertFalse(CourseSchedule.canFinish(2, new int[][] { { 1, 0 }, {0,1} }));
   }
}