import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContainerWithMostWaterTest {
   @Test
   public void maxArea() throws Exception {

      int[] height = new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7};

      assertEquals(49, ContainerWithMostWater.maxArea(height));
   }

}