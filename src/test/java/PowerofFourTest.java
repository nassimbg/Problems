import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PowerofFourTest {

   @Test
   public void isPowerOfFour() {
      assertTrue(PowerofFour.isPowerOfFour(16));
   }

   @Test
   public void isPowerOfFour2() {
      assertFalse(PowerofFour.isPowerOfFour(12));
   }



   @Test
   public void isPowerOfFour4() {
      assertFalse(PowerofFour.isPowerOfFour(8));
   }
   @Test
   public void isPowerOfFour3() {
      assertTrue(PowerofFour.isPowerOfFour(4));
   }


   @Test
   public void isPowerOfFour5() {
      assertTrue(PowerofFour.isPowerOfFour(1));
   }


   @Test
   public void isPowerOfFour6() {
      assertFalse(PowerofFour.isPowerOfFour(Integer.MIN_VALUE));
   }

}