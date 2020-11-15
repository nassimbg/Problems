import common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class AverageOfLevelsInBinaryTree {


  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> values = new ArrayList<>();

    if (root == null) {
      return values;
    }

    Deque<TreeNode> queue = new ArrayDeque<>();

    queue.addLast(root);

    while (!queue.isEmpty()) {
      int levelSize = queue.size();

      long sum = 0;
      for (int i = 0; i < levelSize; i++) {
        final TreeNode current = queue.pollFirst();

        if (current.left != null) {
          queue.addLast(current.left);
        }

        if (current.right != null) {
          queue.addLast(current.right);
        }

        sum += current.val;
      }
      values.add(sum / (1.0 * levelSize));
    }

    return values;
  }
}
