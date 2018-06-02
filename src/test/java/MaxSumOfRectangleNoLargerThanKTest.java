import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxSumOfRectangleNoLargerThanKTest {

   @Test
   public void maxSumSubmatrix() {
      int[][] matrix = new int[][] { { 1, 0, 1 }, { 0, -2, 3 } };

      assertEquals(2, MaxSumOfRectangleNoLargerThanK.maxSumSubmatrix(matrix, 2));
   }


   @Test
   public void maxSumSubmatrix2() {
      int[][] matrix = new int[][] { { 2,2,-1} };

      assertEquals(-1, MaxSumOfRectangleNoLargerThanK.maxSumSubmatrix(matrix, 0));
   }
}