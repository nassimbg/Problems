import java.util.Arrays;

public class ThreeSumClosest {

   public static int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);


      int minValue = nums[0] + nums[1] + nums[2];
      for (int firstIndex = 0; firstIndex < nums.length -2; firstIndex++) {
         int diff = target - nums[firstIndex];

         int i = firstIndex+1;
         int j = nums.length -1;
         while (i<j) {
            if (nums[i] + nums[j] == diff) {
               return target;
            }

            if (Math.abs(nums[i] + nums[j] + -diff ) < Math.abs(minValue - target)) {
               minValue = nums[i] + nums[j] + nums[firstIndex];
            }

            if (nums[i] + nums[j] < diff) {
               ++i;
            } else {
               --j;
            }


         }
      }

      return minValue;
   }
}
