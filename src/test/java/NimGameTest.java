import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NimGameTest {

   @Test
   public void canWinNim() {
      assertFalse(NimGame.canWinNim(4));
   }

   @Test
   public void canWinNim1() {
      assertTrue(NimGame.canWinNim(6));
   }

   @Test
   public void canWinNim2() {
      assertTrue(NimGame.canWinNim(9));
   }
}