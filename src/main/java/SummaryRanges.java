import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

   public static List<String> summaryRanges(int[] nums) {
      List<String> results = new ArrayList<>();

      int left = 0;
      int right = 1;

      while(right <= nums.length) {

         boolean passed = false;
         while (right < nums.length && nums[right] == nums[right - 1] + 1) {
            passed = true;
            right++;
         }

         if (passed) {
            results.add(nums[left] + "->" + nums[right - 1]);
         } else if (right - 1 == left) {
            results.add("" + nums[left]);
         }

         left = right;
         right++;
      }

      return results;
   }

   public static List<String> summaryRanges2(int[] nums) {

      List<String> result = new ArrayList<>();

      if (nums.length == 0) {
         return result;
      }

      int localMin = nums[0];
      int localMax = nums[0];
      for (int i = 1; i < nums.length; i++) {
         if (nums[i] == nums[i - 1] + 1) {
            localMax = nums[i];
         } else{
            addToResult(result, localMin, localMax);
            localMin = nums[i];
            localMax = nums[i];
         }
      }

      addToResult(result, localMin, localMax);

      return result;
   }

   private static boolean addToResult(List<String> result, int localMin, int localMax) {
      return result.add("" + localMin + (localMax == localMin ? "" : "->" + localMax));
   }
}


