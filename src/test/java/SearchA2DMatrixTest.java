import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SearchA2DMatrixTest {
   @Test
   public void searchMatrix() throws Exception {
      int[][] matrix = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };

      assertTrue(SearchA2DMatrix.searchMatrix(matrix, 3));
   }

   @Test
   public void searchMatrix1() throws Exception {
      int[][] matrix = new int[][] { { 1} };

      assertFalse(SearchA2DMatrix.searchMatrix(matrix, 0));
   }

   @Test
   public void searchMatrix2() throws Exception {
      int[][] matrix = new int[][] { { 1,1} };

      assertFalse(SearchA2DMatrix.searchMatrix(matrix, 2));
   }

   @Test
   public void searchMatrix3() throws Exception {
      int[][] matrix = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };

      assertTrue(SearchA2DMatrix.searchMatrix(matrix, 11));
   }
}