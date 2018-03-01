import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class RemoveInvalidParenthesesTest {

   @Test
   public void removeInvalidParentheses() {
      assertEquals(Arrays.asList("(())()", "()()()"), RemoveInvalidParentheses.removeInvalidParentheses("()())()"));
   }

   @Test
   public void removeInvalidParentheses1() {
      assertEquals(Arrays.asList("(a())()", "(a)()()"), RemoveInvalidParentheses.removeInvalidParentheses("(a)())()"));
   }

   @Test
   public void removeInvalidParentheses2() {
      assertEquals(Arrays.asList("(()((v)))t()()", "(()((v)))t(())"), RemoveInvalidParentheses.removeInvalidParentheses("(()((v)))t(()()"));
   }

   @Test
   public void removeInvalidParentheses3() {
      assertEquals(Arrays.asList(""), RemoveInvalidParentheses.removeInvalidParentheses("))"));
   }

   @Test
   public void removeInvalidParentheses4() {
      assertEquals(Arrays.asList("()"), RemoveInvalidParentheses.removeInvalidParentheses("(()"));
   }

   @Test
   public void removeInvalidParentheses5() {
      assertEquals(Arrays.asList("d"), RemoveInvalidParentheses.removeInvalidParentheses(")d))"));
   }
}