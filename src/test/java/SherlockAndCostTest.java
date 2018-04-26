import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SherlockAndCostTest {

   @Test
   public void findMaxValue() {
      assertEquals(36, SherlockAndCost.findMaxValue(new int[] { 10, 1, 10, 1, 10 }));
   }

}