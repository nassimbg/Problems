import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindKClosestElements {

  public static List<Integer> findClosestElements(int[] arr, int k, int x) {
    int count = 0;

    final int index = Arrays.binarySearch(arr, x);

    LinkedList<Integer> result = new LinkedList<>();
    int left = 0;
    int right = 0;
    if (index < 0) {
      right = -index -1;
      left = right - 1;
    } else {
      count++;
      result.addLast(arr[index]);
      left = index - 1;
      right = index + 1;
    }


    while (count < k && (left >= 0 || right < arr.length)) {
      if (left >= 0 && right < arr.length) {
        if (calculateDiff(arr[left], x) <= calculateDiff(arr[right], x)) {
          result.addFirst(arr[left--]);
        } else {
          result.addLast(arr[right++]);
        }
      } else if (left >= 0) {
        result.addFirst(arr[left--]);
      } else {
        result.addLast(arr[right++]);
      }

      count++;
    }

    return result;
  }

  private static int calculateDiff(int a, int b) {
    return Math.abs(a - b);
  }
}

