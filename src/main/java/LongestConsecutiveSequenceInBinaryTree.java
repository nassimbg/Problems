import common.TreeNode;

public class LongestConsecutiveSequenceInBinaryTree {
   public static int longestConsecutive(TreeNode root) {

      return preOrderCounting(root, 0, 0);
   }

   private static int preOrderCounting(TreeNode root, int previousCount, int parentValue) {
      if (root == null) {
         return 0;
      }

      int currentCount = 1;
      if (root.val == parentValue + 1) {
         currentCount +=previousCount;
      }

      int leftCount = preOrderCounting(root.left, currentCount, root.val);
      int rightCount = preOrderCounting(root.right, currentCount, root.val);

      return Math.max(currentCount, Math.max(leftCount, rightCount));

   }
}
