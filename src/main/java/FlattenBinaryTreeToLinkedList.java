import common.TreeNode;

public class FlattenBinaryTreeToLinkedList {
   public void flatten(TreeNode root) {
      flattenRec(root);
   }

   TreeNode flattenRec(TreeNode root) {
      if (root != null) {
         TreeNode end = root;

         TreeNode leftEnd = flattenRec(root.left);
         TreeNode rightEnd = flattenRec(root.right);

         if (leftEnd != null) {
            leftEnd.right = root.right;
            root.right = root.left;
            end = leftEnd;
         }

         if (rightEnd != null) {
            end = rightEnd;
         }

         root.left = null;
         return end;
      }
      return null;
   }
}
