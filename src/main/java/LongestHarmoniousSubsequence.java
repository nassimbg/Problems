import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {



   public int findLHSLeetCodeSolution(int[] nums) {
      HashMap < Integer, Integer > map = new HashMap < > ();
      int res = 0;
      for (int num: nums) {
         map.put(num, map.getOrDefault(num, 0) + 1);
         if (map.containsKey(num + 1))
            res = Math.max(res, map.get(num) + map.get(num + 1));
         if (map.containsKey(num - 1))
            res = Math.max(res, map.get(num) + map.get(num - 1));
      }
      return res;
   }

   public static int findLHSMySolution(int[] nums) {

      Map<Integer, Integer> larger = new HashMap<>();
      Map<Integer, Integer> smaller = new HashMap<>();

      int maxLength = 0;
      for(int val : nums) {
         int largerSameCount = larger.getOrDefault(val, 0);
         int smallerPlus1Count = smaller.getOrDefault(val + 1, 0);
         int currentLargerCount = Math.max(largerSameCount, smallerPlus1Count) + 1;

         larger.put(val, currentLargerCount);

         int smallerSameCount = smaller.getOrDefault(val, 0);
         int largerMinus1Count = larger.getOrDefault(val - 1, 0);
         int currentSmallerCount = Math.max(smallerSameCount, largerMinus1Count) + 1;

         smaller.put(val, currentSmallerCount);

         if (smallerPlus1Count != 0) {
            maxLength = Math.max(maxLength, currentLargerCount);
         }

         if (largerMinus1Count != 0) {
            maxLength = Math.max(maxLength, currentSmallerCount);
         }
      }

      return maxLength;
   }
}
