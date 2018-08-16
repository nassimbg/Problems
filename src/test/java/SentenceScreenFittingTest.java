import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SentenceScreenFittingTest {

   @Test
   public void wordsTyping() {
      assertEquals(1, SentenceScreenFitting.wordsTyping(new String[] { "hello", "world" }, 2, 8));
   }

   @Test
   public void wordsTyping2() {
      assertEquals(2, SentenceScreenFitting.wordsTyping(new String[] {"a", "bcd", "e" }, 3, 6));
   }

   @Test
   public void wordsTyping3() {
      assertEquals(1, SentenceScreenFitting.wordsTyping(new String[] {"I", "had", "apple", "pie" }, 4, 5));
   }
}