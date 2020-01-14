public class ShortestUnsortedContinuousSubarray {
   public static int findUnsortedSubarray(int[] nums) {

      //todo what about equality
      int leftBoundary = 0;
      for (int i = 1; i < nums.length; i++) {
         if (nums[i] < nums[i - 1]) {
            leftBoundary = i;
            break;
         }
      }

      int minValue = nums[leftBoundary];
      for(int i = leftBoundary; i < nums.length;i++) {
         minValue = Math.min(minValue, nums[i]);
      }

      int newLeftBoundary = nums.length - 1;
      for (int i = 0; i < leftBoundary; i++) {
         if (nums[i] > minValue) {
            newLeftBoundary = i;
            break;
         }
      }

      int rightBoundary = nums.length - 1;
      for (int i = nums.length - 2; i >=0 ; i--) {
         if (nums[i] > nums[i + 1]) {
            rightBoundary = i;
            break;
         }
      }


      int maxValue = nums[rightBoundary];
      for(int i = rightBoundary; i >= 0;i--) {
         maxValue = Math.max(maxValue, nums[i]);
      }

      int newRightBoundary = 0;
      for (int i = nums.length - 1; i > rightBoundary ; i--) {
         if (nums[i] < maxValue) {
            newRightBoundary = i;
            break;
         }
      }

      return newRightBoundary <= newLeftBoundary || nums[newRightBoundary] == nums[newLeftBoundary] ? 0 : newRightBoundary - newLeftBoundary + 1;
   }
}
