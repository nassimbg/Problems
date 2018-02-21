import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.TreeNode;

public class LongestConsecutiveSequenceInBinaryTreeTest {

   @Test
   public void longestConsecutive() {
      TreeNode treeNode1 = new TreeNode(6);
      TreeNode treeNode2 = new TreeNode(9);
      TreeNode treeNode3 = new TreeNode(7);
      TreeNode treeNode4 = new TreeNode(10);
      TreeNode treeNode5 = new TreeNode(11);

      treeNode1.right = treeNode2;
      treeNode2.left = treeNode3;
      treeNode2.right = treeNode4;
      treeNode4.right = treeNode5;

      assertEquals(3, LongestConsecutiveSequenceInBinaryTree.longestConsecutive(treeNode1));
   }


   @Test
   public void longestConsecutive2() {
      TreeNode treeNode1 = new TreeNode(1);
      TreeNode treeNode2 = new TreeNode(2);
      TreeNode treeNode3 = new TreeNode(3);
      TreeNode treeNode4 = new TreeNode(4);
      TreeNode treeNode5 = new TreeNode(5);
      TreeNode treeNode6 = new TreeNode(6);
      TreeNode treeNode7 = new TreeNode(7);

      treeNode1.left = treeNode2;
      treeNode2.left = treeNode3;
      treeNode1.right = treeNode4;
      treeNode4.left = treeNode5;
      treeNode4.right = treeNode6;
      treeNode6.right = treeNode7;

      assertEquals(3, LongestConsecutiveSequenceInBinaryTree.longestConsecutive(treeNode1));
   }
}