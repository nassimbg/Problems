import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TheSkylineProblem {
   public static List<int[]> getSkyline(int[][] buildings) {

      List<int[]> result = new ArrayList<>();
      if(buildings.length == 0) {
         return result;
      }
      List<int[]> priorityQueue = new LinkedList<>();

      int height = 0;
      int right = -1;

      for (int index = 0; index < buildings.length; index++) {


         int[] building = buildings[index];

         ListIterator<int[]> iterator = priorityQueue.listIterator();

         while (iterator.hasNext()) {
            int[] next = iterator.next();
            if (building[0] < next[0]) {
               break;
            }
            result.add(new int[]{next[0], next[2]});
            height = next[2];
            right = next[1];
            iterator.remove();
         }

         if (height < building[2] || right < building[0]) {

            if (right < building[0] && right >0) {
               result.add(new int[] { right, 0 });
            }

            if (!result.isEmpty()) {
               int[] lastInserted = result.get(result.size() - 1);

               if(lastInserted[0] == building[0]) {
                  result.remove(result.size() - 1);
               }
            }
            result.add(new int[] { building[0], building[2] });

            if (right > building[1]) {
               insertToQueue(priorityQueue, new int[] { building[1], right, height });
            }

            height = building[2];
            right = building[1];

            if (!priorityQueue.isEmpty()) {
               int[] ints = priorityQueue.get(0);
               if (ints[0] < right) {
                  right = ints[0];
                  insertToQueue(priorityQueue, new int[]{ints[0], right, height});
               }
            }
         } else if(height == building[2]) {
            right = Math.max(right, building[1]);
         }
         else if (height >= building[2] && right<building[1]) {
            insertToQueue(priorityQueue, new int[] { right, building[1], building[2]});
         }
      }

      ListIterator<int[]> iterator = priorityQueue.listIterator();
      while (iterator.hasNext()) {
         int[] next = iterator.next();
         result.add(new int[]{next[0], next[2]});
         right = next[1];
         iterator.remove();
      }

      result.add(new int[] { right, 0 });

      return result;
   }

   private static void insertToQueue(List<int[]> priorityQueue, int[] ints) {

      if (priorityQueue.isEmpty()) {
         priorityQueue.add(ints);
      }
      ListIterator<int[]> iterator = priorityQueue.listIterator();

      while (iterator.hasNext()) {
         int[] next = iterator.next();

         //case 1
         if (ints[1] < next[0]) {
            iterator.add(ints);
            return;
         } else if (ints[2] <= next[2]) {
            //case 2

            if (next[0] - ints[0] > 0) {
               iterator.add(new int[]{ints[0], next[0], ints[2]});
            }

            if (ints[1] - next[1] > 0) {
               //b
               ints[0] = next[1];
            } else {
               //a
               return;
            }
         } else {
            // case 3

            if (next[1] - ints[1] > 0) {
               //a
               next[0] = ints[1];
            } else {
               //b
               iterator.remove();
               iterator.add(ints);
            }
            return;
         }
      }
   }
}
