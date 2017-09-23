import java.util.Arrays;

public class NextPermutation {
   public static void nextPermutation(int[] nums) {

      for (int i = nums.length - 1; i >= 1; i--) {
         if (nums[i] > nums[i -1]) {
            int max = i -1;
            for (int j = nums.length - 1; j > i -1; j--) {
               if (nums[max] < nums[j]) {
                  max = j;
                  break;
               }
            }

            swap(nums, i -1, max);

            int midWay = (nums.length - i)/2;

            for (int j = 1; j <= midWay; j++) {
               swap(nums, i-1+j, nums.length-j);
            }
            return;
         }
      }
      Arrays.sort(nums);
   }

   private static void swap(int[] nums, int i, int j) {
      nums[j] += nums[i];
      nums[i] = nums[j] - nums[i];
      nums[j]-=nums[i];
   }
}
