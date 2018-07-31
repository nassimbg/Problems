import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveKDigitsTest {

   @Test
   public void removeKdigits() {
      assertEquals("1219", RemoveKDigits.removeKdigits("1432219", 3));
   }

   @Test
   public void removeKdigits2() {
      assertEquals("200", RemoveKDigits.removeKdigits("10200", 1));
   }

   @Test
   public void removeKdigits3() {
      assertEquals("0", RemoveKDigits.removeKdigits("10", 2));
   }
}