import static org.junit.Assert.*;

import org.junit.Test;

import common.TreeNode;

public class DeleteNodeInBSTTest {

   @Test
   public void deleteNode() {
      TreeNode t1 = new TreeNode(5);
      TreeNode t2 = new TreeNode(3);
      TreeNode t3 = new TreeNode(2);
      TreeNode t4 = new TreeNode(4);
      TreeNode t5 = new TreeNode(6);
      TreeNode t6 = new TreeNode(7);


      t1.left = t2;
      t1.right = t5;
      t2.left = t3;
      t2.right = t4;
      t5.right=t6;

      t1 = DeleteNodeInBST.deleteNode(t1, 3);
   }
}