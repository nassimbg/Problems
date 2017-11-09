import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.TreeNode;

public class BinaryTreeMaximumPathSumTest {
   @Test
   public void maxPathSum() throws Exception {
      TreeNode one = new TreeNode(1);
      TreeNode two = new TreeNode(2);
      TreeNode three = new TreeNode(3);

      one.left = two;
      one.right = three;

      BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();

      assertEquals(6, binaryTreeMaximumPathSum.maxPathSum(one));
   }

   @Test
   public void maxPathSum1() throws Exception {
      TreeNode one = new TreeNode(-3);

      BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();

      assertEquals(-3, binaryTreeMaximumPathSum.maxPathSum(one));
   }



}