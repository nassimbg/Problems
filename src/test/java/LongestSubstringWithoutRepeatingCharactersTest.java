import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by nboughannam on 6/10/2017.
 */
public class LongestSubstringWithoutRepeatingCharactersTest {
   @Test
   public void lengthOfLongestSubstring0() throws Exception {

      assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb"));
   }

   @Test
   public void lengthOfLongestSubstring1() throws Exception {

      assertEquals(1, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb"));
   }

   @Test
   public void lengthOfLongestSubstring2() throws Exception {

      assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"));
   }

   @Test
   public void lengthOfLongestSubstring3() throws Exception {

      assertEquals(0, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(""));
   }
}
