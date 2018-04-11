import common.TreeNode;

public class LargestBSTSubtree {

   TreeNode bestRoot;
   int size;

   TreeNode findLargest(TreeNode root) {

      postOrderFinding(root);

      return bestRoot;
   }

   /**
    * 0 -> size
    * 1 -> min
    * 2 -> max
    * @param root
    * @return
    */
   int[] postOrderFinding(TreeNode root) {

      if (root == null) {
         return new int[] { 0, Integer.MAX_VALUE, Integer.MIN_VALUE };
      }

      int[] leftInfo = postOrderFinding(root.left);
      int[] rightInfo = postOrderFinding(root.right);

      if (leftInfo[0] == -1 || rightInfo[0] == -1 || leftInfo[2] > root.val || rightInfo[1] < root.val) {
         return new int[] { -1, 0, 0 };
      }

      int minValue = leftInfo[0] == 0 ? root.val : leftInfo[1];
      int maxValue = rightInfo[0] == 0 ? root.val : rightInfo[2];

      int currentSize = leftInfo[0] + rightInfo[0] + 1;

      if (currentSize > size) {
         bestRoot = root;
      }

      return new int[] { currentSize, minValue, maxValue};
   }
}
