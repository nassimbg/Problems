import static org.junit.Assert.*;

import org.junit.Test;

import common.TreeNode;

public class SubtreeOfAnotherTreeTest {

   @Test
   public void isSubtree() {
      TreeNode t1 = new TreeNode(3);
      TreeNode t2 = new TreeNode(4);
      TreeNode t3 = new TreeNode(1);
      TreeNode t4 = new TreeNode(5);
      TreeNode t5 = new TreeNode(2);


      t1.left = t2;
      t2.left = t3;
      t1.right = t4;
      t4.left = t5;



      TreeNode t6 = new TreeNode(3);
      TreeNode t7 = new TreeNode(1);
      TreeNode t8 = new TreeNode(2);
      t6.left = t7;
      t6.right = t8;

      assertFalse(SubtreeOfAnotherTree.isSubtree(t1, t6));

   }
}