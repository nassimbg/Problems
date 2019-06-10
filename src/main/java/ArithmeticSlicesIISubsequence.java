import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArithmeticSlicesIISubsequence {

   /**
    * this solution is mostly of mine and partially from leetcode solutions
    * @param A
    * @return
    */
   public static int numberOfArithmeticSlices(int[] A) {

      int sum = 0;
      List<Map<Integer, Integer>> dp = new ArrayList<>(A.length);
      for (int index = A.length - 1; index >= 0 ; index--) {

         Map<Integer, Integer> currentIndexDP = new HashMap<>();
         for (int internalIndex = index + 1; internalIndex < A.length; internalIndex++) {
            long diffLong = (long)A[internalIndex] - (long)A[index];

            if (diffLong <= Integer.MIN_VALUE || diffLong > Integer.MAX_VALUE) continue;

            int diff = (int)diffLong;
            Map<Integer, Integer> currentInternalIndexDP = dp.get(A.length - 1 - internalIndex);
            int numberOfCombinationInternalIndex = currentInternalIndexDP.getOrDefault(diff, 0);

            sum += numberOfCombinationInternalIndex;
            // the saved number is the number of combinations of the current value with a value A[x] visited in the future (x < currentIndex)
            currentIndexDP.put(diff, currentIndexDP.getOrDefault(diff, 0) + numberOfCombinationInternalIndex + 1);
         }
         dp.add(currentIndexDP);
      }

      return sum;
   }
}
