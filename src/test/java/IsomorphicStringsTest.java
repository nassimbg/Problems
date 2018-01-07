import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsomorphicStringsTest {
   @Test
   public void isIsomorphic() throws Exception {
      assertTrue(IsomorphicStrings.isIsomorphic("egg", "add"));
   }

   @Test
   public void isIsomorphic1() throws Exception {
      assertFalse(IsomorphicStrings.isIsomorphic("foo", "bar"));
   }

   @Test
   public void isIsomorphic2() throws Exception {
      assertFalse(IsomorphicStrings.isIsomorphic("ab", "aa"));
   }
}