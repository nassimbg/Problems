import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class WallsAndGatesTest {

   @Test
   public void fillGrid() {
      int[][] matrix = new int[][] {
        {Integer.MAX_VALUE, -1,0,Integer.MAX_VALUE},
        {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1},
        {Integer.MAX_VALUE, -1, Integer.MAX_VALUE, -1},
        {0, -1, Integer.MAX_VALUE, Integer.MAX_VALUE}
      };



      int[][] ex = new int[][] {
        {3, -1,0,1},
        {2, 2, 1, -1},
        {1, -1, 2, -1},
        {0, -1, 3, 4}
      };

      WallsAndGates.fillVersion2(matrix);

      assertArrayEquals(ex, matrix);

   }
}
