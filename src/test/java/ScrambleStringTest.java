import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ScrambleStringTest {
   @Test
   public void isScramble() throws Exception {
      assertTrue(ScrambleString.isScramble("great", "rgeat"));
   }

   @Test
   public void isScramble1() throws Exception {
      assertTrue(ScrambleString.isScramble("great", "rgtae"));
   }

   @Test
   public void isScramble2() throws Exception {
      assertTrue(ScrambleString.isScramble("rgtae", "rgtae"));
   }

   @Test
   public void isScramble3() throws Exception {
      assertFalse(ScrambleString.isScramble("rtgae", "great"));
   }

   @Test
   public void isScramble4() throws Exception {
      assertTrue(ScrambleString.isScramble("abbbcbaaccacaacc", "acaaaccabcabcbcb"));
   }

   @Test
   public void isScramble6() throws Exception {
      assertTrue(ScrambleString.isScramble("hobobyrqd", "hbyorqdbo"));
   }

   @Test
   public void isScramble5() throws Exception {
      assertFalse(ScrambleString.isScramble("abcdefghijklmnopq", "efghijklmnopqcadb"));
   }
}