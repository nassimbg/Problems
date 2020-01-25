import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
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


   public List<List<Integer>> subsets2(int[] nums) {
      List<List<Integer>> results = new ArrayList<>();
      dfs2(nums, 0, new ArrayDeque<>(), results);
      return results;
   }

   private static void dfs2(int[] nums, int index, Deque<Integer> currentResult, List<List<Integer>> results) {
      if (index == nums.length) {
         results.add(new ArrayList<>(currentResult));
      } else {
         for (int i = index; i < nums.length; i++) {
            currentResult.addLast(nums[i]);
            dfs2(nums, i + 1, currentResult, results);
            currentResult.pollLast();
            dfs2(nums, i + 1, currentResult, results);
         }
      }
   }
}
