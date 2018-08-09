public class ArithmeticSlices {
   public static int numberOfArithmeticSlices(int[] A) {
      if (A.length < 3) {
         return 0;
      }

      int numberOfSeries = 0;

      int left = 0;
      int right = 1;
      int currentAcceptableDiff = A[right] - A[left];
      while (right < A.length) {

         int diff = A[right] - A[right - 1];

         if (diff != currentAcceptableDiff) {
            int lastIndexInSeries = right - 1;
            numberOfSeries += getNumberOfArithmeticCombinations(left, lastIndexInSeries);
            currentAcceptableDiff = diff;
            left = lastIndexInSeries;
         }
         ++right;
      }

      numberOfSeries += getNumberOfArithmeticCombinations(left, right - 1);

      return numberOfSeries;
   }

   private static int getNumberOfArithmeticCombinations(int left, int right) {
      int count = 0;
      int length = right - left + 1;

      if (length > 2) {
         count = ((length - 2) * (length - 1))/2;
      }

      return count;
   }
}
