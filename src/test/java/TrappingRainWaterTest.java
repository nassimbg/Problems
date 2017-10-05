import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrappingRainWaterTest {
   @Test
   public void trap1() throws Exception {

      assertEquals(6, TrappingRainWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
   }

   @Test
   public void trap2() throws Exception {

      assertEquals(1, TrappingRainWater.trap(new int[]{4,2,3}));
   }

   @Test
   public void trap3() throws Exception {

      assertEquals(4, TrappingRainWater.trap(new int[]{1,0,2,1,0,3}));
   }


   @Test
   public void trap4() throws Exception {

      assertEquals(0, TrappingRainWater.trap(new int[]{1,2,3,2,1}));
   }

}