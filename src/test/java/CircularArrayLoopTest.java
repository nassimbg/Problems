import static org.junit.Assert.*;

import org.junit.Test;

public class CircularArrayLoopTest {

   @Test
   public void circularArrayLoop() {
      assertTrue(CircularArrayLoop.circularArrayLoop(new int[]{2,-1,1,2,2}));
   }

   @Test
   public void circularArrayLoop2() {
      assertFalse(CircularArrayLoop.circularArrayLoop(new int[]{-1, 2}));
   }


   @Test
   public void circularArrayLoop3() {
      assertFalse(CircularArrayLoop.circularArrayLoop(new int[] { -2, 1, -1, -2, -2 }));

   }


   @Test
   public void circularArrayLoop4() {
      assertFalse(CircularArrayLoop.circularArrayLoop(new int[]{2,2,2,2,2,4,7}));
   }
}