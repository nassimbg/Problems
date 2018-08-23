public class CombinationSumIV {
   public static int combinationSum4(int[] nums, int target) {

      return helper(nums, target, 0,1,1, 0);
   }

   private static int helper(int[] nums, int target, int index, int totalFact, int factComb, int sizeOfArray) {

      if (index == nums.length) {

         if (target != 0) {
            return 0;
         }

         return (int) Math.ceil(totalFact / (factComb * 1.));
      }

      int poss = 0;

      int coff = target / nums[index];

      for (int i = 0; i <= coff; i++) {

         if (i > 0) {
            factComb *= i;
            sizeOfArray++;
            totalFact *= (sizeOfArray);
         }

         poss += helper(nums, target - (nums[index] * i), index + 1, totalFact, factComb, sizeOfArray);

      }

      return poss;

   }
}
