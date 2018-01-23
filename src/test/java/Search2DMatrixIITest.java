import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Search2DMatrixIITest {
   @Test
   public void searchMatrix() throws Exception {
      int[][] matrix = new int[][] {
        { 1, 4, 7, 11, 15 },
        { 2, 5, 8, 12, 19 },
        { 3, 6, 9, 16, 22 },
        { 10, 13, 14, 17, 24 },
        { 18, 21, 23, 26, 30 }
      };

      assertTrue(Search2DMatrixII.searchMatrix(matrix, 5));
      assertFalse(Search2DMatrixII.searchMatrix(matrix, 20));
   }


}