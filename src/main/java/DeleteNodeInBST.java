import common.TreeNode;

public class DeleteNodeInBST {

   public static TreeNode deleteNode(TreeNode root, int key) {
      if (root != null) {
         if (root.val == key) {
            if (root.left == null) {
               return root.right;
            }

            if (root.right == null) {
               return root.left;
            }

            TreeNode succ = findSucc(root);

            succ.right = deleteNode(root.right, succ.val);
            succ.left = root.left;

            root.left = null;
            root.right = null;
            return succ;
         } else {
            root.left = deleteNode(root.left, key);
            root.right = deleteNode(root.right, key);
         }
      }

      return root;
   }

   private static TreeNode findSucc(TreeNode root) {
      TreeNode parent = root;
      TreeNode curr = root.right;

      while (curr != null) {
         parent = curr;
         curr = curr.left;
      }

      return parent;
   }
}
