import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CombinationSumTest {
   @Test
   public void combinationSum1() throws Exception {
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(Arrays.asList(7));
      expected.add(Arrays.asList(2,2,3));

      assertEquals(expected, CombinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7));
   }

   @Test
   public void combinationSum2() throws Exception {
      List<List<Integer>> expected = new ArrayList<>();

      assertEquals(expected, CombinationSum.combinationSum(new int[]{2}, 1));
   }

}