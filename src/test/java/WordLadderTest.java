import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class WordLadderTest {

   @Test
   public void ladderLength() {
      int length = WordLadder.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));

      assertEquals(5, length);
   }
}