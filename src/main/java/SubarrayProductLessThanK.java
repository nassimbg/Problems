public class SubarrayProductLessThanK {
   public static int numSubarrayProductLessThanK(int[] nums, int k) {

      if (k <=0) {
         return 0;
      }

      int cum = 1;
      int left = 0;
      int count = 0;

      for(int right = 0; right < nums.length; right++) {
         cum *= nums[right];

         while(cum >=k && left < right) {
            cum /= nums[left++];
         }

         if (cum < k) {
            count += (right - left + 1);
         }
      }

      return count;
   }
}
