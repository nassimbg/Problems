public class CourseSchedule {
   public static boolean canFinish(int numCourses, int[][] prerequisites) {

      int[][] adjMatrix = intializeAdjMatrix(numCourses, prerequisites);
      int[] statusOfVertex = new int[numCourses];

      for (int vertex = 0; vertex < numCourses; vertex++) {
         if (cycleFoundWhenDfsVisit(adjMatrix, statusOfVertex, vertex)) {
            return false;
         }
      }

      return true;
   }

   private static boolean cycleFoundWhenDfsVisit(int[][] adjMatrix, int[] statusOfVertex, int vertex) {
      if (statusOfVertex[vertex] == 0) {
         statusOfVertex[vertex] = 1;
         for (int adjVertex = 0; adjVertex < statusOfVertex.length; adjVertex++) {
            if (adjMatrix[vertex][adjVertex] == 1) {
               if (cycleFoundWhenVisitAdj(adjMatrix, statusOfVertex, adjVertex)) {
                  return true;
               }
            }
         }
         statusOfVertex[vertex] = 2;
      }
      return false;
   }

   private static boolean cycleFoundWhenVisitAdj(int[][] adjMatrix, int[] statusOfVertex, int adjVertex) {
      return statusOfVertex[adjVertex] == 1 || (statusOfVertex[adjVertex] == 0 && cycleFoundWhenDfsVisit(adjMatrix, statusOfVertex, adjVertex));
   }

   private static int[][] intializeAdjMatrix(int numCourses, int[][] prerequisites) {
      int[][] adjMatrix = new int[numCourses][numCourses];

      for (int i = 0; i < prerequisites.length; i++) {
         adjMatrix[prerequisites[i][0]][prerequisites[i][1]] = 1;
      }

      return adjMatrix;
   }

}
