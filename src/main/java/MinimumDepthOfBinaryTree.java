import common.TreeNode;

public class MinimumDepthOfBinaryTree {
   public int minDepth(TreeNode root) {
      if (root != null) {
         int left = minDepth(root.left);
         int right = minDepth(root.right);

         return (left > 0 && right > 0 ? Math.min(left, right) : left + right) + 1;
      }
      return 0;
   }
}
