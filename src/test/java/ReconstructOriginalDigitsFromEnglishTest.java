import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReconstructOriginalDigitsFromEnglishTest {

   @Test
   public void originalDigits() {
      assertEquals("012", ReconstructOriginalDigitsFromEnglish.originalDigits("owoztneoer"));
   }

   @Test
   public void originalDigits2() {
      assertEquals("45", ReconstructOriginalDigitsFromEnglish.originalDigits("fviefuro"));
   }
}