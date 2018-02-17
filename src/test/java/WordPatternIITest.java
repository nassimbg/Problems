import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WordPatternIITest {

   @Test
   public void wordPatternMatch() {
      assertTrue(WordPatternII.wordPatternMatch("abab", "redblueredblue"));
   }

   @Test
   public void wordPatternMatch2() {
      assertTrue(WordPatternII.wordPatternMatch("aaaa", "asdasdasdasd"));
   }

   @Test
   public void wordPatternMatch3() {
      assertFalse(WordPatternII.wordPatternMatch("aabb",  "xyzabcxzyabc"));
   }

}