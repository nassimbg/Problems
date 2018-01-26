import common.TreeNode;

public class CountUnivalueSubtrees {

   int counter = 0;
   public int countUnivalSubtrees(TreeNode root) {
      isSubtreeUnival(root);
      return counter;
   }

   private boolean isSubtreeUnival(TreeNode root) {
      if (root != null) {

         boolean leftUnival = isSubtreeUnival(root.left);
         boolean rightUnival = isSubtreeUnival(root.right);

         if ((leftUnival && isSameValueAsChild(root, root.left) && rightUnival && isSameValueAsChild(root, root.right))) {
            ++counter;
            return true;
         }
         return false;
      }
      return true;
   }

   private boolean isSameValueAsChild(TreeNode parent, TreeNode child) {
      return child == null || parent.val == child.val;
   }
}
