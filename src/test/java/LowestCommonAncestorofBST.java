import common.TreeNode;

public class LowestCommonAncestorofBST {
   public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

      TreeNode max = q;
      TreeNode min = p;
      if (p.val > q.val) {
         max = p;
         min = q;
      }

      TreeNode current = root;

      while(current != null && !(current.val >= min.val && current.val <= max.val)) {
         if (current.val > max.val) {
            current = current.left;
         } else {
            current = current.right;
         }
      }

      return current;

   }
}
