import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructStringFromBinaryTreeTest {

  @Test
  public void case1() {
    final TreeNode t1 = new TreeNode(1);
    final TreeNode t2 = new TreeNode(2);
    final TreeNode t3 = new TreeNode(3);
    final TreeNode t4 = new TreeNode(4);

    t1.left = t2;
    t1.right = t3;

    t2.left = t4;

    final String output = ConstructStringFromBinaryTree.tree2str(t1);

    assertEquals("1(2(4))(3)", output);
  }

  @Test
  public void case2() {
    final TreeNode t1 = new TreeNode(1);
    final TreeNode t2 = new TreeNode(2);
    final TreeNode t3 = new TreeNode(3);
    final TreeNode t4 = new TreeNode(4);

    t1.left = t2;
    t1.right = t3;

    t2.right = t4;

    final String output = ConstructStringFromBinaryTree.tree2str(t1);

    assertEquals("1(2()(4))(3)", output);
  }

}
