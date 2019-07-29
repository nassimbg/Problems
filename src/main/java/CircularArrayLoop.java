public class CircularArrayLoop {
   public static boolean circularArrayLoop(int[] nums) {
      for (int i = 0; i < nums.length; i++) {
         if (isLoopPresent(nums, i, null)) {
            return true;
         }
      }

      return false;
   }


   public static boolean isLoopPresent(int[] nums, int x, boolean[] dp){

      int slowPointer = x;
      int fastPointer = x;

      boolean loopFound = false;

      boolean isForward = nums[x] > 0;
      while(true){

         int parentOfFast = fastPointer;
         int steps = nums[fastPointer];

         if ((isForward && steps <= 0) || !isForward && steps > 0) {
            return loopFound;
         }

         fastPointer = getIndex(fastPointer, steps, nums);
         steps = nums[fastPointer];

         if ((isForward && steps <= 0) || !isForward && steps > 0) {
            return loopFound;
         }

         if (fastPointer == parentOfFast) {
            return false;
         }
         parentOfFast = fastPointer;
         fastPointer = getIndex(fastPointer, steps, nums);

         slowPointer = getIndex(slowPointer, nums[slowPointer], nums);

         if (fastPointer == parentOfFast) {
            return false;
         }
         if(fastPointer == slowPointer){
            loopFound = true;
            // we need to break otherwise it will go on forever
            break;
         }
      }

      return loopFound;
   }

   private static int getIndex(int currentIndex, int steps, int[] nums) {
      int newPositions = (currentIndex + steps) % nums.length;

      if (newPositions < 0) {
         newPositions = Math.abs(newPositions);
         newPositions = nums.length - newPositions;
      }

      return newPositions;
   }
}
