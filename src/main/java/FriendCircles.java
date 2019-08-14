import common.UnionFind;

public class FriendCircles {


   /**
    * This implementation is done using Union-Find
    */
   public static int findCircleNumUnionFind(int[][] M) {
      UnionFind<Integer> unionFind = new UnionFind<>();
      for (int i = 0; i < M.length; i++) {
         unionFind.addSet(i);
      }

      for(int node = 0; node < M.length; node++) {
         for(int adjNode = 0; adjNode < M[node].length; adjNode++) {
            if (M[node][adjNode] == 1) {
               unionFind.union(node, adjNode);
            }
         }
      }

      return unionFind.numberOfDistjointSets();
   }

   /**
    * This implementation is done using a normal DFS with AdjMatrix
    */
   public static int findCircleNumDFS(int[][] M) {
      if (M.length == 0 || M[0].length == 0) {
         return 0;
      }

      int rows = M.length;

      boolean[] visited = new boolean[rows];

      int count = 0;
      for(int row = 0; row < rows; row++) {
         if (!visited[row]) {
            count++;

            visitDFS(M, visited, row);
         }
      }

      return count;
   }

   private static void visitDFS(int[][] M, boolean[] visited, int row) {
      if (row < 0 || row >= M.length ||  visited[row]) {
         return;
      }

      visited[row] = true;
      int[] adj = M[row];

      for (int neigh = 0; neigh < adj.length; neigh++) {
         if (M[row][neigh] == 1) {
            visitDFS(M, visited, neigh);
         }
      }
   }
}
