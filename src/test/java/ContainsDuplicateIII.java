import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateIII {
   public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
      Map<Integer, Integer> buckets = new HashMap<>();

      for (int index = 0; index < nums.length; index++) {
         int bucketKey = t != 0 ? nums[index] / t : nums[index];

         if (checkConditions(nums, k, t, buckets, index, bucketKey) || checkConditions(nums, k, t, buckets, index, bucketKey + 1) || checkConditions(nums, k, t, buckets, index, bucketKey - 1)) {
            return true;
         }

         buckets.put(bucketKey, index);

      }

      return false;
   }

   private static boolean checkConditions(int[] nums, int k, int t, Map<Integer, Integer> buckets, int index, int bucketKey) {
      Integer value = buckets.get(bucketKey);

      long b = nums[index];
      return value != null && Math.abs(value - index) <= k && Math.abs(b - nums[value]) <= t;
   }
}
