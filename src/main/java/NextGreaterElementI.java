import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class NextGreaterElementI {

  public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Deque<Integer> maxQueue = new ArrayDeque<>();
    Map<Integer, Integer> mappingValues = new HashMap<>();

    for (int i = nums2.length - 1; i >= 0; i--) {

      int greaterValue = -1;
      while(!maxQueue.isEmpty()) {
        final Integer last = maxQueue.getLast();
        if (nums2[i] > last) {
          maxQueue.pollLast();
        } else {
          greaterValue = last;
          break;
        }
      }
      maxQueue.addLast(nums2[i]);

      mappingValues.put(nums2[i], greaterValue);
    }

    int[] result = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      result[i] = mappingValues.get(nums1[i]);
    }

    return result;

  }
}
