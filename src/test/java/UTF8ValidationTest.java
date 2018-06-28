import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UTF8ValidationTest {

   @Test
   public void validUtf8() {
      assertTrue(UTF8Validation.validUtf8(new int[] { 197, 130, 1 }));
   }

   @Test
   public void validUtf82() {
      assertFalse(UTF8Validation.validUtf8(new int[] { 235, 140, 4}));
   }

   @Test
   public void validUtf83() {
      assertFalse(UTF8Validation.validUtf8(new int[] { 197 }));
   }
}