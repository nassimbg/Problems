public class MoveZeroes {
   public static void moveZeroes(int[] nums) {
      int lastNonZero = -1;

      for (int i = 0; i < nums.length; i++) {
         if (nums[i] != 0) {
            ++lastNonZero;
            int temp = nums[lastNonZero];
            nums[lastNonZero] = nums[i];
            nums[i] = temp;
         }
      }
   }




   public static void moveZeroes1(int[] nums) {

      int numberOfZeros = 0;

      for (int i = 0; i < nums.length; i++) {
         if (nums[i] == 0) {
            ++numberOfZeros;
         } else {
            nums[i - numberOfZeros] = nums[i];
         }
      }

      while (numberOfZeros > 0) {
         nums[nums.length - numberOfZeros] = 0;
         --numberOfZeros;
      }
   }
}
