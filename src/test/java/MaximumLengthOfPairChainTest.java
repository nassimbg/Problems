import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumLengthOfPairChainTest {

  @Test
  public void test1(){
    final int longestChain = MaximumLengthOfPairChain.findLongestChain(new int[][]{{1, 2}, {2, 3}, {3, 4}});

    assertEquals(2, longestChain);
  }


  @Test
  public void test2(){
    final int longestChain = MaximumLengthOfPairChain.findLongestChain(new int[][]{{3, 4}, {2, 3}, {1, 2}});

    assertEquals(2, longestChain);
  }
}
