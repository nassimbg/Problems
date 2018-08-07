import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;

public class QueueReconstructionByHeight {
   public static int[][] reconstructQueue(int[][] people) {

      PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
         @Override
         public int compare(int[] o1, int[] o2) {

            if (o1[0] != o2[0]) {
               return o2[0] - o1[0];
            }
            return o1[1] - o2[1];
         }
      });

      queue.addAll(Arrays.asList(people));

      List<int[]> peopleTemp = new ArrayList<>(people.length);

      while (!queue.isEmpty()) {
         int[] person = queue.poll();
         peopleTemp.add(person[1], person);
      }

      return peopleTemp.toArray(new int[people.length][2]);
   }


   public static int[][] reconstructQueue2(int[][] people) {
      Arrays.sort(people, new Comparator<int[]>() {
         @Override
         public int compare(int[] o1, int[] o2) {

            if (o1[0] != o2[0]) {
               return o2[0] - o1[0];
            }
            return o1[1] - o2[1];
         }
      });

      PriorityQueue<Integer> queue = new PriorityQueue<>();
      for (int index = 0; index < people.length; index++) {
         queue.add(index);
      }

      int[][] result = new int[people.length][2];

      Deque<Integer> tempStore = new ArrayDeque<>(people.length);
      for (int personIndex = people.length - 1; personIndex >= 0 ; personIndex--) {

         int[] person = people[personIndex];
         int positionWant = person[1];

         for (int iteration = 0; iteration < positionWant && queue.size() > 1; iteration++) {
            tempStore.add(queue.poll());
         }

         result[queue.poll()] = person;

         while (!tempStore.isEmpty()) {
            queue.add(tempStore.poll());
         }
      }
      return result;
   }


}
