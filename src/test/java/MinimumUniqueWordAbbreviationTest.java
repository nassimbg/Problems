import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class MinimumUniqueWordAbbreviationTest {

   @Test
   public void minAbbreviation() {
      Set<String> validAbb = new HashSet<>();
      validAbb.add("1p3");
      validAbb.add("ap3");
      validAbb.add("a3e");
      validAbb.add("2p2");
      validAbb.add("3le");
      validAbb.add("3l1");

      assertTrue(validAbb.contains(MinimumUniqueWordAbbreviation.minAbbreviation("apple", new String[] { "plain", "amber", "blade" })));
   }
}