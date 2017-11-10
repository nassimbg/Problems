import common.TreeNode;

public class SumRootToLeafNumbers {
   public static int sumNumbers(TreeNode root) {
      return sumRootToLeaf(root, 0);
   }

   private static int sumRootToLeaf(TreeNode root, int sum) {
      if (root!=null) {
         sum= sum * 10 + root.val;

         if(root.left == null && root.right == null) {
            return sum;
         }
         return sumRootToLeaf(root.left, sum) + sumRootToLeaf(root.right, sum);
      }
      return 0;
   }

}

