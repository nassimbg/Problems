import java.util.ArrayList;
import java.util.List;

public class CourseScheduleII {
   public static int[] findOrder(int numCourses, int[][] prerequisites) {
      boolean[][] adjMatrix = intializeAdjMatrix(numCourses, prerequisites);
      int[] status = new int[numCourses];

      List<Integer> result = new ArrayList<>();
      for (int vertex = 0; vertex < adjMatrix.length; ++vertex) {
         if (status[vertex] == 0) {
            if (!visitDFS(adjMatrix, status, vertex, result)) {
               return new int[0];
            }
         }
      }


      int[] resultArray = new int[numCourses];

      for (int i = 0; i < result.size(); i++) {
         resultArray[i] = result.get(i);
      }


      return resultArray;

   }

   private static boolean visitDFS(boolean[][] adjMatrix, int[] status, int vertex, List<Integer> result) {
      status[vertex] = 1;
      boolean[] adjVertices = adjMatrix[vertex];
      for (int adjVertex = 0; adjVertex < adjVertices.length; adjVertex++) {
         if (adjVertices[adjVertex] && ((status[adjVertex] == 0 && !visitDFS(adjMatrix, status, adjVertex, result)) || status[adjVertex] == 1)) {
            return false;
         }
      }

      result.add(vertex);

      status[vertex] = 2;

      return true;
   }

   private static boolean[][] intializeAdjMatrix(int numCourses, int[][] prerequisites) {
      boolean[][] adjMatrix = new boolean[numCourses][numCourses];

      for (int dep = 0; dep < prerequisites.length; dep++) {
         adjMatrix[prerequisites[dep][0]][prerequisites[dep][1]] = true;
      }
      return adjMatrix;
   }
}
