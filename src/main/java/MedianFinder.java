import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {
   private final PriorityQueue<Integer> minQueue;
   private final PriorityQueue<Integer> maxQueue;

   public MedianFinder() {
      this.minQueue = new PriorityQueue<>(Comparator.naturalOrder());
      this.maxQueue = new PriorityQueue<>(Comparator.<Integer>naturalOrder().reversed());
   }

   public void addNum(int num) {
      Integer maxPeek = maxQueue.peek();
      if (maxPeek == null || num <= maxPeek) {
         maxQueue.add(num);

         if (maxQueue.size() > minQueue.size() + 1) {
            minQueue.add(maxQueue.poll());
         }
      } else {
         minQueue.add(num);

         if (minQueue.size() > maxQueue.size() + 1) {
            maxQueue.add(minQueue.poll());
         }
      }

   }

   public double findMedian() {
      int minQueueSize = minQueue.size();
      int maxQueueSize = maxQueue.size();

      if (minQueueSize == maxQueueSize) {
         return (maxQueue.peek() + minQueue.peek())/2.;
      } else if (minQueueSize > maxQueueSize) {
         return  minQueue.peek();
      } else {
         return maxQueue.peek();
      }
   }
}
