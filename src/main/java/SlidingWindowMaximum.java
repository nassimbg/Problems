import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

   public static int[] maxSlidingWindow(int[] nums, int k) {
      int diffBtwLastAndFirst = k > 0? k - 1: 0;
      int[] result = new int[nums.length - diffBtwLastAndFirst];
      int counter = 0;

      Deque<Integer> deque = new ArrayDeque<>();

      for (int i = 0; i < nums.length; i++) {

         while(!deque.isEmpty() && deque.peekLast() < nums[i]) {
            deque.removeLast();
         }

         deque.addLast(nums[i]);

         if (i >=diffBtwLastAndFirst ) {
            result[counter++] = deque.peekFirst();
            if (nums[i - diffBtwLastAndFirst] == deque.peekFirst()) {
               deque.removeFirst();
            }
         }
      }

      return result;
   }
}
