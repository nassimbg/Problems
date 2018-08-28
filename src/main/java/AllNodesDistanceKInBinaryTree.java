import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class AllNodesDistanceKInBinaryTree {
   public static List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
      List<Integer> nodes = new ArrayList<>();
      fillNodes(root, target, K , nodes, -1);
      return nodes;
   }

   private static int fillNodes(TreeNode root, TreeNode target, int k, List<Integer> nodes, int distance) {

      if (root != null) {
         int myDistance = -1;

         if (target.val == root.val) {
            distance = 0;
            myDistance = 0;
         }

         int distanceTochildren = distance >= 0 ? distance + 1 : distance;

         int distanceLeft = fillNodes(root.left, target, k , nodes, distanceTochildren);
         int distanceRight = fillNodes(root.right, target, k , nodes, distanceTochildren);

         if (distanceLeft >= 0 || distanceRight >=0) {
            myDistance = Math.max(distanceLeft, distanceRight) + 1;
         }

         if (distance == k || myDistance == k) {
            nodes.add(root.val);
         } else if (distanceLeft >= 0) {
            fillNodes(root.right, target, k , nodes, myDistance + 1);
         } else if(distanceRight >=0) {
            fillNodes(root.left, target, k , nodes, myDistance + 1);
         }


         return myDistance;
      }

      return -1;

   }
}
