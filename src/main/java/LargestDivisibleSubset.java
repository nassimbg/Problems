import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LargestDivisibleSubset {

   private int longestRoot;
   private int bestParentIndex;
   private LinkedList<Integer> bestSet;





   static List<Integer> optimizedLargestDivisibleSubset(int[] nums) {
      Map<Integer, Integer> lengthOfPathPerValue = new HashMap<>();
      Map<Integer, Integer> parentIndex = new HashMap<>();
      Arrays.sort(nums);
      int bestPathEver = 0;
      int bestValueEver = -1;

      for (int value : nums) {
         int bestPath = 0;
         int bestParent = -1;
         for (int divisor = 1; divisor * divisor <= value; divisor++) {
            if (value % divisor == 0) {
               int pathOfParent = lengthOfPathPerValue.getOrDefault(divisor, -1);
               if (bestPath <= pathOfParent) {
                  bestPath = pathOfParent;
                  bestParent = divisor;
               }
               int divisent = value / divisor;

               pathOfParent = lengthOfPathPerValue.getOrDefault(divisent, -1);
               if (bestPath <= pathOfParent) {
                  bestPath = pathOfParent;
                  bestParent = divisent;
               }
            }
         }

         ++bestPath;
         if (bestPathEver < bestPath) {
            bestPathEver = bestPath;
            bestValueEver = value;
         }
         lengthOfPathPerValue.put(value, bestPath);
         parentIndex.put(value, bestParent);
      }

      LinkedList<Integer> bestRoot = new LinkedList<>();
      int current = bestValueEver;
      while (current != -1) {
         bestRoot.addFirst(current);
         current = parentIndex.get(current);
      }

      return bestRoot;
   }


   public List<Integer> largestDivisibleSubset(int[] nums) {
      bestSet = new LinkedList<>();
      Arrays.sort(nums);

      List<List<Integer>> adjList = new ArrayList<>(nums.length);

      for(int index = 0; index < nums.length; ++index) {

         this.longestRoot = -1;
         this.bestParentIndex = -1;

         boolean[] visited = new boolean[index + 1];
         boolean bestPath = false;
         for(int parentVertex = 0; parentVertex < index; ++parentVertex) {
            if (!visited[parentVertex]) {
               bestPath |= findRoot(parentVertex,  nums, visited, adjList, index, 0);
            }
         }

         if(bestParentIndex != -1) {
            adjList.get(bestParentIndex).add(index);
         }

         if (bestPath || bestSet.isEmpty()) {
            bestSet.add(nums[index]);
         }
         adjList.add(new ArrayList<>());
      }

      return bestSet;
   }

   private boolean findRoot(int parentIndex, int[] nums, boolean[] visited, List<List<Integer>> adjList, int indexToInsert, int currentRootLength) {

      if (parentIndex >= 0) {
         visited[parentIndex] = true;
         if (nums[indexToInsert] % nums[parentIndex] == 0) {
            boolean isLongerPath = ++currentRootLength >= this.longestRoot;
            boolean isBestPath = isLongerPath && bestSet.size() <= currentRootLength;

            if (isLongerPath) {
               this.longestRoot = currentRootLength;
               this.bestParentIndex = parentIndex;

               if (isBestPath && !bestSet.isEmpty()) {
                  this.bestSet = new LinkedList<>();
               }
            }

            for (int childrenIndex : adjList.get(parentIndex)) {
               isBestPath |= findRoot(childrenIndex, nums, visited, adjList, indexToInsert, currentRootLength);
            }

            if (isBestPath) {
               this.bestSet.addFirst(nums[parentIndex]);
               return true;
            }
         }
      }
      return false;
   }
}
