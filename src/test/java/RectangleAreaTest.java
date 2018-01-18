import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectangleAreaTest {
   @Test
   public void computeArea() throws Exception {
      assertEquals(45, RectangleArea.computeArea(-3,0,3,4,0,-1,9,2));
   }

}