import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import common.TreeNode;

public class BinaryTreeLevelOrderTraversalII {
   public List<List<Integer>> levelOrderBottom(TreeNode root) {
      List<List<Integer>> result = new LinkedList<>();
      preOrderFilling(result, 0, root);

      return result;
   }

   private static void preOrderFilling(List<List<Integer>> result, int level, TreeNode current) {

      if (current != null) {
         if (level == result.size()) {
            List<Integer> list = new ArrayList<>();
            list.add(current.val);
            result.add(0, list);
         } else {
            result.get(result.size() - 1 - level).add(current.val);
         }

         preOrderFilling(result, level + 1, current.left);
         preOrderFilling(result, level + 1, current.right);
      }
   }
}
