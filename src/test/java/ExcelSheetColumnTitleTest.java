import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExcelSheetColumnTitleTest {
   @Test
   public void convertToTitle() throws Exception {
      assertEquals("AB", ExcelSheetColumnTitle.convertToTitle(28));
   }

   @Test
   public void convertToTitle2() throws Exception {
      assertEquals("Z", ExcelSheetColumnTitle.convertToTitle(26));
   }

   @Test
   public void convertToTitle1() throws Exception {
      assertEquals("ZZ", ExcelSheetColumnTitle.convertToTitle(702));
   }


}