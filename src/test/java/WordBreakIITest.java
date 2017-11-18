import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class WordBreakIITest {
   @Test
   public void wordBreak() throws Exception {
      assertEquals(Arrays.asList("cat sand dog", "cats and dog"), WordBreakII.wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog")));
   }


   @Test
   public void wordBreak1() throws Exception {
      assertEquals(Collections.emptyList(), WordBreakII.wordBreak("catsanddog", Collections.emptyList()));
   }

   @Test
   public void wordBreak3() throws Exception {
      assertEquals(new ArrayList<>(), WordBreakII.wordBreak("", Arrays.asList("cat", "cats", "and", "sand", "dog")));
   }

   @Test
   public void wordBreak4() throws Exception {
      assertEquals(new ArrayList<>(), WordBreakII.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
        , Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa")));
   }

   @Test
   public void wordBreak5() throws Exception {
      List<String> expected = Arrays.asList("a a a a a a a", "aa a a a a a", "a aa a a a a", "a a aa a a a", "aa aa a a a", "aaaa a a a", "a a a aa a a", "aa a aa a a", "a aa aa a a", "a aaaa a a", "a a a a aa a", "aa a a aa a", "a aa a aa a", "a a aa aa a", "aa aa aa a", "aaaa aa a", "a a aaaa a", "aa aaaa a", "a a a a a aa", "aa a a a aa", "a aa a a aa", "a a aa a aa", "aa aa a aa", "aaaa a aa", "a a a aa aa", "aa a aa aa", "a aa aa aa", "a aaaa aa", "a a a aaaa", "aa a aaaa", "a aa aaaa");
      List<String> actual = WordBreakII.wordBreak("aaaaaaa", Arrays.asList("aaaa", "aa", "a"));

      expected.sort(Comparator.naturalOrder());
      actual.sort(Comparator.naturalOrder());
      assertEquals(expected
        , actual);
   }



}