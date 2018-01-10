import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class WordSearchIITest {
   @Test
   public void findWords() throws Exception {
      char[][] chars = new char[][] {
        {'o','a','a','n'},
        {'e','t','a','e'},
        {'i','h','k','r'},
        {'i','f','l','v'}
      };

      String[] words = new String[] {
        "oath","pea","eat","rain"
      };
      assertEquals(Arrays.asList("oath", "eat"), WordSearchII.findWords(chars, words));
   }

   @Test
   public void findWords2() throws Exception {
      char[][] chars = new char[][] {
        {'a','a'}
      };

      String[] words = new String[] {
        "a"
      };
      assertEquals(Arrays.asList("a"), WordSearchII.findWords(chars, words));
   }

}