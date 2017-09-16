import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThreeSumClosestTest {
   @Test
   public void threeSumClosest() throws Exception {

      assertEquals(2, ThreeSumClosest.threeSumClosest(new int[] {-1,2,1,-4}, 1));
   }

}