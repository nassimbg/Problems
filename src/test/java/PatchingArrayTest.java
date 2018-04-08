import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PatchingArrayTest {

   @Test
   public void minPatches() {
      assertEquals(1, PatchingArray.minPatches(new int[] { 1, 3 }, 6));
   }

   @Test
   public void minPatches2() {
      assertEquals(2, PatchingArray.minPatches(new int[] { 1, 5, 10 }, 20));
   }

   @Test
   public void minPatches3() {
      assertEquals(0, PatchingArray.minPatches(new int[] { 1, 2,2 }, 5));
   }

   @Test
   public void minPatches4() {
      assertEquals(3, PatchingArray.minPatches(new int[] { }, 7));
   }


   @Test
   public void minPatches5() {
      assertEquals(28, PatchingArray.minPatches(new int[] { 1,2,31,33 }, 2147483647));
   }
}