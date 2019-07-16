import static org.junit.Assert.*;

import org.junit.Test;

public class IslandPerimeterTest {

   @Test
   public void islandPerimeter() {
      int[][] arr = new int[][] { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };

      assertEquals(16, IslandPerimeter.islandPerimeter(arr));
   }
}