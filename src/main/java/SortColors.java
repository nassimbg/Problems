public class SortColors {
   public static void sortColors(int[] nums) {
      int endOfZero = 0;
      while (endOfZero < nums.length && nums[endOfZero] == 0) {
         ++endOfZero;
      }
      int startOfTwo = nums.length - 1;

      while(startOfTwo > 0 && nums[startOfTwo] == 2) {
         --startOfTwo;
      }

      int index = endOfZero;
      while (endOfZero <= index && index <= startOfTwo) {
         int value = nums[index];
         if (value == 0) {

            nums[index] = nums[endOfZero];
            nums[endOfZero] = value;

            while (endOfZero < nums.length && nums[endOfZero] == 0) {
               ++endOfZero;
            }

            if(endOfZero > index) {
               index = endOfZero;
            }

         } else if (value == 2) {

            nums[index] = nums[startOfTwo];
            nums[startOfTwo] = value;

            while(startOfTwo >= 0 && nums[startOfTwo] == 2) {
               --startOfTwo;
            }
         } else {
            ++index;
         }
      }
   }
}
