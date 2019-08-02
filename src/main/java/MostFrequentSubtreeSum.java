import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import common.TreeNode;

public class MostFrequentSubtreeSum {
   public int[] findFrequentTreeSum(TreeNode root) {
      Map<Integer, Integer> freOfSum = new HashMap<>();
      postOrder(root, freOfSum);

      Set<Map.Entry<Integer, Integer>> entries = freOfSum.entrySet();

      int maxFreq = 0;
      for (Map.Entry<Integer, Integer> entry : entries) {
         maxFreq = Math.max(maxFreq, entry.getValue());
      }

      List<Integer> sums = new ArrayList<>();
      for (Map.Entry<Integer, Integer> entry : entries) {
         if (maxFreq == entry.getValue()) {
            sums.add(entry.getKey());
         }
      }

      int[] arraySums = new int[sums.size()];
      for (int i = 0; i < sums.size(); i++) {
         arraySums[i] = sums.get(i);
      }

      return arraySums;
   }

   public int postOrder(TreeNode node, Map<Integer, Integer> freqOfSum) {
      int sum = 0;

      if (node != null) {
         sum += node.val;

         sum += postOrder(node.left, freqOfSum);
         sum += postOrder(node.right, freqOfSum);

         int freq = freqOfSum.getOrDefault(sum, 0);
         freqOfSum.put(sum, freq + 1);
      }

      return sum;
   }
}
