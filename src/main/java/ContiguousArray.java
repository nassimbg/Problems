import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
   public static int findMaxLength(int[] nums) {
      // 0s = 1s
      // a - b = c - d =>

      // 1s - 0s at i = 1s - 0s at j i < j
      // d - b = c - a

      Map<Integer, Integer> diffTOIndex = new HashMap<>();

      int ones = 0;
      int zeros = 0;
      int maxLength = 0;
      for (int i = 0; i < nums.length; i++) {

         if (nums[i] == 0) {
            zeros++;
         } else {
            ones++;
         }

         int diff = ones - zeros;

         if (diff == 0) {
            maxLength = i + 1;
         } else {
            Integer index = diffTOIndex.get(diff);
            if (index != null) {

               maxLength = Math.max(maxLength, i - index);
            } else {
               diffTOIndex.put(diff, i);
            }
         }
      }

      return maxLength;
   }
}
