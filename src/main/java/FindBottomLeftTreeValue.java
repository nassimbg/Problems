import java.util.ArrayDeque;
import java.util.Deque;

import common.TreeNode;

public class FindBottomLeftTreeValue {
   public int findBottomLeftValue(TreeNode root) {
      Deque<TreeNode> queue = new ArrayDeque<>();
      int leftMost = 0;

      queue.addLast(root);

      while(!queue.isEmpty()) {
         int currentLevelSize = queue.size();

         for (int i = 0; i < currentLevelSize; i++) {
            TreeNode treeNode = queue.pollFirst();
            if(i == 0) {
               leftMost = treeNode.val;
            }

            if (treeNode.left != null) {
               queue.addLast(treeNode.left);
            }

            if (treeNode.right != null) {
               queue.addLast(treeNode.right);
            }
         }
      }

      return leftMost;
   }
}
