import java.util.ArrayDeque;
import java.util.Deque;

public class NextGreaterElementII {
   public static int[] nextGreaterElements(int[] nums) {
      int[] maxValues = new int[nums.length];

      for (int i = 0; i < maxValues.length; i++) {
         maxValues[i] = -1;
      }

      Deque<Integer> stack = new ArrayDeque<>();

      fillMaxForEveryElement(nums, maxValues, stack);
      fillMaxForEveryElement(nums, maxValues, stack);


      return maxValues;
   }

   private static void fillMaxForEveryElement(int[] nums, int[] maxValues, Deque<Integer> stack) {
      for(int index = nums.length - 1; index >= 0; --index) {
         int value = nums[index];

         int greaterValue = -1;
         while(!stack.isEmpty()) {
            int nextValue = stack.peekLast();
            if (value >=nextValue) {
               stack.pollLast();
            } else {
               greaterValue = nextValue;
               break;
            }
         }

         if (maxValues[index] == -1) {
            maxValues[index] = greaterValue;
         }
         stack.addLast(value);
      }
   }
}
