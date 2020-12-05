import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SplitArrayIntoConsecutiveSubsequences {
  public static boolean isPossible(int[] nums) {

    int k = 3;
    int countOfSeqLessThanK = 0;
    Map<Integer, PriorityQueue<Integer>> sequences = new HashMap<>();

    for (final int num : nums) {
      final PriorityQueue<Integer> pqOfPreviousValue = sequences.get(num - 1);

      int countOfSeq;
      if (pqOfPreviousValue == null) {
        countOfSeqLessThanK++;
        countOfSeq = 1;
      } else {
        countOfSeq = pqOfPreviousValue.remove() + 1;

        if (countOfSeq == k) {
          countOfSeqLessThanK--;
        }
        if (pqOfPreviousValue.isEmpty()) {
          sequences.remove(num - 1);
        }
      }

      sequences.computeIfAbsent(num, key -> new PriorityQueue<>()).add(countOfSeq);
    }

    return countOfSeqLessThanK == 0;

  }
}
