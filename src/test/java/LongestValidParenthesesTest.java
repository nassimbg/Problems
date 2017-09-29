import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestValidParenthesesTest {
   @Test
   public void longestValidParentheses1() throws Exception {

      assertEquals(4, LongestValidParentheses.longestValidParentheses(")()())"));
   }

   @Test
   public void longestValidParentheses2() throws Exception {

      assertEquals(2, LongestValidParentheses.longestValidParentheses("(()"));
   }


   @Test
   public void longestValidParentheses3() throws Exception {
      assertEquals(6, LongestValidParentheses.longestValidParentheses("(())()("));
   }

   @Test
   public void longestValidParentheses4() throws Exception {
      assertEquals(4, LongestValidParentheses.longestValidParentheses("(())(()"));
   }

   @Test
   public void longestValidParentheses5() throws Exception {
      assertEquals(4, LongestValidParentheses.longestValidParentheses("(()))()"));
   }

   @Test
   public void longestValidParentheses6() throws Exception {
      assertEquals(0, LongestValidParentheses.longestValidParentheses("(("));
   }

   @Test
   public void longestValidParentheses7() throws Exception {
      assertEquals(0, LongestValidParentheses.longestValidParentheses(""));
   }

   @Test
   public void longestValidParentheses8() throws Exception {
      assertEquals(12, LongestValidParentheses.longestValidParentheses("(((())))(()()()()()()"));
   }

   @Test
   public void longestValidParentheses9() throws Exception {
      assertEquals(12, LongestValidParentheses.longestValidParentheses("(((())))(((((((()()()()()()"));
   }

   @Test
   public void longestValidParentheses10() throws Exception {
      assertEquals(20, LongestValidParentheses.longestValidParentheses("(((())))()()()()()()"));
   }

   @Test
   public void longestValidParentheses11() throws Exception {
      assertEquals(6, LongestValidParentheses.longestValidParentheses("(()())"));
   }

   @Test
   public void longestValidParentheses12() throws Exception {
      assertEquals(14, LongestValidParentheses.longestValidParentheses("((())()()(()))"));
   }

   @Test
   public void longestValidParentheses13() throws Exception {
      assertEquals(2, LongestValidParentheses.longestValidParentheses(")()))("));
   }

   @Test
   public void longestValidParentheses14() throws Exception {
      assertEquals(10, LongestValidParentheses.longestValidParentheses(")(())(()()))("));
   }
}