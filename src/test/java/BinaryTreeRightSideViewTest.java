import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import common.TreeNode;

public class BinaryTreeRightSideViewTest {
   @Test
   public void rightSideView() throws Exception {

      TreeNode one = new TreeNode(1);
      TreeNode two = new TreeNode(2);
      TreeNode three = new TreeNode(3);
      TreeNode four = new TreeNode(4);

      one.left = two;
      one.right = three;
      two.left = four;

      assertEquals(Arrays.asList(1, 3, 4), BinaryTreeRightSideView.rightSideView(one));
   }


}