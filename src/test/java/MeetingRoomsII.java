import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

import common.Interval;

public class MeetingRoomsII {
   public int minMeetingRooms(Interval[] intervals) {

      if (intervals.length == 0) {
         return 0;
      }
      Comparator<Interval> comparator = Comparator.<Interval>comparingInt(p -> p.start)
        .thenComparingInt(p -> p.end);

      Arrays.sort(intervals, comparator);

      PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
      priorityQueue.offer(0);

      int numberOfRooms = 1;
      for (Interval interval : intervals) {
         Integer peek = priorityQueue.peek();

         if (peek <= interval.start) {
            priorityQueue.poll();
         } else {
            ++numberOfRooms;
         }
         priorityQueue.add(interval.end);
      }

      return numberOfRooms;
   }
}
