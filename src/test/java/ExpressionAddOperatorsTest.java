import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ExpressionAddOperatorsTest {

   @Test
   public void addOperators() {
      assertEquals(Arrays.asList("1+2+3", "1*2*3"), ExpressionAddOperators.addOperators("123", 6));
   }

   @Test
   public void addOperators2() {
      assertEquals(Arrays.asList("2+3*2", "2*3+2"), ExpressionAddOperators.addOperators("232", 8));
   }

   @Test
   public void addOperators3() {
      assertEquals(Arrays.asList("1*0+5", "10-5"), ExpressionAddOperators.addOperators("105", 5));
   }


   @Test
   public void addOperators4() {
      assertEquals(Arrays.asList("0+0", "0-0", "0*0"), ExpressionAddOperators.addOperators("00", 0));
   }

   @Test
   public void addOperators5() {
      assertEquals(Arrays.asList(), ExpressionAddOperators.addOperators("3456237490", 9191));
   }

   @Test
   public void addOperators6() {
      assertEquals(Arrays.asList("2147483647"), ExpressionAddOperators.addOperators("2147483647", Integer.MAX_VALUE));
   }

}