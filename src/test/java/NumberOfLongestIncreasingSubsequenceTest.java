import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfLongestIncreasingSubsequenceTest {

  @Test
  public void test1() {
    final int number = NumberOfLongestIncreasingSubsequence.findNumberOfLIS(new int[]{1, 3, 5, 4, 7});

    assertEquals(2, number);
  }

  @Test
  public void test2() {
    final int number = NumberOfLongestIncreasingSubsequence.findNumberOfLIS(new int[]{2, 2,2,2,2});

    assertEquals(5, number);
  }
}
