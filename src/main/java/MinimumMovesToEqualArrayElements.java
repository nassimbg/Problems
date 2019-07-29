public class MinimumMovesToEqualArrayElements {

   //the math way
   public static int minMoves(int[] nums) {
      int min = nums[0], sum = nums[0];
      for(int i=1; i < nums.length; i++){
         min = Math.min(min, nums[i]);
         sum += nums[i];
      }
      return sum-min*nums.length;
   }

   // the hard way
   public static int minMoves2(int[] nums) {
      int minIndex = 0;
      int maxIndex = 0;
      int beforeMaxIndex = minIndex;
      for (int index = 0; index < nums.length; index++) {

         if (nums[minIndex] > nums[index]) {
            minIndex = index;
         }

         if (nums[maxIndex] < nums[index]) {
            beforeMaxIndex = maxIndex;
            maxIndex = index;
         }
      }

      int count =0;

      while (nums[minIndex] != nums[maxIndex]) {
         int diff = nums[maxIndex] - nums[beforeMaxIndex];
         if (diff == 0) {
            diff = 1;
         }
         count+=diff;

         int dontUpdateIndex = maxIndex;
         for(int i = 0; i < nums.length; i++) {
            if (i != dontUpdateIndex) {
               nums[i]+=diff;
            }

            if (nums[i] > nums[maxIndex]) {
               beforeMaxIndex = maxIndex;
               maxIndex = i;
            }
         }
         if (nums[beforeMaxIndex] > nums[maxIndex]) {
            int temp = beforeMaxIndex;
            beforeMaxIndex = maxIndex;
            maxIndex = temp;
         }
      }

      return count;
   }
}
