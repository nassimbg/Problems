import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.TreeNode;

public class SumOfLeftLeavesTest {

   @Test
   public void sumOfLeftLeaves() {
      TreeNode t3 = new TreeNode(3);
      TreeNode t9 = new TreeNode(9);
      TreeNode t20 = new TreeNode(20);
      TreeNode t15 = new TreeNode(15);
      TreeNode t7 = new TreeNode(7);


      t3.left = t9;
      t3.right = t20;
      t20.left = t15;
      t20.right = t7;
      assertEquals(24, SumOfLeftLeaves.sumOfLeftLeaves(t3));
   }


   @Test
   public void sumOfLeftLeaves2() {
      TreeNode t3 = new TreeNode(3);
      TreeNode t9 = new TreeNode(9);
      TreeNode t20 = new TreeNode(20);
      TreeNode t15 = new TreeNode(15);
      TreeNode t7 = new TreeNode(7);

      t3.right = t9;
      t9.right = t20;
      t20.right = t15;
      t15.right = t7;

      assertEquals(0, SumOfLeftLeaves.sumOfLeftLeaves(t3));
   }

   @Test
   public void sumOfLeftLeaves3() {
      TreeNode t3 = new TreeNode(3);

      assertEquals(0, SumOfLeftLeaves.sumOfLeftLeaves(t3));
   }
}