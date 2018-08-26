import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
   public List<List<Integer>> subsetsWithDup(int[] nums) {
      Arrays.sort(nums);

      List<List<Integer>> result = new ArrayList<>();
      for(int length = 0;  length <= nums.length ; ++length) {
         dfs(nums, result, 0, length, new ArrayList<>());
      }

      return result;
   }

   private static void dfs(int[] nums, List<List<Integer>> result, int startIndex, int length, List<Integer> tempOut) {
      if (length == 0) {
         result.add(new ArrayList<>(tempOut));
      } else {
         for(int index = startIndex; index < nums.length; index++) {

            if (checkValidity(nums, tempOut, index)) {
               tempOut.add(nums[index]);
               dfs(nums, result, index + 1, length - 1, tempOut);
               tempOut.remove(tempOut.size() - 1);
            }
         }
      }
   }

   private static boolean checkValidity(int[] nums, List<Integer> tempOut, int index ) {
      int minIndex = 1;
      while (index - minIndex > 0 && nums[index - minIndex] == nums[index]) {
         if (minIndex > tempOut.size() || tempOut.get(tempOut.size() - minIndex) != nums[index]) {
            return false;
         }
         ++minIndex;
      }

      return true;
   }
}
