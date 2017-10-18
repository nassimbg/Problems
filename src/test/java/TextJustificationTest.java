import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TextJustificationTest {
   @Test
   public void fullJustify() throws Exception {
      List<String> expected = new ArrayList<>();
      expected.add("This    is    an");
      expected.add("example  of text");
      expected.add("justification.  ");

      assertEquals(expected,TextJustification.fullJustify(new String[] { "This", "is", "an", "example", "of", "text", "justification." }, 16));
   }



   @Test
   public void fullJustify1() throws Exception {
      List<String> expected = new ArrayList<>();
      expected.add("a b");
      expected.add("c d");
      expected.add("e  ");

      assertEquals(expected,TextJustification.fullJustify(new String[] { "a","b","c","d","e"}, 3));
   }

   @Test
   public void fullJustify2() throws Exception {
      List<String> expected = new ArrayList<>();
      expected.add("What must be");
      expected.add("shall be.   ");

      assertEquals(expected,TextJustification.fullJustify(new String[] { "What","must","be","shall","be."}, 12));
   }

   @Test
   public void fullJustify3() throws Exception {
      List<String> expected = new ArrayList<>();
      expected.add("Here   is   an");
      expected.add("example     of");
      expected.add("text          ");
      expected.add("justification.");

      assertEquals(expected,TextJustification.fullJustify(new String[] { "Here","is","an","example","of","text","justification."}, 14));
   }

   @Test
   public void fullJustify4() throws Exception {
      List<String> expected = new ArrayList<>();
      expected.add("Don't  go  around  saying  the");
      expected.add("world  owes  you a living; the");
      expected.add("world owes you nothing; it was");
      expected.add("here first.                   ");

      assertEquals(expected,TextJustification.fullJustify(new String[] { "Don't","go","around","saying","the","world","owes","you","a","living;","the","world","owes","you","nothing;","it","was","here","first."}, 30));
   }
}