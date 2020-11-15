import common.TreeNode;

public class LowestCommonAncestorOfDeepestLeaves {

  public TreeNode lcaDeepestLeaves(TreeNode root) {
    if (root == null) {
      return null;
    }
    return lcaDeepestLeaves(0 , root).commonAnc;
  }

  public static Results lcaDeepestLeaves(int depth, TreeNode root) {
    if (root == null) {
      return null;
    }

    final Results leftResult = lcaDeepestLeaves(depth + 1, root.left);
    final Results rightResult = lcaDeepestLeaves(depth + 1, root.right);

    if (leftResult != null && rightResult != null) {
      if (leftResult.depth == rightResult.depth) {
        leftResult.commonAnc = root;
        leftResult.count += rightResult.count;
        return leftResult;
      } else if (leftResult.depth > rightResult.depth) {
        return leftResult;
      } else {
        return rightResult;
      }
    } else if (leftResult != null) {
      return leftResult;
    } else if (rightResult != null) {
      return rightResult;
    } else {
      return new Results(root, depth, 1);
    }
  }

  private static class Results {
    private TreeNode commonAnc;
    private int depth;
    private int count;

    public Results(final TreeNode commonAnc, final int depth, final int count) {
      this.commonAnc = commonAnc;
      this.depth = depth;
      this.count = count;
    }
  }
}
