import java.util.ArrayList;
import java.util.List;

import common.NarrayTreeNode;

public class NaryTreePostorderTraversal {
   public List<Integer> postorder(NarrayTreeNode root) {
      List<Integer> result = new ArrayList<>();

      postOrderTraversal(root, result);

      return result;
   }

   private void postOrderTraversal(NarrayTreeNode root, List<Integer> result) {
      if (root != null) {

         for (NarrayTreeNode child : root.children) {
            postOrderTraversal(child, result);
         }
         result.add(root.val);
      }
   }
}
