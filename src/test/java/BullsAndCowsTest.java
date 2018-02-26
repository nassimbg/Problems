import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BullsAndCowsTest {

   @Test
   public void getHint() {
      assertEquals("3A0B", BullsAndCows.getHint("1122", "1222"));
   }

   @Test
   public void getHint1() {
      assertEquals("1A3B", BullsAndCows.getHint("1807", "7810"));
   }

   @Test
   public void getHint2() {
      assertEquals("1A1B", BullsAndCows.getHint("1123", "0111"));
   }
}