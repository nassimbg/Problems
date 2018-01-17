import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class ContainsDuplicateIIITest {
   @Test
   public void containsNearbyAlmostDuplicate() throws Exception {
      assertFalse(ContainsDuplicateIII.containsNearbyAlmostDuplicate(new int[] { -1, Integer.MAX_VALUE }, 1, Integer.MAX_VALUE));
   }

}