import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InterleavingStringTest {
   @Test
   public void isInterleave() throws Exception {
      assertTrue(InterleavingString.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
   }

   @Test
   public void isInterleave1() throws Exception {
      assertFalse(InterleavingString.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
   }

   @Test
   public void isInterleave2() throws Exception {
      assertFalse(InterleavingString.isInterleave("aabcc", "dbbca", ""));
   }

   @Test
   public void isInterleave3() throws Exception {
      assertTrue(InterleavingString.isInterleave("", "", ""));
   }

   @Test
   public void isInterleave4() throws Exception {
      assertFalse(InterleavingString.isInterleave("aa", "", ""));
   }

   @Test
   public void isInterleave5() throws Exception {
      assertTrue(InterleavingString.isInterleave("at", "", "at"));
   }

   @Test
   public void isInterleave6() throws Exception {
      assertTrue(InterleavingString.isInterleave("at", "bzsre", "bzastre"));
   }

   @Test
   public void isInterleave7() throws Exception {
      assertFalse(InterleavingString.isInterleave("bbbbbabbbbabaababaaaabbababbaaabbabbaaabaaaaababbbababbbbbabbbbababbabaabababbbaabababababbbaaababaa",
        "babaaaabbababbbabbbbaabaabbaabbbbaabaaabaababaaaabaaabbaaabaaaabaabaabbbbb",
        "babbbabbbaaabbababbbbababaabbabaabaaabbbbabbbaaabbbaaaaabbbbaabbaaabababbaaaaaabababbababaababbababbbababbbbaaaabaabbabbaaaaabbabbaaaabbbaabaaabaababaababbaaabbbbbabbbbaabbabaabbbbabaaabbababbabbabbab"));
   }

}