import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class BinaryTreeRightSideView {
   public static List<Integer> rightSideView(TreeNode root) {
      List<Integer> result = new ArrayList<>();
      rightSideRec(result, root, 0);
      return result;
   }

   static void rightSideRec(List<Integer> result, TreeNode root, int level) {

      if (root != null) {
         if (result.size() <= level) {
            result.add(root.val);
         }

         rightSideRec(result, root.right, level + 1);
         rightSideRec(result, root.left, level + 1);
      }
   }
}
