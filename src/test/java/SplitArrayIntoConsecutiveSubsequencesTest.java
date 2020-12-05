import org.junit.Test;

import static org.junit.Assert.*;

public class SplitArrayIntoConsecutiveSubsequencesTest {

  @Test
  public void test1() {
    assertTrue(SplitArrayIntoConsecutiveSubsequences.isPossible(new int[] {1,2,3,3,4,5}));
  }

  @Test
  public void test2() {
    assertTrue(SplitArrayIntoConsecutiveSubsequences.isPossible(new int[] {1,2,3,3,4,4,5,5}));
  }


  @Test
  public void test3() {
    assertFalse(SplitArrayIntoConsecutiveSubsequences.isPossible(new int[] {1,2,3,4,4,5}));
  }
}
