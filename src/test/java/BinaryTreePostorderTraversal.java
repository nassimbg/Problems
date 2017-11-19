import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import common.TreeNode;

public class BinaryTreePostorderTraversal {

   /**
    * you should know this algo by heart
    * Its the duality of PreOrder traversal
    * @param root
    * @return
    */
   public static List<Integer> postorderTraversal(TreeNode root) {
      LinkedList<Integer> result = new LinkedList<>();

      Stack<TreeNode> stack = new Stack<>();
      TreeNode current = root;

      while(!stack.isEmpty() || current != null) {
         while(current != null) {
            result.addFirst(current.val);
            stack.push(current);
            current = current.right;
         }

         current = stack.pop();
         current = current.left;
      }

      return result;
   }

   public static List<Integer> postorderTraversal1(TreeNode root) {
      List<Integer> result = new ArrayList<>();

      Deque<TreeNode> stack = new ArrayDeque<>();
      Deque<TreeNode> visitedButNodeOutputted = new ArrayDeque<>();
      TreeNode current = root;

      while(!stack.isEmpty() || current != null) {
         while(current != null && current != visitedButNodeOutputted.peek()) {
            stack.addLast(current);
            current = current.left;
         }

         current = stack.pollLast();
         if (visitedButNodeOutputted.peekLast() == current) {
            result.add(current.val);
            visitedButNodeOutputted.pollLast();
            current = null;
         } else if (current.right == null ) {
            result.add(current.val);
            current = current.right;
         } else {
            stack.addLast(current);
            visitedButNodeOutputted.addLast(current);
            current = current.right;
         }

      }

      return result;
   }
}
