import java.util.ArrayList;
import java.util.List;

import common.NarrayTreeNode;

public class NaryTreePreorderTraversal {
   public List<Integer> preorder(NarrayTreeNode root) {
      List<Integer> result = new ArrayList<>();

      preOrderTraversal(root, result);

      return result;

   }

   private static void preOrderTraversal(NarrayTreeNode root, List<Integer> result) {
      if (root != null) {
         result.add(root.val);

         for (NarrayTreeNode child : root.children) {
            preOrderTraversal(child, result);
         }
      }
   }
}
