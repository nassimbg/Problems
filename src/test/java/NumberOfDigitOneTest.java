import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfDigitOneTest {
   @Test
   public void countDigitOne() throws Exception {
      assertEquals(6, NumberOfDigitOne.countDigitOne(13));
   }

   @Test
   public void countDigitOne2() throws Exception {
      assertEquals(2, NumberOfDigitOne.countDigitOne(10));
   }



}