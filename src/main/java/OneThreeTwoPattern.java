import java.util.ArrayDeque;
import java.util.Deque;

public class OneThreeTwoPattern {
   public static boolean find132pattern(int[] nums) {
      int[] minValue = new int[nums.length];

      int min = Integer.MAX_VALUE;
      for (int i = 0; i < nums.length; i++) {
         minValue[i] = min;
         min = Math.min(min, nums[i]);
      }

      Deque<Integer> stack = new ArrayDeque<>();
      for (int i = nums.length - 1; i >= 0; --i) {

         // remove from stack if last is <= to minValue from left at this index in order to keep
         // this part of condition i < j < k and ai < ak
         while (!stack.isEmpty() && stack.peekLast() <= minValue[i]) {
            stack.pollLast();
         }

         // check if we have a valid condition
         Integer lastElement = stack.peekLast();
         if (!stack.isEmpty() && minValue[i] < lastElement && lastElement < nums[i]) {
            return true;
         }

         // add to stack if current value in < last value in stack
         if (stack.isEmpty() || stack.peekLast() > nums[i]) {
            stack.addLast(nums[i]);
         }

      }

      return false;

   }
}
