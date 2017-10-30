import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class UniqueBinarySeachTreesII {


   public static List<TreeNode> generateTrees1(int n) {
      return generateRec(1, n);
   }

   private static List<TreeNode> generateRec(int i, int n) {
      List<TreeNode> nodes = new ArrayList<>();
      if (i > n) {
         nodes.add(null);
         return nodes;
      }


      for (int j = i; j <= n; j++) {
         List<TreeNode> left = generateRec(i, j - 1);
         List<TreeNode> right = generateRec(j + 1, n);

         for (TreeNode leftNode : left) {
            for (TreeNode rightNode : right) {
               TreeNode root = new TreeNode(j);
               root.left = leftNode;
               root.right = rightNode;
               nodes.add(root);
            }
         }

      }
      return nodes;
   }

   public static List<TreeNode> generateTrees(int n) {
      boolean[] taken = new boolean[n];
      int[] orderOfValuesInsertion = new int[n];
      int counter = 0;
      List<TreeNode> nodes = new ArrayList<>();
      generateTreesRec(n, orderOfValuesInsertion, counter, taken, nodes);

      return nodes;
   }

   private static void generateTreesRec(int n, int[] orderOfValuesInsertion, int counter, boolean[] taken, List<TreeNode> nodes) {

      if (counter == n) {
         TreeNode root = new TreeNode(orderOfValuesInsertion[0]);
         for (int i = 1; i < counter; ++i) {
            insertNode(root, orderOfValuesInsertion[i]);
         }
         addIfNotAdded(nodes, root);
      }

      for (int i = 1; i <= n; i++) {
         if (!taken[i - 1]) {
            orderOfValuesInsertion[counter] = i;
            taken[i - 1] = true;
            generateTreesRec(n, orderOfValuesInsertion, counter + 1, taken, nodes);
            taken[i - 1] = false;
         }
      }
   }

   private static void addIfNotAdded(List<TreeNode> nodes, TreeNode root) {

      for (TreeNode node : nodes) {
         if (equalNodes(node, root)) {
            return;
         }
      }
      nodes.add(root);
   }

   private static boolean equalNodes(TreeNode node, TreeNode root) {
      return (node == null ^ root == null ) && node.val == root.val && equalNodes(node.left, root.left) && equalNodes(node.right, root.right);
   }

   private static void insertNode(TreeNode root, int i) {
      TreeNode current = root;
      TreeNode parent = root;
      while (current != null) {
         parent = current;

         if (i > current.val) {
            current = current.right;
         } else {
            current = current.left;
         }
      }

      TreeNode treeNode = new TreeNode(i);
      if (i > parent.val) {
         parent.right = treeNode;
      } else {
         parent.left = treeNode;
      }
   }
}
