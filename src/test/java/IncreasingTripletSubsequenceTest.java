import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IncreasingTripletSubsequenceTest {

   @Test
   public void increasingTriplet() {
      assertTrue(IncreasingTripletSubsequence.increasingTriplet(new int[] { 1, 2, 3, 4, 5 }));
   }

   @Test
   public void increasingTriplet3() {
      assertFalse(IncreasingTripletSubsequence.increasingTriplet(new int[] {5,4,3,2,1 }));
   }
}