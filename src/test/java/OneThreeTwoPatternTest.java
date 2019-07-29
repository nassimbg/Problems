import static org.junit.Assert.*;

import org.junit.Test;

public class OneThreeTwoPatternTest {

   @Test
   public void find132pattern() {
      assertFalse(OneThreeTwoPattern.find132pattern(new int[] { 1, 2, 3, 4 }));
   }

   @Test
   public void find132pattern2() {
      assertTrue(OneThreeTwoPattern.find132pattern(new int[] { 3, 1, 4, 2}));
   }

   @Test
   public void find132pattern3() {
      assertTrue(OneThreeTwoPattern.find132pattern(new int[] { -1, 3, 2, 0 }));
   }

   @Test
   public void find132pattern4() {
      assertTrue(OneThreeTwoPattern.find132pattern(new int[] { 3,5,0,3,4 }));
   }
}