import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import common.TreeNode;

/**
 * At first we would find the place that the {@code target} would be.
 * since we dont have pointers to parent from children => we use a stack {@code parents} to save the parent nodes
 *
 * To find the closest {@code k} nodes to the {@code target} we try to do an algo like merge sort
 * at every time we try to find the successor of a node and the predecessor of another node the one that has a less diff with the target
 * will be added to {@code result}.
 * So at first we start by fetching the successor and predecessor of the {@code target} and then we fetch the successor of the successor
 * or the predecessor of the predecessor and so on... until we reach {@code k} nodes
 *
 * if its a BST => space complexity O(log n) and time complexity O(k + log n) since finding predecessor and successor consecutively is amortized O(1)
 */
public class ClosestBSTValueII {
   public List<Integer> closestKValues(TreeNode root, double target, int k) {

      Deque<TreeNode> parents = new ArrayDeque<>();
      TreeNode current = root;
      while (current != null) {
         parents.addLast(current);
         current = current.val > target ? current.left : current.right;
      }

      List<Integer> result = new ArrayList<>();
      int numberOfClosest = 0;

      current = new TreeNode((int) target);

      Deque<TreeNode> successorParents = new ArrayDeque<>(parents);
      Deque<TreeNode> predecessorParents = parents;
      TreeNode successorNode = current;
      TreeNode predecessorNode = current;
      while (numberOfClosest < k) {
         TreeNode tempPredecessor = predecessor(predecessorNode, predecessorParents);
         TreeNode tempSuccessor = successor(successorNode, successorParents);

         if (tempPredecessor == null) {
            predecessorNode = tempPredecessor;
            result.add(tempSuccessor.val);
            successorNode = tempSuccessor;
         } else if (tempSuccessor == null) {
            successorNode = tempSuccessor;
            result.add(tempPredecessor.val);
            predecessorNode = tempPredecessor;
         } else if (tempSuccessor.val - target > target - tempPredecessor.val) {
            result.add(tempPredecessor.val);
            predecessorNode = tempPredecessor;
         } else {
            result.add(tempSuccessor.val);
            successorNode = tempSuccessor;
         }

         ++numberOfClosest;
      }

      return result;
   }


   private static TreeNode predecessor(TreeNode current, Deque<TreeNode> predecessorParents) {

      if (current == null) {
         return null;
      }
      if (current.left != null) {
         predecessorParents.addLast(current);
         current = current.left;
         while (current.right != null){
            predecessorParents.addLast(current);
            current = current.right;
         }
         return current;
      } else {
         while (!predecessorParents.isEmpty()) {
            TreeNode parentNode = predecessorParents.pollLast();
            if (parentNode.val <= current.val) {
               return parentNode;
            }
         }
      }

      return null;
   }

   private static TreeNode successor(TreeNode current, Deque<TreeNode> successorParents) {
      if (current == null) {
         return null;
      }
      if (current.right != null) {
         successorParents.addLast(current);
         current = current.right;
         while (current.left != null){
            successorParents.addLast(current);
            current = current.left;
         }
         return current;
      } else {
         while (!successorParents.isEmpty()) {
            TreeNode parentNode = successorParents.pollLast();
            if (parentNode.val > current.val) {
               return parentNode;
            }
         }
      }

      return null;
   }

}
