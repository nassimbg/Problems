import java.util.StringJoiner;
import java.util.StringTokenizer;

import common.TreeNode;

public class SerializeAndDeserializeBinaryTree {

   private static final String DELIM = ",";

   public String serialize(TreeNode root) {
      StringJoiner stringJoiner = new StringJoiner(DELIM);

      preOrderSerialize(root, stringJoiner);

      return stringJoiner.toString();
   }

   private static void preOrderSerialize(TreeNode root, StringJoiner stringJoiner) {
      if (root == null) {
         stringJoiner.add("#");
      } else {
         stringJoiner.add(String.valueOf(root.val));
         preOrderSerialize(root.left, stringJoiner);
         preOrderSerialize(root.right, stringJoiner);
      }
   }

   // Decodes your encoded data to tree.
   public TreeNode deserialize(String data) {
      StringTokenizer stringTokenizer = new StringTokenizer(data, DELIM);
      return preOrderDeserialize(stringTokenizer);

   }

   private static TreeNode preOrderDeserialize(StringTokenizer stringTokenizer) {
      TreeNode treeNode = null;
      if (stringTokenizer.hasMoreTokens()) {

         String nextToken = stringTokenizer.nextToken();
         if (!nextToken.equals("#")) {

            treeNode = new TreeNode(Integer.parseInt(nextToken));

            treeNode.left = preOrderDeserialize(stringTokenizer);
            treeNode.right = preOrderDeserialize(stringTokenizer);
         }

      }

      return treeNode;
   }
}
