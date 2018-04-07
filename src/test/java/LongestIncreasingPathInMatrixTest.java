import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestIncreasingPathInMatrixTest {

   @Test
   public void longestIncreasingPath() {

      int[][] matrix = new int[][] {
        {9,9,4},
        {6,6,8},
        {2,1,1}
      };

      assertEquals(4, LongestIncreasingPathInMatrix.longestIncreasingPath(matrix));
   }
}