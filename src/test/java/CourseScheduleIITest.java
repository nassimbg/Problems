import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CourseScheduleIITest {
   @Test
   public void findOrder() throws Exception {
      assertArrayEquals(new int[]{0, 1}, CourseScheduleII.findOrder(2, new int[][]{{1,0}}));
   }


}