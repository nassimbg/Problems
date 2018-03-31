import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * My solution looks similar to https://www.geeksforgeeks.org/print-binary-tree-vertical-order-set-2/ but they used a HashMap
 * we can work around to use directly a list like i did
 *
 * I dont think this solution works in all the case check {@link PrintBinaryTreeInVerticalOrderTest#printVertical2}
 * look at this link https://www.geeksforgeeks.org/print-a-binary-tree-in-vertical-order-set-3-using-level-order-traversal/
 * I think to solve the issue we really need to save them  level order traversal which means BFS
 *
 * we can make the above test case work if we ordered the lists => time O(n logn)
 * but if we used BFS => time O(n) since the will be ordered by the level
 */
public class PrintBinaryTreeInVerticalOrder {

    static List<List<Integer>> printVertical(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        TreeNode current = root;
        int rootColumnNumber = 0;
        while (current != null) {
            ++rootColumnNumber;
            current = current.left;
            result.add(new ArrayList<>());
        }

        --rootColumnNumber;

        preOrderSaving(root, rootColumnNumber, result);

        return result;

    }


    private static void preOrderSaving(TreeNode root, int listNumber, List<List<Integer>> result) {
        if (root != null) {
            if (listNumber == result.size()) {
                result.add(new ArrayList<>());
            }

            result.get(listNumber).add(root.val);

            preOrderSaving(root.left, listNumber - 1, result);
            preOrderSaving(root.right, listNumber + 1, result);
        }
    }
}
