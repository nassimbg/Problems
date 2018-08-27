import java.util.ArrayList;
import java.util.List;

public class Subset {
   public List<List<Integer>> subsets(int[] nums) {

      List<List<Integer>> result = new ArrayList<>();
      for (int length = 0; length <= nums.length; ++length) {
         dfs(nums, length, result, new ArrayList<>(), 0);
      }

      return result;
   }

   private static void dfs(int[] nums, int length, List<List<Integer>> result, List<Integer> container, int startingIndex) {

      if (length == 0) {
         result.add(new ArrayList<>(container));
      } else {

         for (int index = startingIndex; index < nums.length; ++index) {
            container.add(nums[index]);
            dfs(nums, length - 1, result, container, index + 1);
            container.remove(container.size() - 1);
         }

      }
   }
}
