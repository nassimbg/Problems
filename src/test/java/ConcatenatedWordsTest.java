import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class ConcatenatedWordsTest {

   @Test
   public void findAllConcatenatedWordsInADict() {
      List<String> words = ConcatenatedWords.findAllConcatenatedWordsInADict(new String[] { "cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat" });

      words.sort(Comparator.naturalOrder());

      assertEquals(Arrays.asList("catsdogcats","dogcatsdog","ratcatdogcat"), words);
   }
}