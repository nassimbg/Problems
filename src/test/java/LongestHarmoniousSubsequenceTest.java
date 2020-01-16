import static org.junit.Assert.*;

import org.junit.Test;

public class LongestHarmoniousSubsequenceTest {

   @Test
   public void findLHS() {
      assertEquals(5, LongestHarmoniousSubsequence.findLHSMySolution(new int[] {1,3,2,2,5,2,3,7}));
   }


   @Test
   public void findLHS2() {
      assertEquals(0, LongestHarmoniousSubsequence.findLHSMySolution(new int[] {1,1,1,1}));
   }
}