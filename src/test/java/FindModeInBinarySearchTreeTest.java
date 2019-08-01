import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import common.TreeNode;

public class FindModeInBinarySearchTreeTest {

   @Test
   public void findMode() {
      TreeNode treeNode = TreeNode.parse("1,null,2,2");

      assertEquals("[2]", Arrays.toString(FindModeInBinarySearchTree.findMode(treeNode)));
   }
}