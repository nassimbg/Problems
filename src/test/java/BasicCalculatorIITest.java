import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BasicCalculatorIITest {
   @Test
   public void calculate() throws Exception {
      BasicCalculatorII basicCalculatorII = new BasicCalculatorII();
      assertEquals(7, basicCalculatorII.calculate("3+2*2"));
   }

   @Test
   public void calculate2() throws Exception {
      BasicCalculatorII basicCalculatorII = new BasicCalculatorII();
      assertEquals(1, basicCalculatorII.calculate(" 3/2 "));
   }

   @Test
   public void calculate3() throws Exception {
      BasicCalculatorII basicCalculatorII = new BasicCalculatorII();
      assertEquals(5, basicCalculatorII.calculate(" 3+5 / 2 "));
   }

   @Test
   public void calculate4() throws Exception {
      BasicCalculatorII basicCalculatorII = new BasicCalculatorII();
      assertEquals(5, basicCalculatorII.calculate(" 5        "));
   }

   @Test
   public void calculate5() throws Exception {
      BasicCalculatorII basicCalculatorII = new BasicCalculatorII();
      assertEquals(3, basicCalculatorII.calculate("4/3+2"));
   }
}