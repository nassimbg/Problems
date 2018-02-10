public class WiggleSort {
   public static int[] sort(int[] nums) {

      boolean isEvenIndex = false;
      for (int i = 1; i < nums.length; i++) {
         if (isEvenIndex) {

            if (nums[i] > nums[i - 1]) {
               int temp = nums[i - 1];
               nums[i - 1] = nums[i];
               nums[i] = temp;
            }
         } else {

            if (nums[i] < nums[i - 1]) {
               int temp = nums[i - 1];
               nums[i - 1] = nums[i];
               nums[i] = temp;
            }
         }

         isEvenIndex = !isEvenIndex;
      }

      return nums;
   }
}
