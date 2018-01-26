import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BitwiseANDOfNumbersRangeTest {
   @Test
   public void rangeBitwiseAnd() throws Exception {
      assertEquals(4, BitwiseANDOfNumbersRange.rangeBitwiseAnd(5, 7));
   }

      @Test
      public void rangeBitwiseAnd2() throws Exception {
         assertEquals(0, BitwiseANDOfNumbersRange.rangeBitwiseAnd(2, 4));
      }

   @Test
   public void rangeBitwiseAnd3() throws Exception {
      assertEquals(0, BitwiseANDOfNumbersRange.rangeBitwiseAnd(0, Integer.MAX_VALUE));
   }

   @Test
   public void rangeBitwiseAnd4() throws Exception {
      assertEquals(0, BitwiseANDOfNumbersRange.rangeBitwiseAnd(3, 4));
   }

   @Test
   public void rangeBitwiseAnd5() throws Exception {
      assertEquals(6, BitwiseANDOfNumbersRange.rangeBitwiseAnd(6, 7));
   }

   @Test
   public void rangeBitwiseAnd6() throws Exception {
      assertEquals(2147483646, BitwiseANDOfNumbersRange.rangeBitwiseAnd(2147483646, 2147483647));
   }
}