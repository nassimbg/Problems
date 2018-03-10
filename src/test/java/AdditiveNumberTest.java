import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AdditiveNumberTest {

   @Test
   public void isAdditiveNumber() {
      assertTrue(AdditiveNumber.isAdditiveNumber("112358"));
   }

   @Test
   public void isAdditiveNumber2() {
      assertTrue(AdditiveNumber.isAdditiveNumber("199100199"));
   }

   @Test
   public void isAdditiveNumber4() {
      assertFalse(AdditiveNumber.isAdditiveNumber("1"));
   }

   @Test
   public void isAdditiveNumber5() {
      assertFalse(AdditiveNumber.isAdditiveNumber("111"));
   }

   @Test
   public void isAdditiveNumber45() {
      assertTrue(AdditiveNumber.isAdditiveNumber("101"));
   }
   @Test
   public void isAdditiveNumber453() {
      assertTrue(AdditiveNumber.isAdditiveNumber("000"));
   }

}