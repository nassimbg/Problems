import java.util.HashMap;
import java.util.Map;

import common.TreeNode;

public class PathSumIII {
   public int pathSum(TreeNode root, int sum) {

      Map<Integer, Integer> cummulatives = new HashMap<>();
      return PreOrderpathSum(sum, cummulatives, root, 0);
   }

   public int PreOrderpathSum(int sum, Map<Integer, Integer> cummulatives, TreeNode root, int currentSum) {
      int count = 0;
      if (root != null) {
         currentSum += root.val;

         if (currentSum == sum) {
            count++;
         }


         count += cummulatives.getOrDefault(currentSum - sum, 0);

         cummulatives.compute(currentSum, (k, v) -> v == null ? 1 : ++v);

         count += PreOrderpathSum(sum, cummulatives, root.left, currentSum) +
           PreOrderpathSum(sum, cummulatives, root.right, currentSum);

         cummulatives.compute(currentSum, (k, v) -> v - 1 == 0 ? null : --v);
      }

      return count;
   }
}
