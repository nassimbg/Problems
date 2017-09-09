import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

   public static List<List<Integer>> threeSum(int[] nums) {

      if(nums.length < 3) {
         return new ArrayList<>();
      }
      Arrays.sort(nums);

      List<List<Integer>> results = new ArrayList<>();
      for (int i = 0; i < nums.length - 2; i++) {

         int lo = i +1;
         int hi = nums.length - 1;
         int sum = -nums[i];

         while (lo< hi) {
            int currentSum = nums[lo] + nums[hi];
            if (currentSum == sum) {

               results.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
               while (lo < hi && nums[lo] == nums[lo+1]) lo++;
               while (lo < hi && nums[hi] == nums[hi-1]) hi--;
               lo++; hi--;
            } else if(currentSum < sum) {
               ++lo;
            } else {
               --hi;
            }
         }

      }



      return results;
   }
}
