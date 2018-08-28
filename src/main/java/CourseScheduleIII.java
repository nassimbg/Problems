import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class CourseScheduleIII {
   public static int scheduleCourse(int[][] courses) {
      Arrays.sort(courses, new Comparator<int[]>() {
         @Override
         public int compare(int[] o1, int[] o2) {
            return o1[1] != o2[1] ? o1[1] - o2[1] : o1[0] - o2[0];
         }
      });
      TreeMap<Integer, Integer> coursesBestFinishingTime = new TreeMap<>();
      coursesBestFinishingTime.put(0, 0);

      int numberOfCourses = 0;

      for(int index = 0; index < courses.length; index++) {
         int[] course = courses[index];
         NavigableMap<Integer, Integer> coursesFinishedBefore = coursesBestFinishingTime.headMap(course[1] - course[0], true);

         Map<Integer, Integer> temp = new HashMap<>();
        for(Map.Entry<Integer, Integer> courseFinished : coursesFinishedBefore.entrySet()) {
           int tempMinCourses = courseFinished.getValue() + 1;
           numberOfCourses = Math.max(numberOfCourses, tempMinCourses);

           int newFinishingTime = courseFinished.getKey() + course[0];
           temp.put(newFinishingTime, Math.max(coursesBestFinishingTime.getOrDefault(newFinishingTime, -1), tempMinCourses));
        }

        coursesBestFinishingTime.putAll(temp);
      }

      return numberOfCourses;
   }
}
