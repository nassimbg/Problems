import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * In this problem we solve the DP in two ways:
 * 1- using 2D array (normal Subset Sum (Knapsack Problem))
 * 2- using 1D array
 *
 * to solve using 1D array, we should look at the DP choice that we have.
 * DP Problem is:
 *  dp[i][j] = MAX(dp[i][j+1], dp[i- candidates[j]][j])
 *
 *  since for every cell we only look at the neighbouring cell in the j+1 column and child cell in the same columns
 *  => we can decrease the 2D array into two 1D array: one to store values of j+1 and the other to store values of column j.
 *
 *  In order to optimize more we can combine these two 1D arrays into only 1 1D array
 *  by overlapping the values of j+1 column with the new values of j column
 *
 *  The Optimized combinationSum function below was refactored from combinationSumOriginal function
 *
 */
public class CombinationSum {

   public static List<List<Integer>> combinationSum(int[] candidates, int target) {
      final ArrayList<List<Integer>> results = new ArrayList<>();
      dfs(results, candidates, target, new ArrayDeque<>(), 0);

      return results;
   }

   private static void dfs(List<List<Integer>> results, int[] candidates, int target, Deque<Integer> values, int index) {
      if (target == 0) {
         results.add(new ArrayList<>(values));
      } else if (index == candidates.length || target < 0) {
         return;
      } else {
         for (int i = index; i < candidates.length; i++) {
            values.addLast(candidates[i]);
            dfs(results, candidates, target - candidates[i], values, i);
            values.pollLast();
         }
      }
   }

   public static List<List<Integer>> combinationSumOriginal(int[] candidates, int target) {

      Combination[][] dp = new Combination[target + 1][candidates.length + 1];

      dp[0][candidates.length] = new Combination();
      dp[0][candidates.length].values.add(new ArrayList<>());

      for (int j = candidates.length - 1; j >= 0; --j) {
         for (int i = 0; i <= target; i++) {
            Combination currentCombination = new Combination();

            Combination neighbor = dp[i][j + 1];
            if (neighbor != null) {
               currentCombination.values.addAll(neighbor.values);
            }

            if (i >= candidates[j]) {
               Combination child = dp[i - candidates[j]][j];

               if (child != null) {
                  for (List<Integer> parent : child.values) {
                     List<Integer> curr = new ArrayList<>();
                     curr.add(candidates[j]);
                     curr.addAll(parent);
                     currentCombination.values.add(curr);
                  }

               }
            }

            dp[i][j] = currentCombination;

         }
      }

      return dp[target][0].values;
   }


   public static List<List<Integer>> combinationSumOld(int[] candidates, int target) {

      // initialize the dp array
      List<List<List<Integer>>> dp = new ArrayList<>(target + 1);
      for (int i = 0; i < target + 1; i++) {
         dp.add(new ArrayList<>());
      }
      dp.get(0).add(new ArrayList<>());

      for (int j = candidates.length - 1; j >= 0; --j) {
         for (int i = 0; i <= target; i++) {

            if (i >= candidates[j]) {
               List<List<Integer>> child = dp.get(i - candidates[j]);

               for (List<Integer> parent : child) {
                  List<Integer> curr = new ArrayList<>();
                  curr.add(candidates[j]);
                  curr.addAll(parent);
                  dp.get(i).add(curr);
               }
            }
         }
      }

      return dp.get(target);
   }

   public static final class Combination {
      List<List<Integer>> values;

      Combination() {
         values = new ArrayList<>();
      }
   }
}
