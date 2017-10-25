import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximalRectangleTest {
   @Test
   public void maximalRectangle() throws Exception {
      char[][] matrix = new char[][] {
        {'1','0','1','0','0'},
        {'1','0','1','1','1'},
        {'1','1','1','1','1'},
        {'1','0','0','1','0'}
      };

      assertEquals(6, MaximalRectangle.maximalRectangle(matrix));
   }

}