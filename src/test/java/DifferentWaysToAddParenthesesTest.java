import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class DifferentWaysToAddParenthesesTest {
   @Test
   public void diffWaysToCompute() throws Exception {
      assertEquals(Arrays.asList(0, 2), DifferentWaysToAddParentheses.diffWaysToCompute("2-1-1"));
   }

   @Test
   public void diffWaysToCompute2() throws Exception {
      assertEquals(Arrays.asList(-34, -14, -10, -10, 10), DifferentWaysToAddParentheses.diffWaysToCompute("2*3-4*5"));
   }

}