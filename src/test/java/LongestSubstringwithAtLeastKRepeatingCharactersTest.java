import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringwithAtLeastKRepeatingCharactersTest {

   @Test
   public void longestSubstring() {
      assertEquals(3, new LongestSubstringwithAtLeastKRepeatingCharacters().longestSubstring("aaabb", 3));
   }

   @Test
   public void longestSubstring2() {
      assertEquals(5, new LongestSubstringwithAtLeastKRepeatingCharacters().longestSubstring("ababbc", 2));
   }

   @Test
   public void longestSubstring3() {
      assertEquals(0, new LongestSubstringwithAtLeastKRepeatingCharacters().longestSubstring("abcdedghijklmnopqrstuvwxyz", 2));
   }

}