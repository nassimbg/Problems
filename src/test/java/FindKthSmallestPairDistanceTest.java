import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindKthSmallestPairDistanceTest {

   @Test
   public void smallestDistancePair() {
      assertEquals(5, FindKthSmallestPairDistance.smallestDistancePair(new int[] { 1, 6, 1 }, 3));
   }
}