import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.TreeNode;

public class CountUnivalueSubtreesTest {

   @Test
   public void countUnivalSubtrees() {
      TreeNode one = new TreeNode(5);
      TreeNode two = new TreeNode(1);
      TreeNode three = new TreeNode(5);
      TreeNode four = new TreeNode(5);
      TreeNode five = new TreeNode(5);
      TreeNode six = new TreeNode(5);

      one.left = two;
      one.right = three;
      two.left = four;
      two.right = five;
      three.right = six;

      CountUnivalueSubtrees countUnivalueSubtrees = new CountUnivalueSubtrees();

      assertEquals(4, countUnivalueSubtrees.countUnivalSubtrees(one));
   }
}