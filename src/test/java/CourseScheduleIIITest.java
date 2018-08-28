import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CourseScheduleIIITest {

   @Test
   public void scheduleCourse() {
      int[][] courses = new int[][] {
        {5,5},{4,6},{2,6}
      };

      int course = CourseScheduleIII.scheduleCourse(courses);

      assertEquals(2, course);
   }

   @Test
   public void scheduleCourse2() {
      int[][] courses = new int[][] {
        {5,15},{3,19},{6,7},{2,10},{5,16},{8,14},{10,11},{2,19}
      };

      int course = CourseScheduleIII.scheduleCourse(courses);

      assertEquals(5, course);
   }

   @Test
   public void scheduleCourse3() {
      int[][] courses = new int[][] {
        {7,17},{3,12},{10,20},{9,10},{5,20},{10,19},{4,18}
      };

      int course = CourseScheduleIII.scheduleCourse(courses);

      assertEquals(4, course);
   }
}