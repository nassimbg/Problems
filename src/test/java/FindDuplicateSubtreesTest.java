import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import common.TreeNode;

public class FindDuplicateSubtreesTest {

   @Test
   public void findDuplicateSubtrees() {
      TreeNode t1 = new TreeNode(1);
      TreeNode t2 = new TreeNode(2);
      TreeNode t3 = new TreeNode(4);
      TreeNode t4 = new TreeNode(3);
      TreeNode t5 = new TreeNode(2);
      TreeNode t6 = new TreeNode(4);
      TreeNode t7 = new TreeNode(4);


      t1.left = t2;
      t2.left = t3;
      t1.right = t4;
      t4.left = t5;
      t5.left = t6;
      t4.right = t7;

      List<TreeNode> duplicateSubtrees = FindDuplicateSubtrees.findDuplicateSubtrees(t1);


      assertNotNull(duplicateSubtrees);
   }
}