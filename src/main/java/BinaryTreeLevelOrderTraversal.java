import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class BinaryTreeLevelOrderTraversal {


   private static void fillInList(List<List<Integer>> result, int level, TreeNode current) {
      if (result.size() > level) {
         result.get(level).add(current.val);
      } else {
         List<Integer> newList = new ArrayList<>();
         newList.add(current.val);
         result.add(level, newList);
      }
   }

   public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> result = new ArrayList<>();
      preOrderTraversal(result, 0, root);

      return result;
   }

   private static void preOrderTraversal(List<List<Integer>> result, int level, TreeNode current) {
      if (current != null) {
         fillInList(result, level, current);

         preOrderTraversal(result, level + 1, current.left);
         preOrderTraversal(result, level + 1, current.right);
      }
   }
}
