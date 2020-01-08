import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
   public static int subarraySum(int[] nums, int k) {
      Map<Integer, Integer> freqPerSum = new HashMap<>();
      freqPerSum.put(0, 1);


      int count = 0;
      int sum = 0;
      for(int val : nums) {
         sum += val;
         count += freqPerSum.getOrDefault( sum - k, 0);

         freqPerSum.put(sum, freqPerSum.getOrDefault(sum, 0) + 1);
      }

      return count;
   }
}
