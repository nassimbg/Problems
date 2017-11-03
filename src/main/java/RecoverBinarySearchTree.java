import common.TreeNode;

public class RecoverBinarySearchTree {
   public void recoverTree(TreeNode root) {
      TreeNode first = null;
      TreeNode second = null;
      TreeNode pre = null;

      TreeNode current = root;

      while(current != null) {
         if(current.left == null) {
            if (pre != null && pre.val > current.val) {
               if (first == null) {
                  first = pre;
                  second = current;
               } else {
                  second = current;
               }
            }
            pre = current;
            current = current.right;
         } else {
            TreeNode predecessor = current.left;

            while(predecessor.right != current && predecessor.right != null) {
               predecessor = predecessor.right;
            }

            if (predecessor.right == null) {
               predecessor.right = current;
               current = current.left;
            } else {
               predecessor.right = null;
               if (pre != null && pre.val > current.val) {
                  if (first == null) {
                     first = pre;
                     second = current;
                  } else {
                     second = current;
                  }
               }
               pre = current;
               current = current.right;
            }
         }
      }

      if (first != null && second != null) {
         int temp = first.val;
         first.val = second.val;
         second.val = temp;
      }
   }

}
