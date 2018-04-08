import java.util.ArrayList;
import java.util.List;

public class PatchingArray {


   public static int minPatches(int[] nums, int n) {
      int added = 0;
      long missing = 1;
      int index = 0;

      while (missing <= n) {
         if (index < nums.length && nums[index] <= missing) {
            missing += nums[index++];
         } else {
            missing += missing;
            ++added;
         }
      }

      return added;
   }
   public static int minPatches2(int[] nums, int n) {
      long cum = 0;
      int indexOfCum = -1;
      int numberAdded = 0;

      boolean f = false;

      for (long i = 1; i <= n; i++) {
         if (cum < i && indexOfCum < nums.length -1) {
            cum += nums[++indexOfCum];
            f = true;
         } else if (cum < i && indexOfCum >= nums.length - 1) {
            cum +=i;
            ++numberAdded;
         }

         if (cum > i) {
            long diff = cum - i;

            if (diff >= i) {
               cum +=i;
               ++numberAdded;

               if (f) {
                  cum -= nums[indexOfCum--];
                  f= false;
               }
            }
         }
      }

      return numberAdded;
   }
   public static int minPatches1(int[] nums, int n) {

      List<Integer> integers = new ArrayList<>(nums.length);

      int missingValue = Integer.MAX_VALUE;
      boolean[] dp = new boolean[n];
      int index = -1;
      while (missingValue != 0) {
         missingValue = 0;

         int currentValue = index == -1 ? 0 : index < nums.length ? nums[index] : integers.get(index - nums.length);

         for (int row = n - 1; row >= 0; --row) {

            int acctualRowValue = row +1;
            if (currentValue <= acctualRowValue) {
               dp[row] = dp[row] || acctualRowValue - currentValue == 0 || dp[row - currentValue];
            }

            if (!dp[row]) {
               missingValue = row + 1;
            }
         }

         ++index;
         if (index == nums.length + integers.size() && missingValue != 0) {
            integers.add(missingValue);
         }
      }

      return integers.size();
   }
}
