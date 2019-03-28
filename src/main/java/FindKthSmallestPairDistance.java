import java.util.Comparator;
import java.util.PriorityQueue;

public class FindKthSmallestPairDistance {
   public static int smallestDistancePair(int[] nums, int k) {
      PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
         @Override
         public int compare(Integer a1, Integer a2) {
            return a2 - a1;
         }
      });
      for(int a1 = 0; a1 < nums.length; a1++) {
         for(int a2 = a1 + 1; a2 < nums.length; a2++) {
            Integer max = pq.peek();
            int diff = Math.abs(nums[a1] - nums[a2]);
            if (pq.size() == k && diff >= max) {
               break;
            }

            pq.add(diff);

            if (pq.size() > k) {
               pq.poll();
            }

         }
      }

      return pq.poll();
   }
}
