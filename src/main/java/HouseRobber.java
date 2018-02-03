public class HouseRobber {
   public static int rob(int[] nums) {

      int takePrevious = 0;
      int dontTakePrevious = 0;

      for (int i = 0; i < nums.length; i++) {
         int temp = nums[i] + dontTakePrevious;
         dontTakePrevious = Math.max(dontTakePrevious, takePrevious);
         takePrevious = temp;
      }

      return Math.max(dontTakePrevious, takePrevious);
   }
}
