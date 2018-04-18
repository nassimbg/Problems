import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerBreakTest {

   @Test
   public void integerBreak() {
      assertEquals(36, IntegerBreak.integerBreak(10));
   }

   @Test
   public void integerBreak3() {
      assertEquals(1, IntegerBreak.integerBreak(2));
   }



   @Test
   public void integerBreak4() {
      assertEquals(2187, IntegerBreak.integerBreak(21));
   }

}