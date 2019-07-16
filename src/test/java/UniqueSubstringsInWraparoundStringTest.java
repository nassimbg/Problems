import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueSubstringsInWraparoundStringTest {

   @Test
   public void findSubstringInWraproundString() {
      assertEquals(6, UniqueSubstringsInWraparoundString.findSubstringInWraproundString("zab"));
   }

   @Test
   public void findSubstringInWraproundString1() {
      assertEquals(6, UniqueSubstringsInWraparoundString.findSubstringInWraproundString("zaba"));
   }

   @Test
   public void findSubstringInWraproundString2() {
      assertEquals(2, UniqueSubstringsInWraparoundString.findSubstringInWraproundString("cac"));
   }

   @Test
   public void findSubstringInWraproundString3() {
      assertEquals(1, UniqueSubstringsInWraparoundString.findSubstringInWraproundString("a"));
   }
}