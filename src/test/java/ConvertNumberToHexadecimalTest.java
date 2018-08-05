import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConvertNumberToHexadecimalTest {

   @Test
   public void toHex() {
      assertEquals("1a", ConvertNumberToHexadecimal.toHex(26));
   }

   @Test
   public void toHex2() {
      assertEquals("ffffffff", ConvertNumberToHexadecimal.toHex(-1));
   }

   @Test
   public void toHex3() {
      assertEquals("0", ConvertNumberToHexadecimal.toHex(0));
   }

   @Test
   public void toHex4() {
      assertEquals("80000000", ConvertNumberToHexadecimal.toHex(Integer.MIN_VALUE));
   }
}