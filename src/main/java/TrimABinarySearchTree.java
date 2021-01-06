import common.TreeNode;

public class TrimABinarySearchTree {

  public TreeNode trimBST(TreeNode root, int low, int high) {
    final TreeNode treeNode = trimLowerRec(root, low);
    return trimGreaterRec(treeNode, high);
  }

  private static TreeNode trimLowerRec(TreeNode root, int low) {

    if (root == null) {
      return root;
    }

    if (root.val <= low) {
      root.left = null;

      if (root.val == low) {
        return root;
      } else {
        return trimLowerRec(root.right, low);
      }
    }

    root.left = trimLowerRec(root.left, low);
    return root;
  }

  private static TreeNode trimGreaterRec(TreeNode root, int high) {
    if (root == null) {
      return root;
    }

    if (root.val >= high) {
      root.right = null;

      if (root.val == high) {
        return root;
      } else {
        return trimGreaterRec(root.left, high);
      }
    }

    root.right = trimGreaterRec(root.right, high);
    return root;
  }
}
