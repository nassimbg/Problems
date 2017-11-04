import java.util.ArrayDeque;

import common.TreeNode;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
   public static TreeNode buildTree(int[] preorder, int[] inorder) {

      if (preorder.length == 0 || inorder.length == 0) {
         return null;
      }

      int preOrderCounter = 0;
      int inOrderCounter = 0;
      ArrayDeque<TreeNode> stack = new ArrayDeque<>();

      TreeNode root = new TreeNode(preorder[preOrderCounter]);
      TreeNode current = root;
      while (!stack.isEmpty() || current != null) {
         while (current != null) {
            stack.addLast(current);

            // This is to keep going to the leftest child
            // so we keep pushing to the stack until the pre order value == to the in order value
            if ((++preOrderCounter) < preorder.length && current.val != inorder[inOrderCounter]) {
               current.left = new TreeNode(preorder[preOrderCounter]);
               current = current.left;
            } else {
               current = null;
            }
         }

         current = stack.pollLast();
         ++inOrderCounter;

         // the next in order value of the current will be its parent (since its a left child) or its right child
         // so if the inorder[inOrderCounter] is not equals to the parent (which is the last one in the stack)
         // => the inorder[inOrderCounter] is definitely the right child of current
         if(preOrderCounter < preorder.length && (stack.isEmpty() || stack.peekLast().val != inorder[inOrderCounter])) {
            current.right = new TreeNode(preorder[preOrderCounter]);
            current = current.right;
         } else {
            current = null;
         }
      }

      return root;
   }
}
