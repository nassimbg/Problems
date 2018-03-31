import common.TreeNode;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

    public class PrintBinaryTreeInVerticalOrderTest {

    @Test
    public void printVertical() {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(3);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(8);
        TreeNode h = new TreeNode(7);
        TreeNode i = new TreeNode(9);


        a.left = b;
        a.right = e;

        b.left = c;
        b.right = d;

        e.left = f;
        e.right = h;

        f.right = g;

        h.right = i;


        List<List<Integer>> expected = Arrays.asList(Arrays.asList(4), Arrays.asList(2), Arrays.asList(1, 5, 6), Arrays.asList(3, 8), Arrays.asList(7), Arrays.asList(9));
        assertEquals(expected, PrintBinaryTreeInVerticalOrder.printVertical(a));
    }

    @Test
    @Ignore
    //check notes in class why this test case is ignored
    public void printVertical2() {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(3);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(8);
        TreeNode h = new TreeNode(7);
        TreeNode i = new TreeNode(9);
        TreeNode j = new TreeNode(10);
        TreeNode k = new TreeNode(11);
        TreeNode l = new TreeNode(12);


        a.left = b;
        a.right = e;

        b.left = c;
        b.right = d;

        e.left = f;
        e.right = h;

        f.right = g;

        h.right = i;
        h.left = j;
        j.right = k;
        k.right = l;


        List<List<Integer>> expected = Arrays.asList(Arrays.asList(4), Arrays.asList(2), Arrays.asList(1, 5, 6), Arrays.asList(3, 8,10), Arrays.asList(7,11), Arrays.asList(9,12));
        assertEquals(expected, PrintBinaryTreeInVerticalOrder.printVertical(a));
    }

}