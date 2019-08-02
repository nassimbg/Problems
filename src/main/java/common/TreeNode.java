package common;

import java.util.StringTokenizer;

public class TreeNode {
   public int val;
   public TreeNode left;
   public TreeNode right;

   public TreeNode(int x) {
      val = x;
   }



   public static TreeNode parse(String s) {
      StringTokenizer st = new StringTokenizer(s, ",");
      return createTreeNodeRec(st);
   }


   private static TreeNode createTreeNodeRec(StringTokenizer st) {
      if (st.hasMoreElements()) {
         String token = st.nextToken();
         try {
            int val = Integer.parseInt(token);

            TreeNode current = new TreeNode(val);

            current.left = createTreeNodeRec(st);
            current.right = createTreeNodeRec(st);

            return current;
         } catch(Exception e) {
            return null;
         }
      }

      return null;
   }
}
