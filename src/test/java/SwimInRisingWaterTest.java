import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SwimInRisingWaterTest {

   @Test
   public void swimInWater() {
      int[][] grid = new int[][]{{0,1,2,3,4},{24,23,22,21,5},{12,13,14,15,16},{11,17,18,19,20},{10,9,8,7,6}};

      assertEquals(16, SwimInRisingWater.swimInWater(grid));
   }
}