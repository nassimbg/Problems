import static org.junit.Assert.*;

import org.junit.Test;

public class MinimumMovesToEqualArrayElementsIITest {

   @Test
   public void minMoves2() {
      assertEquals(2, MinimumMovesToEqualArrayElementsII.minMoves2(new int[] {1,2,3}));
   }

   @Test
   public void minMoves3() {
      assertEquals(0, MinimumMovesToEqualArrayElementsII.minMoves2(new int[] {1,1}));
   }

   @Test
   public void minMoves4() {
      assertEquals(0, MinimumMovesToEqualArrayElementsII.minMoves2(new int[] { 1 }));
   }


   @Test
   public void minMoves5() {
      assertEquals(2127271182, MinimumMovesToEqualArrayElementsII.minMoves2(new int[] {203125577,-349566234,230332704,48321315,66379082,386516853,50986744,-250908656,-425653504,-212123143}));
   }
}