import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class MaximumGap {
   public static int maximumGap(int[] nums) {
      if (nums.length < 2) {
         return 0;
      }
      radixSort(nums);

      int maxGap = Integer.MIN_VALUE;
      for (int index = 0; index < nums.length -1; index++) {
         maxGap = Math.max(maxGap, nums[index + 1] - nums[index]);
      }

      return maxGap;
   }

   private static void radixSort(int[] nums) {
      List<ArrayDeque<Integer>> deques = new ArrayList<>();
      for (int i = 0; i < 10; i++) {
         deques.add(new ArrayDeque<>());
      }

      int max = Integer.MIN_VALUE;
      for (int num1 : nums) {
         max = Math.max(max, num1);
      }

      int div =1;
      while (max > 0) {
         for (int num : nums) {
            int digit = (num / div) % 10;
            deques.get(digit).addLast(num);
         }

         int indexInNum = 0;
         for (ArrayDeque<Integer> deque : deques) {
            while (!deque.isEmpty()) {
               nums[indexInNum++] = deque.pollFirst();
            }
         }
         div*=10;
         max/=10;
      }
   }
}
