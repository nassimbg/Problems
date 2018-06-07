import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsWithSmallestSums {

   public static List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {

      List<int[]> result = new ArrayList<>();
      if (nums1.length == 0 || nums2.length == 0) {
         return result;
      }

      PriorityQueue<int[]> minQueue = new PriorityQueue<>(new Comparator<int[]>(){
         public int compare(int[] pair1, int[] pair2) {
            return (nums1[pair1[0]]+nums2[pair1[1]])-(nums1[pair2[0]]+nums2[pair2[1]]);
         }

      });

      minQueue.add(new int[] { 0, 0 });

      while (!minQueue.isEmpty()) {
         int[] minPair = minQueue.poll();

         result.add(new int[] {nums1[minPair[0]] , nums2[minPair[1]]});

         if (result.size() == k) {
            break;
         }

         if (minPair[0] < nums1.length - 1 && minPair[1] == 0) {
            minQueue.add(new int[] {minPair[0] + 1, minPair[1]});
         }

         if (minPair[1] < nums2.length - 1) {
            minPair[1]++;
            minQueue.add(minPair);
         }
      }

      return result;
   }

}
