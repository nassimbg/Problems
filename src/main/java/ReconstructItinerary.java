import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReconstructItinerary {
   public static List<String> findItinerary(String[][] tickets) {
      Map<String, List<AdjNode>> adjList = new HashMap<>();
      for (String[] ticket : tickets) {
         adjList.computeIfAbsent(ticket[0], k -> new ArrayList<>()).add(new AdjNode(ticket[1]));
      }

      for (Map.Entry<String, List<AdjNode>> stringListEntry : adjList.entrySet()) {
         Collections.sort(stringListEntry.getValue(), Comparator.comparing(node -> node.value));
      }

      List<String> result = new ArrayList<>();
      result.add("JFK");
      dfs(adjList, result, tickets.length);

      return result;
   }

   private static boolean dfs(Map<String, List<AdjNode>> adjList, List<String> result, int totalTickets) {
      if (totalTickets == result.size() - 1) {
         return true;
      }

      String source = result.get(result.size() - 1);
      List<AdjNode> adjNodes = adjList.getOrDefault(source, Collections.emptyList());
      if (adjNodes.isEmpty()) {
         return false;
      }

      for (AdjNode adjNode : adjNodes) {
         if (!adjNode.taken) {
            adjNode.taken = true;
            result.add(adjNode.value);

            if (dfs(adjList, result, totalTickets)) {
               return true;
            }
            adjNode.taken = false;
            result.remove(result.size() - 1);
         }
      }

      return false;
   }

   private static final class AdjNode {
      String value;
      boolean taken;

      AdjNode(String value) {
         this.value = value;
         taken = false;
      }
   }
}
