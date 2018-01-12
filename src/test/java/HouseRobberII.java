public class HouseRobberII {
   public int rob(int[] nums) {

      if (nums.length == 1){
         return nums[0];
      }

      int withFirstHouse = robPartcial(nums, 0, nums.length - 2);
      int withoutFirstHouse = robPartcial(nums, 1, nums.length - 1);

      return Math.max(withFirstHouse, withoutFirstHouse);
   }

   private int robPartcial(int[] nums, int start, int end) {
      int dontTake = 0;
      int take = 0;

      for (int i = start; i <= end; i++) {
         int previousDontTake = dontTake;
         dontTake = Math.max(dontTake, take);
         take = previousDontTake + nums[i];
      }

      return Math.max(dontTake, take);
   }
}
