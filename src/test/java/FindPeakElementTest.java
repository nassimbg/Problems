import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindPeakElementTest {
   @Test
   public void findPeakElement() throws Exception {
      assertEquals(2, FindPeakElement.findPeakElement(new int[] { 1, 2, 3, 1 }));
   }


}