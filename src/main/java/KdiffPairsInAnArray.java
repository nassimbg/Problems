import java.util.HashSet;
import java.util.Set;

public class KdiffPairsInAnArray {
   public static int findPairs(int[] nums, int k) {

      if (k < 0) {
         return 0;
      }
      Set<Integer> available = new HashSet<>();
      Set<Integer> availableMoreThanOnce = new HashSet<>();

      int count = 0;
      for(int val : nums) {

         if (!available.contains(val)) {
            if (available.contains(val - k)) {
               count++;
            }


            if (available.contains(val + k)) {
               count++;
            }

            available.add(val);
         } else if (k == 0 && !availableMoreThanOnce.contains(val)){
            count++;

            availableMoreThanOnce.add(val);

         }
      }

      return count;
   }
}
