import java.util.Arrays;

public class ThreeSumSmaller {
   public static int threeSumSmaller(int[] nums, int target) {
      Arrays.sort(nums);

      int total = 0;
      int right = nums.length - 1;
      for (int index = 0; index < nums.length; index++) {
         int diff = target - nums[index];

         int left = index + 1;
         while (right > left) {
            if (nums[right] + nums[left] < diff) {
               total += (right - left);
               ++left;
            } else{
               --right;
            }
         }
      }

      return total;
   }
}
