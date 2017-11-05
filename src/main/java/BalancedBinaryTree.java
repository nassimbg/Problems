import common.TreeNode;

public class BalancedBinaryTree {
   public boolean isBalanced(TreeNode root) {
      return isBalancedRec(root) != -1;
   }

   int isBalancedRec(TreeNode root) {

      if (root!= null) {
         int leftHeight = isBalancedRec(root.left);
         int rightHeight = isBalancedRec(root.right);

         if (leftHeight == -1 || rightHeight == -1) {
            return -1;
         }

         return Math.abs(leftHeight - rightHeight) <= 1 ? Math.max(leftHeight, rightHeight) + 1 : -1;
      }
      return 0;

   }
}
