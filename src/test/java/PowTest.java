import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PowTest {
   @Test
   public void myPow() throws Exception {

      assertEquals(16, Pow.myPow(2, 4), 0.1);
   }

   @Test
   public void myPow2() throws Exception {

      assertEquals(0.00003, Pow.myPow(34.00515, -3), 0.00001);
   }

   @Test
   public void myPow3() throws Exception {

      assertEquals(0.11169, Pow.myPow(8.95371, -1), 0.00001);
   }

   @Test
   public void myPow4() throws Exception {

      assertEquals(0.00009, Pow.myPow(4.70975, -6), 0.00001);
   }

}