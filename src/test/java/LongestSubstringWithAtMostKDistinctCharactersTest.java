import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringWithAtMostKDistinctCharactersTest {
   @Test
   public void findSubString() throws Exception {
      assertEquals("aa", LongestSubstringWithAtMostKDistinctCharacters.findSubString("aabbcc", 1));
   }

   @Test
   public void findSubString2() throws Exception {
      assertEquals("aabb", LongestSubstringWithAtMostKDistinctCharacters.findSubString("aabbcc", 2));
   }

   @Test
   public void findSubString3() throws Exception {
      assertEquals("aaaa", LongestSubstringWithAtMostKDistinctCharacters.findSubString("aaaa", 2));
   }

   @Test
   public void findSubString4() throws Exception {
      assertEquals("", LongestSubstringWithAtMostKDistinctCharacters.findSubString("", 2));
   }

   @Test
   public void findSubString5() throws Exception {
      assertEquals("ab", LongestSubstringWithAtMostKDistinctCharacters.findSubString("abcde", 2));
   }

}