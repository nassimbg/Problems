import static org.junit.Assert.*;

import org.junit.Test;

public class ShortestUnsortedContinuousSubarrayTest {

   @Test
   public void findUnsortedSubarray() {
      int length = ShortestUnsortedContinuousSubarray.findUnsortedSubarray(new int[] { 2, 6, 4, 8, 10, 9, 15 });

      assertEquals(5, length);
   }

   @Test
   public void findUnsortedSubarray2() {
      int length = ShortestUnsortedContinuousSubarray.findUnsortedSubarray(new int[] {1,3,2,2,2 });

      assertEquals(4, length);
   }

   @Test
   public void findUnsortedSubarray3() {
      int length = ShortestUnsortedContinuousSubarray.findUnsortedSubarray(new int[] {1,1});

      assertEquals(0, length);
   }

   @Test
   public void findUnsortedSubarray4() {
      int length = ShortestUnsortedContinuousSubarray.findUnsortedSubarray(new int[] {1,2,4,5,3});

      assertEquals(3, length);
   }

   @Test
   public void findUnsortedSubarray5() {
      int length = ShortestUnsortedContinuousSubarray.findUnsortedSubarray(new int[] {1,2,3,4});

      assertEquals(0, length);
   }


   @Test
   public void findUnsortedSubarray6() {
      int length = ShortestUnsortedContinuousSubarray.findUnsortedSubarray(new int[] {1,3,5,4,2});

      assertEquals(4, length);
   }
}