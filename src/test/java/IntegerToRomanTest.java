import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {
   @Test
   public void intToRoman() throws Exception {

      assertEquals("XLVIII", IntegerToRoman.intToRoman(48));
   }

   @Test
   public void intToRoman2() throws Exception {

      assertEquals("MDCCC", IntegerToRoman.intToRoman(1800));
   }


   @Test
   public void intToRoman3() throws Exception {

      assertEquals("XCIX", IntegerToRoman.intToRoman(99));
   }

   @Test
   public void intToRoman4() throws Exception {

      assertEquals("XC", IntegerToRoman.intToRoman(90));
   }

   @Test
   public void intToRoman5() throws Exception {

      assertEquals("MMMCMXCIX", IntegerToRoman.intToRoman(3999));
   }

   @Test
   public void intToRoman6() throws Exception {

      assertEquals("I", IntegerToRoman.intToRoman(1));
   }

}