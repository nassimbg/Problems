import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfTwoIntegersTest {

   @Test
   public void getSum() {
      assertEquals(3, SumOfTwoIntegers.getSum(2, 1));
   }

   @Test
   public void getSum4() {
      assertEquals(27, SumOfTwoIntegers.getSum(20, 7));
   }


   @Test
   public void getSum2() {
      assertEquals(-7, SumOfTwoIntegers.getSum(-2, -5));
   }
}