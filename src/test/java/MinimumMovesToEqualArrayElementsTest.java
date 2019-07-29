import static org.junit.Assert.*;

import org.junit.Test;

public class MinimumMovesToEqualArrayElementsTest {

   @Test
   public void minMoves() {
      assertEquals(3, MinimumMovesToEqualArrayElements.minMoves(new int[] { 1, 2, 3 }));


   }

   @Test
   public void minMoves2() {
      assertEquals(2, MinimumMovesToEqualArrayElements.minMoves(new int[] { -1, 1 }));
   }



   @Test
   public void minMoves3() {
      assertEquals(2147483646, MinimumMovesToEqualArrayElements.minMoves(new int[] { 1,1,2147483647 }));
   }


   @Test
   public void minMoves4() {
      assertEquals(7, MinimumMovesToEqualArrayElements.minMoves(new int[] { 5,6,8,8,5 }));
   }

}
