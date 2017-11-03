import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import common.TreeNode;

public class BinaryTreeZigzagLevelOrderTraversal {
   public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> result = new ArrayList<>();
      zigzagLevelOrderRec(result, 0, root);
      return result;
   }

   private static void zigzagLevelOrderRec(List<List<Integer>> result, int level, TreeNode current) {

      if (current != null) {
         fillInList(result, level, current);
         zigzagLevelOrderRec(result, level + 1, current.left);
         zigzagLevelOrderRec(result, level + 1, current.right);
      }
   }

   private static void fillInList(List<List<Integer>> result, int level, TreeNode current) {
      List<Integer> newList;
      if (result.size() > level) {
         newList = result.get(level);
      } else {
         newList = new LinkedList<>();
         result.add(level, newList);
      }
      if (level % 2 == 0) {
         newList.add(current.val);
      } else {
         newList.add(0, current.val);
      }
   }
}
