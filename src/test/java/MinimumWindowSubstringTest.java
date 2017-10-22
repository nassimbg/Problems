import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumWindowSubstringTest {
   @Test
   public void minWindow() throws Exception {
      assertEquals("BANC", MinimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
   }

   @Test
   public void minWindow1() throws Exception {
      assertEquals("", MinimumWindowSubstring.minWindow("ADOBECODEBANC", "ABCZ"));
   }

   @Test
   public void minWindow2() throws Exception {
      assertEquals("", MinimumWindowSubstring.minWindow("", "ABCZ"));
   }

   @Test
   public void minWindow3() throws Exception {
      assertEquals("", MinimumWindowSubstring.minWindow("", ""));
   }

   @Test
   public void minWindow4() throws Exception {
      assertEquals("ba", MinimumWindowSubstring.minWindow("bba", "ab"));
   }



}