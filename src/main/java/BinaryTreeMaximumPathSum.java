import static java.lang.Integer.MIN_VALUE;

import common.TreeNode;

public class BinaryTreeMaximumPathSum {

   int maxValue = MIN_VALUE;
   public int maxPathSum(TreeNode root) {
      maxPathSumRec(root);
      return maxValue;
   }

   private int maxPathSumRec(TreeNode root) {

      if (root != null) {
         int leftSum = maxPathSumRec(root.left);
         int rightSum = maxPathSumRec(root.right);

         int localMax = Math.max(root.val, Math.max(root.val + leftSum, root.val + rightSum));

         if (localMax > maxValue) {
            maxValue = localMax;
         }

         int maxSubTree = root.val + leftSum + rightSum;
         if (maxSubTree > maxValue) {
            maxValue = maxSubTree;
         }
         return localMax;
      }

      return 0;
   }
}
