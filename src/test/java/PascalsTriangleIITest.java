import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class PascalsTriangleIITest {
   @Test
   public void getRow() throws Exception {
      assertEquals(Arrays.asList(1, 3, 3, 1), PascalsTriangleII.getRow(3));
   }

   @Test
   public void getRow1() throws Exception {
      assertEquals(Arrays.asList(1), PascalsTriangleII.getRow(0));
   }


}