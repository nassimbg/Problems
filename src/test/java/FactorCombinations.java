import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FactorCombinations {

   private Map<Integer, List<List<Integer>>> dp = new HashMap<>();
   public List<List<Integer>> getFactors(int n) {

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
