import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WildcardMatchingTest {
   @Test
   public void isMatch() throws Exception {

      assertFalse(WildcardMatching.isMatch("aa", "a"));
   }

   @Test
   public void isMatch2() throws Exception {

      assertTrue(WildcardMatching.isMatch("aa", "aa"));
   }

   @Test
   public void isMatch3() throws Exception {

      assertFalse(WildcardMatching.isMatch("aaa", "aa"));
   }

   @Test
   public void isMatch4() throws Exception {

      assertTrue(WildcardMatching.isMatch("aa", "*"));
   }

   @Test
   public void isMatch5() throws Exception {

      assertTrue(WildcardMatching.isMatch("aa", "a*"));
   }

   @Test
   public void isMatch6() throws Exception {

      assertTrue(WildcardMatching.isMatch("ab", "?*"));
   }

   @Test
   public void isMatch7() throws Exception {

      assertFalse(WildcardMatching.isMatch("aab", "c*a*b"));
   }


   @Test
   public void isMatch8() throws Exception {

      assertFalse(WildcardMatching.isMatch("zacabz","*a?b*"));
   }

   @Test
   public void isMatch9() throws Exception {

      assertTrue(WildcardMatching.isMatch("",""));
   }

   @Test
   public void isMatch10() throws Exception {

      assertTrue(WildcardMatching.isMatch("abefcdgiescdfimde","ab*cd?i*de"));
   }

   @Test
   public void isMatch11() throws Exception {

      assertTrue(WildcardMatching.isMatch("","*"));
   }
}