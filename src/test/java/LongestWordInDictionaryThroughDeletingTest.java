import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LongestWordInDictionaryThroughDeletingTest {

   @Test
   public void findLongestWord() {
      assertEquals("apple", LongestWordInDictionaryThroughDeleting.findLongestWord("abpcplea", Arrays.asList("ale","apple","monkey","plea")));
   }

   @Test
   public void findLongestWord2() {
      assertEquals("a", LongestWordInDictionaryThroughDeleting.findLongestWord("abpcplea", Arrays.asList("a","b","c")));
   }
}