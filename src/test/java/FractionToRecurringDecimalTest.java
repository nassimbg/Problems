import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FractionToRecurringDecimalTest {
   @Test
   public void fractionToDecimal() throws Exception {
     assertEquals("0.5", FractionToRecurringDecimal.fractionToDecimal(1, 2));
   }

   @Test
   public void fractionToDecimal2() throws Exception {
      assertEquals("0.(6)", FractionToRecurringDecimal.fractionToDecimal(2, 3));
   }

   @Test
   public void fractionToDecimal3() throws Exception {
      assertEquals("2", FractionToRecurringDecimal.fractionToDecimal(2, 1));
   }

   @Test
   public void fractionToDecimal4() throws Exception {
      assertEquals("0.1(6)", FractionToRecurringDecimal.fractionToDecimal(1, 6));
   }
}