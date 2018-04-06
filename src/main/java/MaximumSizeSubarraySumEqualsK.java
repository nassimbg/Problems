import java.util.HashMap;
import java.util.Map;

public class MaximumSizeSubarraySumEqualsK {
   static int summation(int[] nums, int k) {

      int maxSize = 0;

      int sum = 0;
      Map<Integer, Integer> sumToIndex = new HashMap<>();
      sumToIndex.put(0, -1);
      for (int i = 0; i < nums.length; i++) {

         sum += nums[i];

         final int index = i;
         sumToIndex.computeIfAbsent(sum, key -> index);
         Integer integer = sumToIndex.get(sum - k);

         if (integer != null) {
            maxSize = Math.max(maxSize, index - integer);
         }
      }

      return maxSize;
   }
}
