public class NonDecreasingArray {
   public static boolean checkPossibility(int[] nums) {

      int counter = 0;
      for (int index = 0; index < nums.length - 1; index++) {

        if (nums[index] > nums[index+1]) {
           if (index - 1 >= 0 && nums[index - 1] > nums[index + 1]) {
              nums[index + 1] = nums[index];
           }
           ++counter;
        }

        if (counter > 1) {
           return false;
        }
      }

      return true;
   }
}
