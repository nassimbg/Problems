import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsSubsequenceTest {

   @Test
   public void isSubsequence() {
      assertTrue(IsSubsequence.isSubsequence("abc", "ahbgdc"));
   }

   @Test
   public void isSubsequence2() {
      assertFalse(IsSubsequence.isSubsequence("axc", "ahbgdc"));
   }
}