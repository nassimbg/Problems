import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExcelSheetColumnNumberTest {
   @Test
   public void titleToNumber() throws Exception {
      assertEquals(702, ExcelSheetColumnNumber.titleToNumber("ZZ"));
   }


}