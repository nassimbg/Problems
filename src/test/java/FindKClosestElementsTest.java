import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FindKClosestElementsTest {

  @Test
  public void test1() {
    final List<Integer> result = FindKClosestElements.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3);

    assertEquals(Arrays.asList(1,2,3,4), result);
  }

  @Test
  public void test2() {
    final List<Integer> result = FindKClosestElements.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, -1);

    assertEquals(Arrays.asList(1,2,3,4), result);
  }

}
