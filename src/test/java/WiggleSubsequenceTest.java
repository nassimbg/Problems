import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WiggleSubsequenceTest {

   @Test
   public void wiggleMaxLength() {
      assertEquals(6, WiggleSubsequence.wiggleMaxLength(new int[] { 1, 7, 4, 9, 2, 5 }));
   }



   @Test
   public void wiggleMaxLength2() {
      assertEquals(7, WiggleSubsequence.wiggleMaxLength(new int[] {1,17,5,10,13,15,10,5,16,8 }));
   }


   @Test
   public void wiggleMaxLength3() {
      assertEquals(2, WiggleSubsequence.wiggleMaxLength(new int[] { 1,2,3,4,5,6,7,8,9 }));
   }


   @Test
   public void wiggleMaxLength4() {
      assertEquals(1, WiggleSubsequence.wiggleMaxLength(new int[] { 1 }));
   }
}