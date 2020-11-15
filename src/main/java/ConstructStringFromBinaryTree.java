import common.TreeNode;

public class ConstructStringFromBinaryTree {

  public static String tree2str(TreeNode t) {
    final StringBuilder stringBuilder = new StringBuilder();
    preOrder(stringBuilder, t);
    return stringBuilder.toString();
  }

  private static void preOrder(StringBuilder stack, TreeNode n) {
    if (n == null) {
      if (stack.length() > 0 && stack.charAt(stack.length() - 1) !=  ')') {
        stack.append('(');
        stack.append(')');
      }
    } else {

      final boolean initiallyEmpty = stack.length() > 0;
      if (initiallyEmpty) {
        stack.append('(');
      }

      stack.append(n.val);

      if (n.left != null || n.right != null) {
        preOrder(stack, n.left);
        preOrder(stack, n.right);
      }
      if (initiallyEmpty) {
        stack.append(')');
      }
    }
  }
}
