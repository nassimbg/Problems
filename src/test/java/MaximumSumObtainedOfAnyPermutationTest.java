import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSumObtainedOfAnyPermutationTest {

  @Test
  public void test1() {
    int result = MaximumSumObtainedOfAnyPermutation.maxSumRangeQuery(new int[] {1,2,3,4,5},
        new int[][]{
            {1,3},
            {0,1}
        });
    assertEquals(19, result);
  }

  @Test
  public void test2() {
    int result = MaximumSumObtainedOfAnyPermutation.maxSumRangeQuery(new int[] {1,2,3,4,5,6},
        new int[][]{
            {0,1}
        });
    assertEquals(11, result);
  }

  @Test
  public void test3() {
    int result = MaximumSumObtainedOfAnyPermutation.maxSumRangeQuery(new int[] {1,2,3,4,5,10},
        new int[][]{
            {0,2},
            {1,3},
            {1,1}
        });
    assertEquals(47, result);
  }
}
