import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import common.TreeNode;

public class BinaryTreeInorderTraversal {
   public static List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> results = new ArrayList<>();
      inorderTraversalRec(root , results);

      return results;
   }

   private static void inorderTraversalRec(TreeNode root, List<Integer> results) {
      if (root != null) {
         inorderTraversalRec(root.left, results);
         results.add(root.val);
         inorderTraversalRec(root.right, results);
      }
   }


   public static List<Integer> inorderTraversalWithSet(TreeNode root) {
      List<Integer> results = new ArrayList<>();
      Set<TreeNode> visited = new HashSet<>();
      ArrayDeque<TreeNode> stack = new ArrayDeque<>();
      if (root != null) {
         stack.addLast(root);
      }
      while (!stack.isEmpty()) {
         TreeNode peekLast = stack.peekLast();

         TreeNode left = peekLast.left;
         if (left != null && !visited.contains(left)) {
            stack.addLast(left);
         } else {
            TreeNode treeNode = stack.pollLast();
            results.add(treeNode.val);
            visited.add(treeNode);
            if (treeNode.right != null) {
               stack.addLast(treeNode.right);
            }
         }

      }
      return results;
   }


   public static List<Integer> inorderTraversalWithOnlyStack(TreeNode root) {
      List<Integer> results = new ArrayList<>();

      if (root == null) {
         return results;
      }
      ArrayDeque<TreeNode> stack = new ArrayDeque<>();

      TreeNode current = root;
      stack.addLast(current);
      current = current.left;
      while (!stack.isEmpty()) {

         if (current == null) {
            TreeNode treeNode = stack.pollLast();
            results.add(treeNode.val);
            current = treeNode.right;
         }
         if (current != null) {
            stack.addLast(current);
            current = current.left;
         }
      }
      return results;
   }
}
