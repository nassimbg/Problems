import common.TreeNode;

public class AddOneRowToTree {
  public TreeNode addOneRow(TreeNode root, int v, int d) {

    if (d == 1) {
      final TreeNode newRoot = new TreeNode(v);
      newRoot.left = root;
      root = newRoot;
    } else {
      addOneRow(root, v, d, 1);
    }
    return root;

  }

  public void addOneRow(TreeNode root, int v, int d, int currentDepth) {
    if (root != null) {

      if (d == currentDepth + 1) {
        TreeNode left = root.left;
        root.left = new TreeNode(v);
        root.left.left = left;

        TreeNode right = root.right;
        root.right = new TreeNode(v);
        root.right.right = right;
      } else {
        addOneRow(root.left, v, d, currentDepth + 1);
        addOneRow(root.right, v, d, currentDepth + 1);
      }
    }

  }
}
