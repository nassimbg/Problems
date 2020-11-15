import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartitionArrayIntoDisjointIntervalsTest {

  @Test
  public void testPartitionDisjoint() {
    final int leftSize = PartitionArrayIntoDisjointIntervals.partitionDisjoint(new int[]{5, 0, 3, 8, 6});

    assertEquals(3, leftSize);
  }

  @Test
  public void testPartitionDisjoint2() {
    final int leftSize = PartitionArrayIntoDisjointIntervals.partitionDisjoint(new int[]{1,1,1,0,6,12});

    assertEquals(4, leftSize);
  }
}
