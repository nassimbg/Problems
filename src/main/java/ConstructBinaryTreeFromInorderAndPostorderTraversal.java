import java.util.ArrayDeque;

import common.TreeNode;

/**
 * This question is the DUALITY of {@link ConstructBinaryTreefromPreorderandInorderTraversal#buildTree(int[], int[])}:
 *    1- instead of starting from index zero and incrementing in both lists (preOrder, inOrder) we start
 *    from the last index and decrement in both lists (postOrder, inOrder).
 *    2- In the code we reverse the logic which means where we call current.left become current.right and current.right becomes current.left
 *
 * Why?
 * since a preOrder algo is: current, left, right
 * while a postOrder algo is: left, right, current
 * So...
 *
 *  1- we do point 1 since the current used to be the first and now its the last
 *  2- we do point 2 since the order was (current and then left) now its in reverse order we have (current and then right)
 *
 *  If you draw the tree for the post and in order arrays as follows:
 *  6, 5, 4, 3, 2, 8, 10, 9, 7, 1
 *  1, 2, 3, 4, 5, 6, 7, 8, 9, 10
 *
 *  you will realize that the above statements are visually true
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
   public TreeNode buildTree(int[] inorder, int[] postorder) {
      if (postorder.length == 0 || inorder.length == 0) {
         return null;
      }

      int postOrderCounter = postorder.length - 1;
      int inOrderCounter = inorder.length - 1;
      ArrayDeque<TreeNode> stack = new ArrayDeque<>();

      TreeNode root = new TreeNode(postorder[postOrderCounter]);
      TreeNode current = root;
      while (!stack.isEmpty() || current != null) {
         while (current != null) {
            stack.addLast(current);

            if ((--postOrderCounter) >= 0 && current.val != inorder[inOrderCounter]) {
               current.right = new TreeNode(postorder[postOrderCounter]);
               current = current.right;
            } else {
               current = null;
            }
         }

         current = stack.pollLast();
         --inOrderCounter;

         if(postOrderCounter >= 0 && (stack.isEmpty() || stack.peekLast().val != inorder[inOrderCounter])) {
            current.left = new TreeNode(postorder[postOrderCounter]);
            current = current.left;
         } else {
            current = null;
         }
      }

      return root;
   }
}
