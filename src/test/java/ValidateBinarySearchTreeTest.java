import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import common.TreeNode;

public class ValidateBinarySearchTreeTest {
   @Test
   public void isValidBST() throws Exception {
      TreeNode one = new TreeNode(1);
      TreeNode two = new TreeNode(2);
      TreeNode three = new TreeNode(3);

      two.left = one;
      two.right = three;

      assertTrue(ValidateBinarySearchTree.isValidBST(two));
   }

   @Test
   public void isValidBST1() throws Exception {
      TreeNode one = new TreeNode(1);
      TreeNode two = new TreeNode(2);
      TreeNode three = new TreeNode(3);

      one.left = two;
      one.right = three;

      assertFalse(ValidateBinarySearchTree.isValidBST(one));
   }


   @Test
   public void isValidBST2() throws Exception {
      TreeNode ten = new TreeNode(10);
      TreeNode five = new TreeNode(5);
      TreeNode fif = new TreeNode(15);
      TreeNode six = new TreeNode(6);
      TreeNode tw = new TreeNode(20);

      ten.left = five;
      ten.right = fif;
      fif.left = six;
      fif.right = tw;

      assertFalse(ValidateBinarySearchTree.isValidBST(ten));
   }

   @Test
   public void isValidBST3() throws Exception {
      TreeNode ten = new TreeNode(1);
      TreeNode five = new TreeNode(1);

      ten.right = five;

      assertFalse(ValidateBinarySearchTree.isValidBST(ten));
   }

   @Test
   public void isValidBST4() throws Exception {
      TreeNode ten = new TreeNode(Integer.MIN_VALUE);

      assertTrue(ValidateBinarySearchTree.isValidBST(ten));
   }

}