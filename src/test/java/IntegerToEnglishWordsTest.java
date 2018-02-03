import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToEnglishWordsTest {

   @Test
   public void numberToWords() {
      assertEquals("One Hundred Twenty Three", IntegerToEnglishWords.numberToWords(123));
   }

   @Test
   public void numberToWords2() {
      assertEquals("Twelve Thousand Three Hundred Forty Five", IntegerToEnglishWords.numberToWords(12345 ));
   }

   @Test
   public void numberToWords3() {
      assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", IntegerToEnglishWords.numberToWords(1234567  ));
   }

   @Test
   public void numberToWords4() {
      assertEquals("One Thousand", IntegerToEnglishWords.numberToWords(1000));
   }
}