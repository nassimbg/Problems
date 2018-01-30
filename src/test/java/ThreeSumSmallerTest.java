import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThreeSumSmallerTest {

   @Test
   public void threeSumSmaller() {
      assertEquals(2, ThreeSumSmaller.threeSumSmaller(new int[] { -2, 0, 1, 3 }, 2));
   }

   @Test
   public void threeSumSmaller1() {
      assertEquals(0, ThreeSumSmaller.threeSumSmaller(new int[] { -2, 0}, 2));
   }

   @Test
   public void threeSumSmaller2() {
      assertEquals(0, ThreeSumSmaller.threeSumSmaller(new int[] { }, 2));
   }
}