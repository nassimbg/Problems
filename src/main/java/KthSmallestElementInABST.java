import java.util.ArrayDeque;
import java.util.Deque;

import common.TreeNode;

public class KthSmallestElementInABST {
   public int kthSmallest(TreeNode root, int k) {

      Deque<TreeNode> stack = new ArrayDeque<>();

      TreeNode current = root;

      int currentRank = 0;
      while (!stack.isEmpty() || current != null) {
         while (current != null) {
            stack.addLast(current);
            current = current.left;
         }

         current = stack.pollLast();
         if (++currentRank == k) {
            return current.val;
         }

         current = current.right;
      }

      return 0;



   }
}
