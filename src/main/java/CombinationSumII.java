import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("Duplicates")
public class CombinationSumII {

   public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
