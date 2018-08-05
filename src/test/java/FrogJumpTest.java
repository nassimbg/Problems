import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FrogJumpTest {

   @Test
   public void canCross() {
      assertTrue(FrogJump.canCross(new int[] { 0, 1, 3, 5, 6, 8, 12, 17 }));
   }

   @Test
   public void canCross2() {
      assertFalse(FrogJump.canCross(new int[] { 0,1,2,3,4,8,9,11}));
   }
}