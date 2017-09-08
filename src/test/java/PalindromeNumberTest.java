import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeNumberTest {
   @Test
   public void isPalindrome() throws Exception {

      assertFalse(PalindromeNumber.isPalindrome(-2147483648));
   }

   @Test
   public void isPalindrome1() throws Exception {

      assertFalse(PalindromeNumber.isPalindrome(-10));
   }


   @Test
   public void isPalindrome12() throws Exception {

      assertTrue(PalindromeNumber.isPalindrome(-2147447412));
   }
}