import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TQuestions {

//  An unsorted array of the numbers 1 to 100, with one number found twice. How can we find that number ?

  public static int solution(int[] nums) {

    if (nums == null) {
      return -1;
    }

    boolean[] found = new boolean[100];

    for (final int currentValue : nums) {

      if (found[currentValue - 1]) {
        return currentValue;
      }
      found[currentValue - 1] = true;
    }

    return -1;
  }

















/*Given an array of integers nums and an integer k,
return the total number of continuous subarrays whose sum equals to k.

      Example 1:
  Input: nums = [1,1,1], k = 2
  Output: 2

  Example 2:
  Input: nums = [1,2,3], k = 3
  Output: 2*/

  /**
   * This questions is called 'Subarray Sum Equals K
   */
  public static int subarraySum(int[] nums, int k) {

    if (nums == null || nums.length == 0) {
      return 0;
    }

    Map<Integer, Integer> cumSumFrequency = new HashMap<>();
    cumSumFrequency.put(0, 1);

    int total = 0;
    int currentCum = 0;
    for (final int currentValue : nums) {
      currentCum += currentValue;

      int countOfSubArrays = cumSumFrequency.getOrDefault(currentCum - k, 0);

      cumSumFrequency.compute(currentCum, (cum, count) -> count == null ? 1 : count + 1);

      total += countOfSubArrays;
    }

    return total;
  }
}
