import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HouseRobberTest {
   @Test
   public void rob() throws Exception {
      assertEquals(29, HouseRobber.rob(new int[] { 6, 10, 2, 10, 11, 8, 3, 1 }));
   }

}