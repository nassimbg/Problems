import common.TreeNode;

public class SumOfLeftLeaves {
   public static int sumOfLeftLeaves(TreeNode root) {
      return traverseLeaves(root, false);
   }


   private static int traverseLeaves(TreeNode root,  boolean isLeftChild) {
      if (root != null) {

         if (isLeftChild && root.left == null && root.right == null) {

            return root.val;
         }

         return traverseLeaves(root.left, true) + traverseLeaves(root.right, false);
      }

      return 0;
   }
}
