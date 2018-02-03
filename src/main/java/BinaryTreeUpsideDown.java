import common.TreeNode;

/**
 * check the question here <a href="http://bangbingsyb.blogspot.com/2014/11/leetcode-binary-tree-upside-down.html">question</a>
 * since its locked in LeetCode
 * the left most node will never have a right child since the question says
 * "all the right nodes are either leaf nodes with a sibling (a left node that shares the same parent node) or empty"
 */
public class BinaryTreeUpsideDown {
   public static TreeNode upSideDown(TreeNode root) {
      if (root != null) {
         TreeNode left = root.left;
         TreeNode upSideDownRoot = upSideDown(left);

         if (left != null) {
            left.left = root.right;
            left.right = root;
            root.right = null;
            root.left = null;

            return upSideDownRoot;
         } else {
            return root;
         }
      }
      return null;
   }
}
