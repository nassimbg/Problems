import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("Duplicates")
public class CombinationSumII {



   public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
      Arrays.sort(candidates);
      List<List<Integer>> result = new ArrayList<>();
      dfs(candidates, target, new HashMap<>(), 0, result);

      return result;
   }

   private static void dfs(int[] candidates, int sum, Map<Integer, Integer> count, int index, List<List<Integer>> result) {
      if (sum < 0) {
         return;
      }
      if (sum == 0) {
         List<Integer> solution = new ArrayList<>();
         for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int value = entry.getKey();

            for(int counter = 0; counter < entry.getValue(); counter++) {
               solution.add(value);
            }
         }

         result.add(solution);
      } else if (index < candidates.length) {
         int currentValue = candidates[index];
         int aleardyTaken = count.getOrDefault(currentValue, 0);
         int lastIndexDiffFromCandidate = index - aleardyTaken - 1;

         dfs(candidates, sum, count, index + 1, result);

         if (lastIndexDiffFromCandidate < 0 || candidates[lastIndexDiffFromCandidate] != currentValue) {
            count.put(currentValue, aleardyTaken + 1);

            dfs(candidates, sum - currentValue, count, index + 1, result);

            if (aleardyTaken == 0) {
               count.remove(currentValue);
            } else {
               count.put(currentValue, aleardyTaken - 1);
            }
         }
      }
   }

   public static List<List<Integer>> combinationSum2DP(int[] candidates, int target) {
      Arrays.sort(candidates);

      // initialize the dp array
      List<List<List<Integer>>> dp = new ArrayList<>(target + 1);
      for (int i = 0; i < target + 1; i++) {
         dp.add(new ArrayList<>());
      }
      dp.get(0).add(new ArrayList<>());

      for (int j = candidates.length - 1; j >= 0; --j) {
         for (int i = target; i >= 0; --i) {

            if (i >= candidates[j]) {
               List<List<Integer>> child = dp.get(i - candidates[j]);

               for (List<Integer> parent : child) {
                  List<Integer> curr = new ArrayList<>();
                  curr.add(candidates[j]);
                  curr.addAll(parent);
                  List<List<Integer>> levelILists = dp.get(i);
                  if (!levelILists.contains(curr)) {
                     levelILists.add(curr);
                  }
               }
            }
         }
      }

      return dp.get(target);
   }
}
