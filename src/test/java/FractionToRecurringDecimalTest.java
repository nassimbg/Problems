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

   @Test
   public void fractionToDecimal5() throws Exception {
      assertEquals("-6.25", FractionToRecurringDecimal.fractionToDecimal(-50, 8));
   }

   @Test
   public void fractionToDecimal6() throws Exception {
      assertEquals("0.0000000004656612873077392578125", FractionToRecurringDecimal.fractionToDecimal(-1, Integer.MIN_VALUE));
   }

   @Test
   public void fractionToDecimal7() throws Exception {
      assertEquals("0.0000000004656612873077392578125", FractionToRecurringDecimal.fractionToDecimal( Integer.MIN_VALUE, 1));
   }
}