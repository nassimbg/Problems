import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class NumberOfIslandsIITest {

   @Test
   public void numIslands2() {
      NumberOfIslandsII numberOfIslandsII = new NumberOfIslandsII();

      int[][] positins = new int[][] {
        {0,0},
        {0,1},
        {1,2},
        {2,1}
      };
      List<Integer> integers = numberOfIslandsII.numIslands2(3, 3, positins);

      assertEquals(Arrays.asList(1, 1, 2, 3), integers);
   }

}