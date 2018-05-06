import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.Map;
import java.util.TreeMap;

public class RussianDollEnvelopes {

   //todo using Longest Increasing Subsequence
   public static int maxEnvelopes(int[][] envelopes) {
      Comparator<int[]> comparator = Comparator.<int[]>comparingInt(envelope -> envelope[0])
        .thenComparing(envelope -> envelope[1], (o1, o2) -> o2 - o1);
      Arrays.sort(envelopes, comparator);

      int[] dp = new int[envelopes.length];
      int size = 0;
      for (int[] envelope : envelopes) {

         int search = Arrays.binarySearch(dp, 0, size, envelope[1]);
         if (search < 0) {
            search = -(search + 1);
         }

         dp[search] = envelope[1];
         if (search == size) {
            ++size;
         }

      }

      return size;

   }

   //todo using TreeMap
   public static int maxEnvelopes2(int[][] envelopes) {
      int maxNumberOfEnvelops = 0;
      Comparator<int[]> comparator = Comparator.<int[]>comparingInt(envelope -> envelope[0]).thenComparingInt(envelope -> envelope[1]).reversed();
      Arrays.sort(envelopes, comparator);

      TreeMap<Integer, Integer> treeMap = new TreeMap<>();

      //for same width so not to consider it
      int lastWidth = Integer.MAX_VALUE;
      Deque<Integer> queue = new ArrayDeque<>();
      for (int index = 0; index < envelopes.length; index++) {
         int[] envelope = envelopes[index];

         if (envelope[0] < lastWidth) {
            while (!queue.isEmpty()) {
               int height = envelopes[index - queue.size()][1];
               treeMap.put(height, queue.pollFirst());
            }
            lastWidth = envelope[0];
         }

         int largestValueOfBiggerEnvelops = (findLargestValueOfBiggerEnvelops(treeMap.tailMap(envelope[1]), envelope[1]) + 1);
         queue.addLast(largestValueOfBiggerEnvelops);
         maxNumberOfEnvelops = Math.max(maxNumberOfEnvelops, largestValueOfBiggerEnvelops);

      }

      return maxNumberOfEnvelops;
   }

   private static int findLargestValueOfBiggerEnvelops(Map<Integer, Integer> integerIntegerSortedMap, int fromKey) {
      int findLargestNumberOfCards = 0;
      for (Map.Entry<Integer, Integer> entry : integerIntegerSortedMap.entrySet()) {
         if (entry.getKey() > fromKey) {
            findLargestNumberOfCards = Math.max(findLargestNumberOfCards, entry.getValue());
         }
      }

      return findLargestNumberOfCards;
   }
}

