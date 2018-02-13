import common.TreeNode;

public class InorderSuccessorInBST {
   public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
      TreeNode best = null;
      TreeNode current;

      if (p.right != null) {
         current = p.right;

         while (current.left != null) {
            current = current.left;
         }
         best =  current;
      } else {
         current = root;

         while (!current.equals(p)) {
            if (current.val > p.val) {
               best = current;
               current = current.left;
            } else {
               current = current.right;
            }
         }
      }
      return best;
   }
}
