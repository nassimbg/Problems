import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class GeneralizedAbbreviationTest {

    @Test
    public void solution() {
        List<String> word = GeneralizedAbbreviation.solution("word");
        word.sort(Comparator.naturalOrder());

        List<String> expected = Arrays.asList("word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4");
        expected.sort(Comparator.naturalOrder());
        assertEquals(expected, word);
    }
}