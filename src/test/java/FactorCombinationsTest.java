import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FactorCombinationsTest {

   @Test
   public void getFactors() {
      List<List<Integer>> factors = new FactorCombinations().getFactors(32);

      List<List<Integer>> expected = new ArrayList<>();
      expected.add(Arrays.asList(2, 16));
      expected.add(Arrays.asList(2, 2,8));
      expected.add(Arrays.asList(2, 2,2, 4));
      expected.add(Arrays.asList(2, 2,2, 2,2));
      expected.add(Arrays.asList(2, 4,4));
      expected.add(Arrays.asList(4,8));
      assertEquals(expected, factors);
   }

   @Test
   public void getFactors2() {
      List<List<Integer>> factors = new FactorCombinations().getFactors(12);

      List<List<Integer>> expected = new ArrayList<>();
      expected.add(Arrays.asList(2, 6));
      expected.add(Arrays.asList(2, 2,3));
      expected.add(Arrays.asList(3, 4));
      assertEquals(expected, factors);
   }

   @Test
   public void getFactors3() {
      List<List<Integer>> factors = new FactorCombinations().getFactors(37);

      List<List<Integer>> expected = new ArrayList<>();
      assertEquals(expected, factors);
   }

   @Test
   public void getFactors4() {
      List<List<Integer>> factors = new FactorCombinations().getFactors(1);

      List<List<Integer>> expected = new ArrayList<>();
      assertEquals(expected, factors);
   }

   @Test
   public void getFactors5() {
      List<List<Integer>> factors = new FactorCombinations().getFactors(2);

      List<List<Integer>> expected = new ArrayList<>();
      assertEquals(expected, factors);
   }
}