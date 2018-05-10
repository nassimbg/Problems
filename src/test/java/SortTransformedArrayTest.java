import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortTransformedArrayTest {

   @Test
   public void solution() {
      assertArrayEquals(new int[]{3, 9, 15, 33}, SortTransformedArray.solution(new int[]{-4, -2, 2, 4}, 1, 3, 5));
   }


   @Test
   public void solution2() {
      assertArrayEquals(new int[]{-23, -5, 1, 7}, SortTransformedArray.solution(new int[]{-4, -2, 2, 4}, -1, 3, 5));
   }
}