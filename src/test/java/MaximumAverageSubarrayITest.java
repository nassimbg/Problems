import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumAverageSubarrayITest {

  @Test
  public void test1(){
    final double maxAverage = MaximumAverageSubarrayI.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);

    assertEquals(12.75, maxAverage, 0.001);
  }

  @Test
  public void test2(){
    final double maxAverage = MaximumAverageSubarrayI.findMaxAverage(new int[]{-1}, 1);

    assertEquals(-1.00, maxAverage, 0.001);
  }
}

