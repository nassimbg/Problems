import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class DiagonalTraverseTest {

   @Test
   public void findDiagonalOrder() {
      int[] diagonalOrder = DiagonalTraverse.findDiagonalOrder(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });

      assertEquals("[1, 2, 4, 7, 5, 3, 6, 8, 9]", Arrays.toString(diagonalOrder));
   }
}