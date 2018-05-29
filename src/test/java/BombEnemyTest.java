import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BombEnemyTest {

   @Test
   public void solution() {
      char[][] grid = new char[][] {
        {'0', 'E', '0', '0'},
        {'E', '0', 'W', 'E'},
        {'0', 'E', '0', '0'}
      };

      assertEquals(3, BombEnemy.solution(grid));
   }

}