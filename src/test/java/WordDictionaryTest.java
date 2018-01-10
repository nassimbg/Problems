import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WordDictionaryTest {
   @Test
   public void search() throws Exception {
      WordDictionary wordDictionary = new WordDictionary();
      wordDictionary.addWord("bad");
      wordDictionary.addWord("dad");
      wordDictionary.addWord("mad");

      assertFalse(wordDictionary.search("pad"));
      assertTrue(wordDictionary.search("bad"));
      assertTrue(wordDictionary.search(".ad"));
      assertTrue(wordDictionary.search("b.."));
   }

   @Test
   public void search1() throws Exception {
      WordDictionary wordDictionary = new WordDictionary();
      wordDictionary.addWord("a");

      assertFalse(wordDictionary.search(".a"));
      assertFalse(wordDictionary.search("a."));
   }
}