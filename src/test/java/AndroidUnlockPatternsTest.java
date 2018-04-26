import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AndroidUnlockPatternsTest {

   @Test
   public void numberOfPatterns() {
      assertEquals(9, AndroidUnlockPatterns.numberOfPatterns(1, 1));
   }

}