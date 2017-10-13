import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class NQueensTest {
   @Test
   public void solveNQueens1() throws Exception {

      assertEquals(new ArrayList<>(), NQueens.solveNQueens(4));
   }

}