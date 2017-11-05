import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class PathSumII {
   public List<List<Integer>> pathSum(TreeNode root, int sum) {
      List<List<Integer>> result = new ArrayList<>();
      pathRec(root, sum, new ArrayList<>(), result);

      return result;
   }

   public void pathRec(TreeNode root, int sum, List<Integer> reached, List<List<Integer>> result) {
      if (root != null) {
         sum -= root.val;
         reached.add(root.val);

         if (root.right == null && root.left == null && sum == 0) {
            result.add(new ArrayList<>(reached));
         }

         pathRec(root.left, sum, reached, result);
         pathRec(root.right, sum, reached, result);

         reached.remove(reached.size() - 1);
      }
   }
}
