import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EditDistanceTest {
   @Test
   public void minDistance() throws Exception {
      assertEquals(2, EditDistance.minDistance("ab", "azbc"));
   }

   @Test
   public void minDistance1() throws Exception {
      assertEquals(4, EditDistance.minDistance("", "azbc"));
   }

   @Test
   public void minDistance2() throws Exception {
      assertEquals(2, EditDistance.minDistance("ab", ""));
   }

   @Test
   public void minDistance3() throws Exception {
      assertEquals(0, EditDistance.minDistance("", ""));
   }

}