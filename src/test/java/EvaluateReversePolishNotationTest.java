import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvaluateReversePolishNotationTest {
   @Test
   public void evalRPN() throws Exception {
      assertEquals(9, EvaluateReversePolishNotation.evalRPN(new String[] { "2", "1", "+", "3", "*" }));
   }

   @Test
   public void evalRPN1() throws Exception {
      assertEquals(6, EvaluateReversePolishNotation.evalRPN(new String[] { "4", "13", "5", "/", "+"}));
   }

}