import org.junit.Test;

import static org.junit.Assert.*;

public class LongestContinuousIncreasingSubsequenceTest {


  @Test
  public void test1() {
    final int number = LongestContinuousIncreasingSubsequence.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7});

    assertEquals(3, number);
  }

  @Test
  public void test2() {
    final int number = LongestContinuousIncreasingSubsequence.findLengthOfLCIS(new int[]{2,2,2,2,2});

    assertEquals(1, number);
  }
}
