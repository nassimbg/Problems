public class FindPeakElement {
   public static int findPeakElement(int[] nums) {

      int start = 0;
      int end = nums.length - 1;

      while (start <=end) {
         int mid = (start + end) / 2;

         int currentValue = nums[mid];
         int valueOnLeft = mid - 1 >=start ? nums[mid - 1] : Integer.MIN_VALUE;
         int valueOnRight= mid + 1 <=end? nums[mid + 1] : Integer.MIN_VALUE;

         if (currentValue < valueOnLeft) {
            end = mid-1;
         } else if (currentValue < valueOnRight) {
            start = mid + 1;
         } else {
            return mid;
         }
      }

      return Integer.MIN_VALUE;
   }
}
