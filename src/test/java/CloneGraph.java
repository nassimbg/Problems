import java.util.HashMap;
import java.util.Map;

import common.UndirectedGraphNode;

public class CloneGraph {

   private final Map<UndirectedGraphNode, UndirectedGraphNode> cloner = new HashMap<>();
   public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {

      if (node == null) {
         return node;
      }
      UndirectedGraphNode clonedNode = cloner.get(node);
      if (clonedNode != null) {
         return clonedNode;
      }

      clonedNode = new UndirectedGraphNode(node.label);
      cloner.put(node, clonedNode);

      // pay attention for recursion
      for (UndirectedGraphNode neighbor : node.neighbors) {
         clonedNode.neighbors.add(cloneGraph(neighbor));
      }

      return clonedNode;
   }
}
