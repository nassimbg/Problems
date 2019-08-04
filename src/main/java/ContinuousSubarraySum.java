import java.util.Arrays;

public class ContinuousSubarraySum {


   public static boolean checkSubarraySum(int[] nums, int k) {
      k = Math.abs(k);
      for (int i = 1; i < nums.length; i++) {
         nums[i] += nums[i - 1];

         if (nums[i] == 0 || (k != 0 && nums[i] % k == 0)) {
            return true;
         }

         for (int j = 0; j < i - 1; j++) {
            if (k != 0 && (nums[i] - nums[j]) % k == 0 || (k == 0 && nums[i] == nums[j])) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean checkSubarraySum2(int[] nums, int k) {

      //todo enhance this code before solving another
      k = Math.abs(k);
      for (int i = 1; i < nums.length; i++) {
         nums[i] += nums[i - 1];

         if (nums[i] == 0) {
            return true;
         }

         for (int nk = 0; nk <= nums[i]; nk+=k) {
            if (nk == nums[i]) {
               return true;
            }
            int position = Arrays.binarySearch(nums, 0, i, nums[i] - nk);
            if (position >= 0 && position + 1 < i) {
               return true;
            }

            if (k == 0) {
               break;
            }
         }
      }

      return false;
   }
}
