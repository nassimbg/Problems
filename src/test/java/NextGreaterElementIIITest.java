import static org.junit.Assert.*;

import org.junit.Test;

public class NextGreaterElementIIITest {

   @Test
   public void nextGreaterElement() {
      assertEquals(125346, NextGreaterElementIII.nextGreaterElement(124653));
   }

   @Test
   public void nextGreaterElement2() {
      assertEquals(21, NextGreaterElementIII.nextGreaterElement(12));
   }



   @Test
   public void nextGreaterElement3() {
      assertEquals(-1, NextGreaterElementIII.nextGreaterElement(21));
   }


   @Test
   public void nextGreaterElement4() {
      assertEquals(-1, NextGreaterElementIII.nextGreaterElement(1999999999));
   }



   @Test
   public void nextGreaterElement5() {
      assertEquals(13222344, NextGreaterElementIII.nextGreaterElement(12443322));
   }


   @Test
   public void nextGreaterElement6() {
      assertEquals(213456789, NextGreaterElementIII.nextGreaterElement(198765432));
   }
}