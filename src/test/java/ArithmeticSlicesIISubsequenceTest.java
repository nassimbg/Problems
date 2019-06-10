import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticSlicesIISubsequenceTest {

   @Test
   public void numberOfArithmeticSlices() {
      int number = ArithmeticSlicesIISubsequence.numberOfArithmeticSlices(new int[] { 2, 4, 6, 8, 10 });

      assertEquals(7, number);
   }


   @Test
   public void numberOfArithmeticSlices2() {
      int number = ArithmeticSlicesIISubsequence.numberOfArithmeticSlices(new int[] { 0, 1,2,2,2 });

      assertEquals(4, number);
   }
}