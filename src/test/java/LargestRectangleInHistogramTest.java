import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestRectangleInHistogramTest {
   @Test
   public void largestRectangleArea() throws Exception {

      assertEquals(10, LargestRectangleInHistogram.largestRectangleArea(new int[] { 2, 1, 5, 6, 2, 3 }));
   }
   @Test
   public void largestRectangleArea1() throws Exception {

      assertEquals(6, LargestRectangleInHistogram.largestRectangleArea(new int[] { 2, 1, 1, 6, 2 }));
   }


   @Test
   public void largestRectangleArea2() throws Exception {

      assertEquals(2, LargestRectangleInHistogram.largestRectangleArea(new int[] { 2}));
   }

   @Test
   public void largestRectangleArea3() throws Exception {

      assertEquals(0, LargestRectangleInHistogram.largestRectangleArea(new int[] {}));
   }

   @Test
   public void largestRectangleArea4() throws Exception {

      assertEquals(10, LargestRectangleInHistogram.largestRectangleArea(new int[] {4,2,0,3,2,4,3,4}));
   }

   @Test
   public void largestRectangleArea5() throws Exception {
      assertEquals(24, LargestRectangleInHistogram.largestRectangleArea(new int[] {3,5,5,2,5,5,6,6,4,4,1,1,2,5,5,6,6,4,1,3}));
   }
}