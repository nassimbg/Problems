import common.TreeNode;

public class InvertBinaryTree {
   public static TreeNode invertTree(TreeNode root) {

      if (root != null) {
         TreeNode temp = invertTree(root.left);
         root.left = invertTree(root.right);
         root.right = temp;
      }

      return root;
   }
}
