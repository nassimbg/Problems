import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidParenthesesTest {
   @Test
   public void isValid1() throws Exception {
      assertTrue(ValidParentheses.isValid("(){}[]"));
   }

   @Test
   public void isValid2() throws Exception {
      assertTrue(ValidParentheses.isValid("({[]})"));
   }

   @Test
   public void isValid3() throws Exception {
      assertFalse(ValidParentheses.isValid("(}(}[]"));
   }

}