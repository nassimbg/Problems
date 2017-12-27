import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DungeonGameTest {
   @Test
   public void calculateMinimumHP() throws Exception {
      int[][] game = new int[][]{
        {-2, -3, 3},
        {-5, -10, 1},
        {10, 30, -5}
      };

      assertEquals(7, DungeonGame.calculateMinimumHP(game));
   }

   @Test
   public void calculateMinimumHP1() throws Exception {
      int[][] game = new int[][]{
        {-3, 5}
      };

      assertEquals(4, DungeonGame.calculateMinimumHP(game));
   }
}