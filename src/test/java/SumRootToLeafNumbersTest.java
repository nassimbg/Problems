import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.TreeNode;

public class SumRootToLeafNumbersTest {
   @Test
   public void sumNumbers() throws Exception {
      TreeNode one = new TreeNode(1);
      TreeNode two = new TreeNode(2);
      TreeNode three = new TreeNode(3);

      one.left = three;
      one.right  = two;

      assertEquals(25, SumRootToLeafNumbers.sumNumbers(one));
   }


}