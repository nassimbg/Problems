import static org.junit.Assert.*;

import org.junit.Test;

public class ReshapeTheMatrixTest {

   @Test
   public void matrixReshape() {
      int[][] mat = new int[][] { { 1, 2 }, { 3, 4 } };
      int[][] actual = ReshapeTheMatrix.matrixReshape(mat, 1, 4);

      int[][] exp = new int[][] { { 1, 2, 3, 4 } };

      assertArrayEquals(exp, actual);
   }
}