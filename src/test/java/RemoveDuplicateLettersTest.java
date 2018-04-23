import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveDuplicateLettersTest {

    @Test
    public void removeDuplicateLetters() {
        assertEquals("abc", RemoveDuplicateLetters.removeDuplicateLetters("bcabc"));
    }

    @Test
    public void removeDuplicateLetters2() {
        assertEquals("acdb", RemoveDuplicateLetters.removeDuplicateLetters("cbacdcbc"));
    }

    @Test
    public void removeDuplicateLetters3() {
        assertEquals("", RemoveDuplicateLetters.removeDuplicateLetters(""));
    }

   @Test
   public void removeDuplicateLetters5() {
      assertEquals("bac", RemoveDuplicateLetters.removeDuplicateLetters("bbcaac"));
   }

    @Test
    public void removeDuplicateLetters4() {
        assertEquals("abc", RemoveDuplicateLetters.removeDuplicateLetters("abacb"));
    }
}