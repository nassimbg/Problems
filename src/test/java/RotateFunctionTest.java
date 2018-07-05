import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RotateFunctionTest {

   @Test
   public void maxRotateFunction() {
      assertEquals(26, RotateFunction.maxRotateFunction(new int[] { 4, 3, 2, 6 }));
   }

   @Test
   public void maxRotateFunction2() {
      assertEquals(-2147483648, RotateFunction.maxRotateFunction(new int[] { -2147483648,-2147483648 }));
   }
}