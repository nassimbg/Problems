import common.TreeNode;

public class ConvertBSTToGreaterTree {
   public static TreeNode convertBST(TreeNode root) {
      return recursive(root, 0).treeNode;
   }

   private static NodeInfo recursive(TreeNode root, int sumOfBiggerValues) {
      NodeInfo result = null;
      if (root != null) {
         NodeInfo rightResult = recursive(root.right, sumOfBiggerValues);

         int newCurrentValue = root.val + sumOfBiggerValues + rightResult.sumOfSubtree;

         NodeInfo leftResult = recursive(root.left, newCurrentValue);

         TreeNode treeNode = new TreeNode(newCurrentValue);
         treeNode.left = leftResult.treeNode;
         treeNode.right = rightResult.treeNode;
         result = new NodeInfo(treeNode, root.val + rightResult.sumOfSubtree + leftResult.sumOfSubtree);

      }

      return result == null ? new NodeInfo() : result;
   }

   private static final class NodeInfo {
      private final TreeNode treeNode;
      private final int sumOfSubtree;

      private NodeInfo(TreeNode treeNode, int sumOfSubtree) {
         this.treeNode = treeNode;
         this.sumOfSubtree = sumOfSubtree;
      }

      private NodeInfo() {
         this.treeNode = null;
         this.sumOfSubtree = 0;
      }
   }
}
