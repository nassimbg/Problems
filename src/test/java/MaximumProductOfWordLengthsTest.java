import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumProductOfWordLengthsTest {

    @Test
    public void maxProduct() {
        assertEquals(16, MaximumProductOfWordLengths.maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}));
    }

    @Test
    public void maxProduct2() {
        assertEquals(4, MaximumProductOfWordLengths.maxProduct(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"}));
    }

    @Test
    public void maxProduct3() {
        assertEquals(0, MaximumProductOfWordLengths.maxProduct(new String[]{"a", "aa", "aaa", "aaaa"}));
    }
}