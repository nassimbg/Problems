import static org.junit.Assert.*;

import org.junit.Test;

public class PermutationInStringTest {

   @Test
   public void checkInclusion() {
      assertTrue(PermutationInString.checkInclusion("ab", "eidbaooo"));
   }

   @Test
   public void checkInclusion2() {
      assertFalse(PermutationInString.checkInclusion("ab", "eidboaoo"));
   }

   @Test
   public void checkInclusion3() {
      assertTrue(PermutationInString.checkInclusion("adc", "dcda"));
   }
}