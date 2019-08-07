import static org.junit.Assert.*;

import org.junit.Test;

public class ContiguousArrayTest {

   @Test
   public void findMaxLength() {
      assertEquals(2, ContiguousArray.findMaxLength(new int[] { 0, 1, 0 }));
   }

   @Test
   public void findMaxLength2() {
      assertEquals(2, ContiguousArray.findMaxLength(new int[] { 0, 1 }));
   }

   @Test
   public void findMaxLength3() {
      assertEquals(12, ContiguousArray.findMaxLength(new int[] { 0,0,1,0, 1,0,0,1,0,0,0,1,1,1 }));
   }
}