import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RegularExpressionMatchingTest {

   @Test
   public void test1() {
      assertFalse(RegularExpressionMatching.isMatch("aa","a"));
   }

   @Test
   public void test2() {
      assertTrue(RegularExpressionMatching.isMatch("aa","aa"));
   }

   @Test
   public void test3() {
      assertFalse(RegularExpressionMatching.isMatch("aaa","a"));
   }

   @Test
   public void test4() {
      assertTrue(RegularExpressionMatching.isMatch("aa","a*"));
   }

   @Test
   public void test5() {
      assertTrue(RegularExpressionMatching.isMatch("aa",".*"));
   }

   @Test
   public void test6() {
      assertTrue(RegularExpressionMatching.isMatch("ab",".*"));
   }

   @Test
   public void test7() {
      assertTrue(RegularExpressionMatching.isMatch("aab","a*b"));
   }

   @Test
   public void test8() {
      assertTrue(RegularExpressionMatching.isMatch("aab","c*a*b"));
   }

   @Test
   public void test9() {
      assertFalse(RegularExpressionMatching.isMatch("abcd","d*"));
   }

   @Test
   public void test10() {
      assertFalse(RegularExpressionMatching.isMatch("aaa", "ab*a"));
   }

   @Test
   public void test11() {
      assertTrue(RegularExpressionMatching.isMatch("a", "ab*"));
   }

   @Test
   public void test12() {
      assertFalse(RegularExpressionMatching.isMatch("ab", ".*C"));
   }

   @Test
   public void test13() {
      assertTrue(RegularExpressionMatching.isMatch("", "C*C*"));
   }


}