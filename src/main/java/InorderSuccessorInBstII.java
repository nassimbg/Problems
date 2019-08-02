import common.TreeNode;
import common.TreeNodeWithParent;

public class InorderSuccessorInBstII {
   TreeNode findSuccessor(TreeNodeWithParent node) {

      if (node == null) {
         return null;
      }
      TreeNode successorInSubTree = findSuccessorInSubTree(node.right);

      if (successorInSubTree != null) {
         return successorInSubTree;
      }

      TreeNodeWithParent current = node;
      TreeNodeWithParent parent = node.parent;

      while (parent != null) {
         if (parent.left == current) {
            return parent;
         }

         current = parent;
         parent = parent.parent;
      }

      return parent;
   }

   private static TreeNode findSuccessorInSubTree(TreeNode node) {
      TreeNode parent = node;
      TreeNode current = node;
      while (current != null) {
         parent = current;
         current = current.left;
      }

      return parent;
   }
}
