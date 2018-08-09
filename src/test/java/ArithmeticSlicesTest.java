import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArithmeticSlicesTest {

   @Test
   public void numberOfArithmeticSlices() {
      assertEquals(3, ArithmeticSlices.numberOfArithmeticSlices(new int[] { 1, 2, 3, 4 }));
   }

   @Test
   public void numberOfArithmeticSlices3() {
      assertEquals(1, ArithmeticSlices.numberOfArithmeticSlices(new int[] { 1, 2, 3}));
   }


   @Test
   public void numberOfArithmeticSlices2() {
      assertEquals(0, ArithmeticSlices.numberOfArithmeticSlices(new int[] { 1, 2, 5, 7 }));
   }
}