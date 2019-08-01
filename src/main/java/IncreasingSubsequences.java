import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IncreasingSubsequences {
   public static List<List<Integer>> findSubsequences(int[] nums) {
      Map<Integer, Integer> firstOccurenceIndex = new HashMap<>();
      int[] occs = new int[nums.length];
      for (int i = 0; i < nums.length; i++) {
         int occ = firstOccurenceIndex.getOrDefault(nums[i], 0);
         occs[i] = occ;
         firstOccurenceIndex.put(nums[i], occ + 1);
      }

      List<List<Integer>> results = new ArrayList<>();
      dfs(nums, results, occs, new ArrayDeque<>(), 0);
      return results;
   }

   private static void dfs(int[] nums, List<List<Integer>> results, int[] occs, Deque<Integer> stack, int startIndex) {
      if (startIndex < nums.length) {
         for (int i = startIndex; i < nums.length; i++) {

            // why is it enough to check k from startIndex -> i?
            // cz the last value we took was at startIndex - 1 => we want to check if we skipped same value in range [startIndex, i[
            // cz this is the only case if we did, we will have a duplicate
            if(checkIfPassedSameValue(nums, startIndex, i)) {
               continue;
            }

            if (stack.isEmpty() || stack.peekLast() <= nums[i]) {
               stack.addLast(nums[i]);
               if (stack.size() > 1) {
                  results.add(new ArrayList<>(stack));
               }

               dfs(nums, results, occs, stack, i + 1);
               stack.pollLast();
            }
         }
      }
   }

   private static boolean checkIfPassedSameValue(int[] nums, int startIndex, int i) {
      for (int k = startIndex; k < i; k++) {
         if (nums[k] == nums[i]) {
            return true;
         }
      }
      return false;
   }
}
