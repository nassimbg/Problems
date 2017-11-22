import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseWordsInAStringTest {
   @Test
   public void reverseWords() throws Exception {
      assertEquals("blue is sky the", ReverseWordsInAString.reverseWords("the sky is blue"));
   }

   @Test
   public void reverseWords1() throws Exception {
      assertEquals("1", ReverseWordsInAString.reverseWords(" 1"));
   }

   @Test
   public void reverseWords3() throws Exception {
      assertEquals("1", ReverseWordsInAString.reverseWords("1     "));
   }
   @Test
   public void reverseWords2() throws Exception {
      assertEquals("", ReverseWordsInAString.reverseWords(""));
   }
}