import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import common.TreeNode;

public class AllNodesDistanceKInBinaryTreeTest {

   @Test
   public void distanceK() {
      TreeNode n1 = new TreeNode(3);
      TreeNode n2 = new TreeNode(5);
      TreeNode n3 = new TreeNode(6);
      TreeNode n4 = new TreeNode(2);
      TreeNode n5 = new TreeNode(7);
      TreeNode n6 = new TreeNode(4);
      TreeNode n7 = new TreeNode(1);
      TreeNode n8 = new TreeNode(0);
      TreeNode n9 = new TreeNode(8);

      n1.left = n2;
      n1.right = n7;
      n2.left = n3;
      n2.right = n4;
      n4.left = n5;
      n4.right = n6;
      n7.left = n8;
      n7.right = n9;

      List<Integer> integers = AllNodesDistanceKInBinaryTree.distanceK(n1, n2, 2);

      assertEquals(Arrays.asList(7,4,1), integers);
   }
}