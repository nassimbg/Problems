import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NQueensTest {
   @Test
   public void solveNQueens1() throws Exception {


      assertEquals("[[.Q.., ...Q, Q..., ..Q.], [..Q., Q..., ...Q, .Q..]]", NQueens.solveNQueens(4).toString());
   }

}