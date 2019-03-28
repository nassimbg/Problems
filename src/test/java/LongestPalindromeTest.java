import static org.junit.Assert.*;

import org.junit.Test;

public class LongestPalindromeTest {

   @Test
   public void longestPalindrome() {
      int longestPalindrome = LongestPalindrome.longestPalindrome("abccccdd");

      assertEquals(7, longestPalindrome);
   }
}