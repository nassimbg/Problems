import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShortestPalindromeTest {
   @Test
   public void shortestPalindrome() throws Exception {
      assertEquals("aaacecaaa", ShortestPalindrome.shortestPalindrome("aacecaaa"));
   }

   @Test
   public void shortestPalindrome2() throws Exception {
      assertEquals("dcbabcd", ShortestPalindrome.shortestPalindrome("abcd"));
   }

   @Test
   public void shortestPalindrome3() throws Exception {
      assertEquals("", ShortestPalindrome.shortestPalindrome(""));
   }

}