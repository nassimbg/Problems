import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BasicCalculatorTest {
   @Test
   public void calculate() throws Exception {
      BasicCalculator basicCalculator = new BasicCalculator();

      assertEquals(2, basicCalculator.calculate("1 + 1"));
   }

   @Test
   public void calculate2() throws Exception {
      BasicCalculator basicCalculator = new BasicCalculator();

      assertEquals(3, basicCalculator.calculate(" 2-1 + 2 "));
   }

   @Test
   public void calculate3() throws Exception {
      BasicCalculator basicCalculator = new BasicCalculator();

      assertEquals(23, basicCalculator.calculate("(1+(4+5+2)-3)+(6+8)"));
   }


   @Test
   public void calculate4() throws Exception {
      BasicCalculator basicCalculator = new BasicCalculator();

      assertEquals(2147483647, basicCalculator.calculate("2147483647"));
   }

   @Test
   public void calculate5() throws Exception {
      BasicCalculator basicCalculator = new BasicCalculator();

      assertEquals(-4, basicCalculator.calculate("1-(5)"));
   }
}