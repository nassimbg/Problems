import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EvaluateDivision {
   public static double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
      Map<String, Map<String, Double>> adjMatrix = buildAdjMatrix(equations, values);

      double[] result = new double[queries.length];

      for (int i = 0; i < queries.length; i++) {

         String num = queries[i][0];
         String den = queries[i][1];

         result[i] = dfs(adjMatrix, new HashSet<>(), num, den);
      }

      return result;
   }

   private static Map<String, Map<String, Double>> buildAdjMatrix(String[][] equations, double[] values) {
      Map<String, Map<String, Double>> adjMatrix = new HashMap<>();

      for (int index = 0; index < equations.length; index++) {
         String num = equations[index][0];
         String den = equations[index][1];


         setAdjVerext(adjMatrix, num, den, values[index]);
         setAdjVerext(adjMatrix, den, num, 1/values[index]);
      }

      return adjMatrix;
   }

   private static void setAdjVerext(Map<String, Map<String, Double>> adjMatrix, String source, String destination, double cost) {
      Map<String, Double> adjListOfNum = adjMatrix.get(source);
      if (adjListOfNum == null) {
         adjListOfNum = new HashMap<>();
         adjMatrix.put(source, adjListOfNum);
      }

      adjListOfNum.put(destination, cost);
   }

   private static double dfs(Map<String, Map<String, Double>> adjMatrix, Set<String> visited, String source, String destination) {
      Map<String, Double> adjVertecies = adjMatrix.get(source);

      if (adjVertecies == null) {
         return -1.;
      }

      if (source.equals(destination)) {
         return 1.;
      }

      Double destinationCost = adjVertecies.get(destination);

      if (destinationCost != null) {
         return destinationCost;
      }

      visited.add(source);
      for(Map.Entry<String, Double> adjVertex : adjVertecies.entrySet()) {
         String key = adjVertex.getKey();
         if (!visited.contains(key)) {
            double costChildToDestination = dfs(adjMatrix, visited, key, destination);

            if (costChildToDestination > 0) {
               double costCurrentToDestination = adjVertex.getValue() * costChildToDestination;

               adjVertecies.put(destination, costCurrentToDestination);

               adjMatrix.get(destination).put(source, 1/costCurrentToDestination);
               return costCurrentToDestination;
            }
         }
      }

      return -1.;
   }
}
