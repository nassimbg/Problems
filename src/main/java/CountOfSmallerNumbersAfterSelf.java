import java.util.LinkedList;
import java.util.List;

public class CountOfSmallerNumbersAfterSelf {
   public static List<Integer> countSmaller(int[] nums) {

      AVLTree avlTree = new AVLTree();
      LinkedList<Integer> count = new LinkedList<>();


      for (int j = nums.length - 1; j>=0; --j) {
         count.addFirst(avlTree.insert(nums[j]));
      }

      return count;
   }

   private static class AVLTree {
      Node root;

      int insert(int key) {
         int lessThanValues = 0;
         Node current = root;
         Node parent = null;

         while (current != null) {
            parent = current;
            current.treeSize++;
            if (current.key > key) {
               current = current.left;
            } else {
               lessThanValues += (current.left != null ? current.left.treeSize : 0) + (current.key < key ? 1 : 0);
               current = current.right;
            }
         }

         current = new Node(key);
         current.parent = parent;
         if (parent != null) {
            if (parent.key > key) {
               parent.left = current;
            } else {
               parent.right = current;
            }
         } else {
            root = current;
         }

         return lessThanValues;
      }
   }

   private static class Node {
      Node left;
      Node right;
      Node parent;
      int key;
      int treeSize = 1;

      Node(int key) {
         this.key = key;
      }
   }

}
