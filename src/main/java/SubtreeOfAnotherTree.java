import common.TreeNode;

public class SubtreeOfAnotherTree {
   public static boolean isSubtree(TreeNode s, TreeNode t) {

      if (s == null || t == null) {
         return s == t;
      }

      if (isSubtreeInMe(s, t)) {
         return true;
      }

      return isSubtree(s.left, t) || isSubtree(s.right, t);
   }

   private static boolean isSubtreeInMe(TreeNode s, TreeNode t) {
      if (s == null || t == null) {
         return s == t;
      }

      return s.val == t.val && isSubtreeInMe(s.left, t.left) && isSubtreeInMe(s.right, t.right);
   }
}
