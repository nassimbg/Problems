import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import common.TreeNode;

public class FindDuplicateSubtrees {
   public static List<TreeNode> findDuplicateSubtrees(TreeNode root) {
      Map<String, Integer> occ = new HashMap<>();
      List<TreeNode> results = new ArrayList<>();

      postOrder(root, occ, results);

      return results;
   }

   private static String postOrder(TreeNode root,  Map<String, Integer> occ , List<TreeNode> results) {
      String str = "$";
      if (root != null) {
         str = root.val + "," + postOrder(root.left, occ, results) + "," + postOrder(root.right, occ, results);
         int num = occ.getOrDefault(str, 0);

         if (num == 1) {
            results.add(root);
         }

         occ.put(str, num + 1);
      }

      return str;
   }
}
