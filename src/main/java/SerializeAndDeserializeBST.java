import java.util.StringJoiner;
import java.util.StringTokenizer;

import common.TreeNode;

public class SerializeAndDeserializeBST {
   // Encodes a tree to a single string.
   public String serialize(TreeNode root) {
      StringJoiner stringJoiner = new StringJoiner(",");
      serialize(stringJoiner, root);

      return stringJoiner.toString();
   }

   private static void serialize(StringJoiner stringJoiner, TreeNode root) {
      if (root == null) {
         stringJoiner.add("$");
      } else {
         stringJoiner.add(String.valueOf(root.val));
         serialize(stringJoiner, root.left);
         serialize(stringJoiner, root.right);
      }
   }


   // Decodes your encoded data to tree.
   public TreeNode deserialize(String data) {
      StringTokenizer stringTokenizer = new StringTokenizer(data, ",");
      return desrialize(stringTokenizer);
   }

   private static TreeNode desrialize(StringTokenizer stringTokenizer) {
      if (stringTokenizer.hasMoreTokens()) {
         String token = stringTokenizer.nextToken();
         if (token.equals("$")) {
            return null;
         }

         TreeNode treeNode = new TreeNode(Integer.parseInt(token));

         treeNode.left = desrialize(stringTokenizer);
         treeNode.right = desrialize(stringTokenizer);
         return treeNode;
      }
      return null;
   }
}
