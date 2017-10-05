import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestPalindromicSubstringTest {
   @Test
   public void longestPalindrome1() throws Exception {

      assertEquals("bab", LongestPalindromicSubstring.longestPalindrome("babad"));
   }

   @Test
   public void longestPalindrome2() throws Exception {

      assertEquals("bb", LongestPalindromicSubstring.longestPalindrome("cbbd"));
   }


   @Test
   public void longestPalindrome3() throws Exception {

      assertEquals("aaaaaa", LongestPalindromicSubstring.longestPalindrome("cbbdbbryaaaaaa"));
   }

}