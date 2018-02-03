import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import common.TreeNode;

public class BinaryTreePreorderTraversal {
   public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> result = new ArrayList<>();

      Stack<TreeNode> stack = new Stack<>();
      TreeNode current = root;

      while(!stack.isEmpty() || current != null) {
         while(current != null) {
            result.add(current.val);
            stack.push(current);
            current = current.left;
         }

         current = stack.pop();
         current = current.right;
      }

      return result;
   }
}
