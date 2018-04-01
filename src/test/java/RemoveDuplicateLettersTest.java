import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicateLettersTest {

    @Test
    public void removeDuplicateLetters() {
        assertEquals("abc", new  RemoveDuplicateLetters().removeDuplicateLetters("bcabc"));
    }

    @Test
    public void removeDuplicateLetters2() {
        assertEquals("acdb", new RemoveDuplicateLetters().removeDuplicateLetters("cbacdcbc"));
    }

    @Test
    public void removeDuplicateLetters3() {
        assertEquals("", new RemoveDuplicateLetters().removeDuplicateLetters(""));
    }

    @Test
    public void removeDuplicateLetters4() {
        assertEquals("abc", new RemoveDuplicateLetters().removeDuplicateLetters("abacb"));
    }
}