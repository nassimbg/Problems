import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestRepeatingCharacterReplacementTest {

   @Test
   public void characterReplacement() {
      assertEquals(4, LongestRepeatingCharacterReplacement.characterReplacement("ABAB",2));
   }


   @Test
   public void characterReplacement1() {
      assertEquals(4, LongestRepeatingCharacterReplacement.characterReplacement("AABABBA",1));
   }


   @Test
   public void characterReplacement2() {
      assertEquals(4, LongestRepeatingCharacterReplacement.characterReplacement("AAAA",0));
   }

   @Test
   public void characterReplacement4() {
      assertEquals(4, LongestRepeatingCharacterReplacement.characterReplacement("AAAA",2));
   }
}