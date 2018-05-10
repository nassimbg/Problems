public class SortTransformedArray {
   static int[] solution(int[] nums, int a, int b, int c) {

      if (a == 0) {
         return b >= 0 ? nums : reverse(nums);
      }

      // a != 0
      int value = (int) Math.floor(-b/(2.*a));
      int[] result = new int[nums.length];
      boolean ascending = a > 0;
      int currentSize = 0;

      int startingLeft = 0;
      int startingRight = nums.length - 1;

      while (startingLeft <= startingRight) {
         int leftMapped = calculatedValue(nums[startingLeft], a, b, c);
         int rightMapped = calculatedValue(nums[startingRight], a, b, c);

         if (ascending ? leftMapped >= rightMapped : leftMapped <=rightMapped) {
            putinPlace(result, currentSize, ascending, leftMapped);
            ++startingLeft;
         } else {
            putinPlace(result, currentSize, ascending, rightMapped);
            --startingRight;
         }

         ++currentSize;
      }

      return result;
   }

   private static int calculatedValue(int x, int a, int b, int c) {
      return a*x*x + b*x + c;
   }

   private static void putinPlace(int[] result, int currentSize, boolean asc, int value) {
      int index = asc ?  result.length - 1 - currentSize :currentSize;
      result[index] = value;
   }


   private static int[] reverse(int[] data) {
      int[] result = new int[data.length];

      for(int index = 0; index< data.length; ++index) {
         result[data.length - 1 - index] = data[index];
      }

      return result;
   }
}
