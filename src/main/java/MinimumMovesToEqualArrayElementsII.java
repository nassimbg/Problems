import java.util.Arrays;

public class MinimumMovesToEqualArrayElementsII {
   public static long minMoves2(int[] nums) {

         if (nums.length < 2) {
            return 0;
         }
      Arrays.sort(nums);

      long[] increments = new long[nums.length];

      // count increments from right side to have them equal to current Index
      for (int index = nums.length - 2; index >= 0; --index) {
         increments[index] = increments[index + 1] + (nums[index + 1] - nums[index]) * (nums.length -1 - index);
      }

      long previousCount = 0;
      long minCount = Long.MAX_VALUE;
      // count increments from left side to have them equal to current Index
      for (int index = 1; index < nums.length; ++index) {

         previousCount = previousCount + (nums[index] - nums[index - 1]) * index;
         increments[index] += previousCount;

         minCount = Math.min(increments[index], minCount);
      }

      return minCount;
   }
}
