import static org.junit.Assert.*;

import org.junit.Test;

import common.TreeNode;

public class ConvertBSTToGreaterTreeTest {

   @Test
   public void convertBST() {
      TreeNode t1 = new TreeNode(5);
      TreeNode t2 = new TreeNode(2);
      TreeNode t3 = new TreeNode(13);

      t1.left = t2;
      t1.right = t3;

      TreeNode treeNode = ConvertBSTToGreaterTree.convertBST(t1);

      assertNotNull(treeNode);
   }
}