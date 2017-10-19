import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SetMatrixZeroesTest {
   @Test
   public void setZeroes() throws Exception {
      int[][] matrix = new int[][]{
        {1,2,3},
        {2,0,4},
        {4,3,0},
        {2,4,3}
      };

      int[][] expectedMatrix = new int[][]{
        {1,0,0},
        {0,0,0},
        {0,0,0},
        {2,0,0}
      };

      SetMatrixZeroes.setZeroes(matrix);
      assertArrayEquals(expectedMatrix, matrix);
   }


   @Test
   public void setZeroes1() throws Exception {
      int[][] matrix = new int[][]{
        {1,1,1},
        {0,1,2}
      };

      int[][] expectedMatrix = new int[][]{
        {0,1,1},
        {0,0,0}
      };

      SetMatrixZeroes.setZeroes(matrix);
      assertArrayEquals(expectedMatrix, matrix);
   }

   @Test
   public void setZeroes2() throws Exception {
      int[][] matrix = new int[][]{
        {0,0,0,5},
        {4,3,1,4},
        {0,1,1,4},
        {1,2,1,3},
        {0,0,1,1}
      };

      int[][] expectedMatrix = new int[][]{
        {0,0,0,0},
        {0,0,0,4},
        {0,0,0,0},
        {0,0,0,3},
        {0,0,0,0}
      };

      SetMatrixZeroes.setZeroes(matrix);
      assertArrayEquals(expectedMatrix, matrix);
   }

}