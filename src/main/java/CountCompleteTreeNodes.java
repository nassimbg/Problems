import common.TreeNode;

public class CountCompleteTreeNodes {
   public int countNodes(TreeNode root) {

      if (root == null) {
         return 0;
      }

      int numberOfNodes = 0;
      TreeNode current = root;

      while (current != null) {
         int currentHeight = checkHeight(current);

         ++numberOfNodes;
         int heightOfChild;
         if (isLeftSubtreeComplete(current, currentHeight)) {
            heightOfChild = currentHeight - 1;
            current = current.right;
         } else {
            current = current.left;
            heightOfChild = currentHeight - 2;
         }
         numberOfNodes += ((1<<heightOfChild + 1) - 1);
      }

      return numberOfNodes;

   }

   private static int checkHeight(TreeNode treeNode) {

      int height = 0;
      while (treeNode != null) {
         ++height;
         treeNode = treeNode.left;
      }

      return --height;
   }

   private static boolean isLeftSubtreeComplete(TreeNode treeNode, int height) {
      treeNode = treeNode.left;

      while (treeNode != null) {
         --height;
         treeNode = treeNode.right;
      }
      return height == 0;
   }
}
