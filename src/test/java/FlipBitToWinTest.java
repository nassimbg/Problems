import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FlipBitToWinTest {

   @Test
   public void flip() {
      assertEquals(8, FlipBitToWin.flip(1775));
   }

   @Test
   public void flip2() {
      assertEquals(1, FlipBitToWin.flip(0));
   }

   @Test
   public void flip3() {
      assertEquals(3, FlipBitToWin.flip(12));
   }

   @Test
   public void flip4() {
      assertEquals(5, FlipBitToWin.flip(15));
   }

   @Test
   public void flip5() {
      assertEquals(4, FlipBitToWin.flip(71));
   }
}