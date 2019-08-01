import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import common.TreeNode;

public class FindModeInBinarySearchTree {
   public static int[] findMode(TreeNode root) {
      Deque<TreeNode> stack = new ArrayDeque<>();
      TreeNode current = root;

      int mostOcc = 0;
      List<Integer> most = new ArrayList<>();

      int currentOcc = 0;
      int prevValue = 0;
      while (current != null || !stack.isEmpty()) {
         while (current != null) {
            stack.addLast(current);
            current = current.left;
         }

         current = stack.pollLast();

         if (currentOcc > 0 && prevValue != current.val) {
            currentOcc = 0;
         }

         prevValue = current.val;
         currentOcc++;

         if (mostOcc < currentOcc) {
            mostOcc = currentOcc;
            most.clear();
         }

         if (mostOcc == currentOcc) {
            most.add(current.val);
         }
         current = current.right;
      }

      int[] results = new int[most.size()];
      for (int i = 0; i < results.length; i++) {
         results[i] = most.get(i);
      }

      return results;
   }
}
