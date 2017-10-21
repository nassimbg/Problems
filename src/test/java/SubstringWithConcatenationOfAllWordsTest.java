import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SubstringWithConcatenationOfAllWordsTest {
   @Test
   public void findSubstring1() throws Exception {

      assertEquals(Arrays.asList(0,9), SubstringWithConcatenationOfAllWords.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
   }


   @Test
   public void findSubstring2() throws Exception {

      assertEquals(Arrays.asList(1), SubstringWithConcatenationOfAllWords.findSubstring("acaacc", new String[]{"ac", "ca"}));
   }

   @Test
   public void findSubstring3() throws Exception {

      assertEquals(Arrays.asList(8), SubstringWithConcatenationOfAllWords.findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","good"}));
   }

}

