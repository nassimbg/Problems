import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FactorCombinations {

   private Map<Integer, List<List<Integer>>> dp = new HashMap<>();




   public List<List<Integer>> getFactors(int n) {
      List<List<Integer>> result = new ArrayList<>();

      dfs(result, n, 2, new ArrayList<>());
      return result;
   }

   private static void dfs(List<List<Integer>> result, int target, int start,  List<Integer> temp) {
      if (target > 1) {
         for(int multiplier = start; multiplier < target; ++multiplier) {

            int multiplicent = target / multiplier;

            if (target % multiplier == 0 && multiplicent >= multiplier) {
               temp.add(multiplier);
               temp.add(multiplicent);
               result.add(new ArrayList<>(temp));
               temp.remove(temp.size() - 1);

               // todo pass the multiplier as a start point to decompose the multiplicent so that the decomposed factors are >= to multiplier
               // todo => preserve the asc order in the resulting array
               dfs(result, multiplicent , multiplier, temp);
               temp.remove(temp.size() - 1);
            }
         }
      }
   }

   public List<List<Integer>> getFactors2(int n) {

      List<List<Integer>> result = dp.getOrDefault(n, new ArrayList<>());

      if (!result.isEmpty()) {
         return result;
      }
      int radical = (int) Math.sqrt(n);

      for (int val = 2; val <= radical; val++) {
         if (n % val == 0) {
            int multiplicant = n / val;

            if (val <= multiplicant) {
               List<Integer> partial = new ArrayList<>();
               partial.add(val);
               partial.add(multiplicant);

               result.add(partial);

               if (val < multiplicant) {
                  List<List<Integer>> factors = getFactors(multiplicant);

                  for (List<Integer> factor : factors) {
                     if (!factor.isEmpty() && val <= factor.get(0)) {
                        partial = new ArrayList<>(factor.size() + 1);
                        partial.add(val);
                        partial.addAll(factor);
                        result.add(partial);
                     }
                  }
               }
            }
         }
      }

      dp.put(n, result);
      return result;
   }
}
