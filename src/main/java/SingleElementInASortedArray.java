public class SingleElementInASortedArray {
   public static int singleNonDuplicate(int[] nums) {

      int start = 0;
      int end = nums.length - 1;

      while (start <= end) {
         int mid = (start + end) >>> 1;

         if ((mid == 0 || nums[mid] != nums[mid - 1]) && ( mid == nums.length - 1 || nums[mid] != nums[mid + 1])) {
            return nums[mid];
         } else {

            // the same value is in mid - 1 index => if the left part of array is even => the single element is in left part else in right
            if (mid > 0 && nums[mid] == nums[mid - 1]) {
               if (mid % 2 == 0) {
                  end = mid - 1;
               } else {
                  start = mid + 1;
               }
            } else {
               // the same value is in mid + 1 index => if the right part of array is even => the single element is in right part else in right
               if ((nums.length - (mid + 1)) % 2 == 0) {
                  start = mid + 1;
               } else {
                  end = mid - 1;
               }
            }
         }
      }

      return 0;
   }

   public static int singleNonDuplicateUsingBitWise(int[] nums) {
      int val = 0;

      for (int num : nums) {
         val = val ^ num;
      }

      return val;
   }
}
