import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PartitionEqualSubsetSumTest {

   @Test
   public void canPartition() {
      assertTrue(PartitionEqualSubsetSum.canPartition(new int[] { 1, 5, 11, 5 }));
   }
   @Test
   public void canPartition2() {
      assertFalse(PartitionEqualSubsetSum.canPartition(new int[] {1, 2, 3, 5}));
   }

}