/*
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MinimumHeightTrees {
   public List<Integer> findMinHeightTrees(int n, int[][] edges) {
      List<List<Integer>> adjList = buildAdjList(n, edges);

   }

   private static List<List<Integer>> buildAdjList(int n, int[][] edges) {
      List<List<Integer>> adjList = new ArrayList<>(n);

      for (int i = 0; i < n; i++) {
         adjList.add(new LinkedList<>());
      }

      for (int[] edge : edges) {
         adjList.get(edge[0]).add(edge[1]);
         adjList.get(edge[1]).add(edge[0]);
      }


      return adjList;
   }
}
*/
