import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HIndexTest {

   @Test
   public void hIndex() {
      assertEquals(3, HIndex.hIndex(new int[] { 3, 0, 6, 1, 5 }));
   }

   @Test
   public void hIndex1() {
      assertEquals(0, HIndex.hIndex(new int[] { }));
   }

   @Test
   public void hIndex2() {
      assertEquals(0, HIndex.hIndex(new int[] {0  }));
   }

   @Test
   public void hIndex3() {
      assertEquals(1, HIndex.hIndex(new int[] {1 }));
   }
}