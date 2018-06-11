public class WiggleSubsequence {
   public static int wiggleMaxLength(int[] nums) {

      int longestSeq = 0;

      if (nums.length == 0) {
         return longestSeq;
      }

      longestSeq++;
      boolean isIncreasing = true;
      boolean firstNumber = true;
      for (int index = 1; index < nums.length; index++) {

         if (nums[index] == nums[index -1]) {
            continue;
         }

         if (firstNumber) {
            firstNumber = false;
            isIncreasing = nums[index] < nums[index - 1];
         }

         if (nums[index] > nums[index - 1] ^ isIncreasing) {
            longestSeq++;
            isIncreasing = !isIncreasing;
         }
      }

      return longestSeq;

   }
}
