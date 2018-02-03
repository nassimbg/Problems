import java.util.ArrayDeque;
import java.util.Deque;

import common.TreeNode;

public class BSTIterator {

   Deque<TreeNode> stack = new ArrayDeque<>();
   TreeNode current;
   public BSTIterator(TreeNode root) {
      current = root;
   }

   /** @return whether we have a next smallest number */
   public boolean hasNext() {
      return !stack.isEmpty() || current != null;
   }

   /** @return the next smallest number */
   public int next() {
      while(current != null) {
         stack.addLast(current);
         current = current.left;
      }

      current = stack.pollLast();
      int result = current.val;
      current = current.right;
      return result;
   }
}
