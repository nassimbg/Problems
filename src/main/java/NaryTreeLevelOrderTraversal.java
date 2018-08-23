import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class NaryTreeLevelOrderTraversal {
   public List<List<Integer>> levelOrder(Node root) {

      List<List<Integer>> levelTraversal = new ArrayList<>();
      Deque<Node> queue = new ArrayDeque<>();

      addToQueue(queue,root);

      while(!queue.isEmpty()) {
         int sizeOfLevel = queue.size();
         List<Integer> currentLevel = new ArrayList<>();

         for(int count = 0; count < sizeOfLevel; ++count) {
            Node node = queue.pollFirst();

            if (node != null) {
               currentLevel.add(node.val);
               for(Node child : node.children) {
                  addToQueue(queue,child);
               }
            }
         }

         levelTraversal.add(currentLevel);
      }

      return levelTraversal;
   }

   private static void addToQueue(Deque<Node> queue, Node node ){
      if (node != null) {
         queue.addLast(node);
      }
   }

   class Node {
      public int val;
      public List<Node> children;

      public Node() {}

      public Node(int _val,List<Node> _children) {
         val = _val;
         children = _children;
      }
   };

}
