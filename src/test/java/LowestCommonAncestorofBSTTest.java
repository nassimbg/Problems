import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.TreeNode;

public class LowestCommonAncestorofBSTTest {
   @Test
   public void lowestCommonAncestor() throws Exception {
      TreeNode two = new TreeNode(2);
      TreeNode one = new TreeNode(1);

      assertEquals(two, LowestCommonAncestorofBST.lowestCommonAncestor(two, one, two));
   }


}