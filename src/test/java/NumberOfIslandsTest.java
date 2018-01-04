import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfIslandsTest {
   @Test
   public void numIslands() throws Exception {
      char[][] islands = new char[][] {
        {'1', '1', '1', '1', '0'},
        {'1', '1', '0', '1', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '0', '0', '0'}
      };

      assertEquals(1, NumberOfIslands.numIslands(islands));
   }

   @Test
   public void numIslands2() throws Exception {
      char[][] islands = new char[][] {
        {'1', '1', '0', '0', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '1', '0', '0'},
        {'0', '0', '0', '1', '1'}
      };

      assertEquals(3, NumberOfIslands.numIslands(islands));
   }

}