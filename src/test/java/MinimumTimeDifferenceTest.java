import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class MinimumTimeDifferenceTest {

   @Test
   public void findMinDifference() {
      assertEquals(1, MinimumTimeDifference.findMinDifference(Arrays.asList("23:59", "00:00" )));
   }


   @Test
   public void findMinDifference2() {
      assertEquals(0, MinimumTimeDifference.findMinDifference(Arrays.asList("00:00", "23:59", "00:00" )));
   }
}