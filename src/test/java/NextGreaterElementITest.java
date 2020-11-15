import org.junit.Assert;
import org.junit.Test;

public class NextGreaterElementITest {

  @Test
  public void testCase1() {
    final int[] results = NextGreaterElementI.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});

    Assert.assertArrayEquals(new int[] {-1,3,-1}, results);
  }

  @Test
  public void testCase2() {
    final int[] results = NextGreaterElementI.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4});

    Assert.assertArrayEquals(new int[] {3,-1}, results);
  }

}
