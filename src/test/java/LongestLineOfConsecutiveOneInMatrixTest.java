import static org.junit.Assert.*;

import org.junit.Test;

public class LongestLineOfConsecutiveOneInMatrixTest {

   @Test
   public void find() {

      int[][] matrix = new int[][] { { 0, 1, 1, 0 }, { 0, 1, 1, 0 }, { 0, 0, 0, 1 } };

      assertEquals(3, LongestLineOfConsecutiveOneInMatrix.find(matrix));
   }
}