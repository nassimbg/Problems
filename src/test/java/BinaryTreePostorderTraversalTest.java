import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import common.TreeNode;

public class BinaryTreePostorderTraversalTest {
   @Test
   public void preorderTraversal() throws Exception {
      TreeNode one = new TreeNode(1);
      TreeNode two = new TreeNode(2);
      TreeNode three = new TreeNode(3);

      one.left = three;
      one.right  = two;


      assertEquals(Arrays.asList(3,2,1), BinaryTreePostorderTraversal.postorderTraversal(one));
   }

   @Test
   public void preorderTraversal1() throws Exception {
      TreeNode one = new TreeNode(1);
      TreeNode two = new TreeNode(2);
      TreeNode three = new TreeNode(3);

      two.right = three;
      three.right = one;


      assertEquals(Arrays.asList(1, 3, 2), BinaryTreePostorderTraversal.postorderTraversal(two));
   }

   @Test
   public void preorderTraversal2() throws Exception {
      TreeNode one = new TreeNode(1);


      assertEquals(Arrays.asList(1), BinaryTreePostorderTraversal.postorderTraversal(one));
   }


   @Test
   public void preorderTraversal3() throws Exception {
      TreeNode one = new TreeNode(1);
      TreeNode two = new TreeNode(2);
      TreeNode three = new TreeNode(3);
      TreeNode four = new TreeNode(4);
      TreeNode five = new TreeNode(5);
      TreeNode six = new TreeNode(6);
      TreeNode seven = new TreeNode(7);
      TreeNode eight = new TreeNode(8);
      TreeNode nine = new TreeNode(9);

      one.left = two;
      two.left  = three;
      two.right = nine;
      three.left = four;
      three.right= five;
      five.right= eight;
      five.left= six;
      six.left= seven;


      assertEquals(Arrays.asList(4,7,6,8,5,3,9,2,1), BinaryTreePostorderTraversal.postorderTraversal(one));
   }

}