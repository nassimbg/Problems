import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class PartitionArrayIntoDisjointIntervals {

  public static int partitionDisjoint(int[] A) {
    // Version 1
    // PriorityQueue<Integer> maxQueryLeft = new PriorityQueue<>(Collections.reverseOrder());
    TreeMap<Integer, Integer> minTree = new TreeMap<>();

    for (final int j : A) {
      minTree.compute(j, (k, v) -> v == null ? 1 : v + 1);
    }

    int maxLeft = Integer.MIN_VALUE;
    for (int i = 0; i < A.length; i++) {
      minTree.compute(A[i], (k,v) -> v == 1 ? null : v - 1);

      /*  Version 1
      maxQueryLeft.add(A[i]);
      maxLeft = maxQueryLeft.peek();
      */

      // Version 2 (optimize; remove MaxPriorityQueue)
      maxLeft = Math.max(maxLeft, A[i]);

      if (minTree.lowerKey(maxLeft) == null) {
        return i + 1;
      }
    }

    return A.length;
  }
}
