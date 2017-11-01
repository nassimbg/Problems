import java.util.ArrayDeque;

import common.TreeNode;

public class ValidateBinarySearchTree {

   public static boolean isValidBST(TreeNode root) {
      ArrayDeque<TreeNode> stack = new ArrayDeque<>();

      TreeNode current = root;
      TreeNode prev = null;
      while (!stack.isEmpty() || current != null) {
         while (current != null) {
            stack.addLast(current);
            current = current.left;
         }

         current = stack.pollLast();
         if (prev != null && prev.val >= current.val) {
            return false;
         } else {
           prev = current;
         }
         current = current.right;
      }
      return true;
   }
}
