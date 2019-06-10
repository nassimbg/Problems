import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class CQuestions {


   // question 1
   public static int minMoves(List<Integer> avg) {
      return Math.min(minSwaps(avg, 0), minSwaps(avg, 1));
   }

   private static int minSwaps(List<Integer> avg, int valueToSwap) {
      int currentSwaps = 0;
      int numberOfOtherValues = 0;
      for (Integer integer : avg) {
         if (integer == valueToSwap) {
            currentSwaps += numberOfOtherValues;
         } else {
            numberOfOtherValues++;
         }
      }
      return currentSwaps;
   }

   // question 2
   public static String isPossible(int a, int b, int c, int d) {
      // Write your code here
      // todo put c , d as true

      // BFS
      Deque<Point> queue = new ArrayDeque<>();
      queue.addLast(new Point(a, b));

      while (!queue.isEmpty()) {

         Point point = queue.pollFirst();

         if (point.x == c && point.y == d) {
            return "Yes";
         }

         if (point.x + point.y < 1000) {
            queue.addLast(new Point(point.x + point.y, point.y));
            queue.addLast(new Point(point.x, point.x + point.y));
         }
      }

      return "No";

      // todo print yes or no

   }

   // question 3
   public static int getMinimumUniqueSum(List<Integer> arr) {
      // Write your code here

      if (arr == null || arr.size() < 2) {
         return 0;
      }

      Collections.sort(arr);

      int sum = arr.get(0);

      for (int currentIndex = 1; currentIndex < arr.size(); currentIndex++) {

         // increment current value
         if (arr.get(currentIndex) <= arr.get(currentIndex - 1)) {
            int increment = arr.get(currentIndex - 1) - arr.get(currentIndex) + 1;

            arr.set(currentIndex, arr.get(currentIndex) + increment);
         }

         // get sum after incrementing the current value
         sum += arr.get(currentIndex);
      }

      return sum;
   }

   private static class Point {
      final int x;
      final int y;

      private Point(int x, int y) {
         this.x = x;
         this.y = y;
      }




   }
}
