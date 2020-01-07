import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ZeroOneMatrixTest {

   @Test
   public void updateMatrix() {
      int[][] matrix = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };

      int[][] ints = ZeroOneMatrix.updateMatrix(matrix);
      assertEquals("[[0, 0, 0], [0, 1, 0], [0, 0, 0]]", Arrays.deepToString(ints));
   }
   

   @Test
   public void updateMatrix2() {
      int[][] matrix = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 1,1,1} };

      int[][] ints = ZeroOneMatrix.updateMatrix(matrix);
      assertEquals("[[0, 0, 0], [0, 1, 0], [1, 2, 1]]", Arrays.deepToString(ints));
   }


   @Test
   public void updateMatrix3() {
      int[][] matrix = new int[][] { {0,1,0},{0,1,0},{0,1,0},{0,1,0},{0,1,0} };

      int[][] ints = ZeroOneMatrix.updateMatrix(matrix);
      assertEquals("[[0, 1, 0], [0, 1, 0], [0, 1, 0], [0, 1, 0], [0, 1, 0]]", Arrays.deepToString(ints));
   }

   @Test
   public void updateMatrix4() {
      int[][] matrix = new int[][] {
        {0,0,1,0,1,1,1,0,1,1},
        {1,1,1,1,0,1,1,1,1,1},
        {1,1,1,1,1,0,0,0,1,1},
        {1,0,1,0,1,1,1,0,1,1},
        {0,0,1,1,1,0,1,1,1,1},
        {1,0,1,1,1,1,1,1,1,1},
        {1,1,1,1,0,1,0,1,0,1},
        {0,1,0,0,0,1,0,0,1,1},
        {1,1,1,0,1,1,0,1,0,1},
        {1,0,1,1,1,0,1,1,1,0}
      };

      int[][] ints = ZeroOneMatrix.updateMatrix(matrix);
      assertEquals("[[0, 0, 1, 0, 1, 2, 1, 0, 1, 2], [1, 1, 2, 1, 0, 1, 1, 1, 2, 3], [2, 1, 2, 1, 1, 0, 0, 0, 1, 2], [1, 0, 1, 0, 1, 1, 1, 0, 1, 2], [0, 0, 1, 1, 1, 0, 1, 1, 2, 3], [1, 0, 1, 2, 1, 1, 1, 2, 1, 2], [1, 1, 1, 1, 0, 1, 0, 1, 0, 1], [0, 1, 0, 0, 0, 1, 0, 0, 1, 2], [1, 1, 1, 0, 1, 1, 0, 1, 0, 1], [1, 0, 1, 1, 1, 0, 1, 2, 1, 0]]", Arrays.deepToString(ints));
   }

}