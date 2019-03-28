public class MaxConsecutiveOnes {
   public static int findMaxConsecutiveOnes(int[] nums) {

      int max = 0;
      int current = 0;

      for (int index = 0; index < nums.length; index++) {
         if (nums[index] == 0) {
            max = Math.max(max ,current);
            current = 0;
         } else {
            current++;
         }
      }

      return Math.max(max, current);
   }
}
