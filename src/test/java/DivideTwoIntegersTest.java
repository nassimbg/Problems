import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class DivideTwoIntegersTest {

   @Test
   public void divide() {
      assertEquals(3, DivideTwoIntegers.divide(10, 3));
   }


   @Test
   public void divide4() {
      assertEquals(-3, DivideTwoIntegers.divide(-10, 3));
   }

   @Test
   public void divide5() {
      assertEquals(-2, DivideTwoIntegers.divide(7, -3));
   }

   @Test
   public void divide2() {
      assertEquals(3, DivideTwoIntegers.divide(15, 5));
   }

   @Test
   public void divide3() {
      assertEquals(3, DivideTwoIntegers.divide(Integer.MIN_VALUE, 5));
   }
}
