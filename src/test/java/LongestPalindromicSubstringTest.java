import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestPalindromicSubstringTest {
   @Test
   public void longestPalindrome1() throws Exception {

      assertEquals("bab", new LongestPalindromicSubstring().longestPalindrome("babad"));
   }

   @Test
   public void longestPalindrome2() throws Exception {

      assertEquals("bb",  new LongestPalindromicSubstring().longestPalindrome("cbbd"));
   }


   @Test
   public void longestPalindrome3() throws Exception {

      assertEquals("aaaaaa",  new LongestPalindromicSubstring().longestPalindrome("cbbdbbryaaaaaa"));
   }

   @Test
   public void longestPalindrome4() throws Exception {

      assertEquals("adada",  new LongestPalindromicSubstring().longestPalindrome("babadada"));
   }

   @Test
   public void longestPalindrome5() throws Exception {

      assertEquals("adada",  new LongestPalindromicSubstring().longestPalindrome("babaddtattarrattatddetartrateedredividerb"));
   }
}