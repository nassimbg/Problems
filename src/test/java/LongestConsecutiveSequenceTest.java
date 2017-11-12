import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestConsecutiveSequenceTest {
   @Test
   public void longestConsecutive() throws Exception {
      assertEquals(4, LongestConsecutiveSequence.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
   }

   @Test
   public void longestConsecutive1() throws Exception {
      assertEquals(3, LongestConsecutiveSequence.longestConsecutive(new int[]{1,2,0,1}));
   }

   @Test
   public void longestConsecutive2() throws Exception {
      assertEquals(3, LongestConsecutiveSequence.longestConsecutive(new int[]{0,0,1,-1}));
   }

   @Test
   public void longestConsecutive3() throws Exception {
      assertEquals(5, LongestConsecutiveSequence.longestConsecutive(new int[]{1,3,5,2,4}));
   }

   @Test
   public void longestConsecutive4() throws Exception {
      assertEquals(9, LongestConsecutiveSequence.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
   }

   @Test
   public void longestConsecutive5() throws Exception {
      assertEquals(13, LongestConsecutiveSequence.longestConsecutive(new int[]{-1,9,-3,-6,7,-8,-6,2,9,2,3,-2,4,-1,0,6,1,-9,6,8,6,5,2}));
   }
}