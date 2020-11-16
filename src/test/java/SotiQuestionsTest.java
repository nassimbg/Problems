import org.junit.Test;

import static org.junit.Assert.*;

public class SotiQuestionsTest {

  @Test
  public void question11() {
    final int last = lastManStanding2(5, 2);

    assertEquals(3, last);
  }

  @Test
  public void question12() {
    final int last = lastManStanding2(6, 3);

    assertEquals(1, last);
  }

  // Question 1
  public int lastManStanding2(int input1, int input2) {
    boolean[] removed = new boolean[input1];

    int countOfRemoved = 0;

    int index = 0;
    int count = 1;
    while (countOfRemoved < input1) {

      while (removed[index]) {
        index = (index + 1) % input1;
      }

      if (count == input2 || countOfRemoved == input1 - 1) {
        count = 1;
        removed[index] = true;
        countOfRemoved++;
      } else {
        count++;
        index = (index + 1) % input1;
      }
    }

    return index + 1;
  }

  public int lastManStanding(int input1, int input2) {
    boolean[] removed = new boolean[input1];

    int countOfRemoved = 0;

    int index = 0;
    int count = 1;
    while (countOfRemoved < input1 - 1) {

      if (count == input2) {
        count = 1;

        while (removed[index]) {
          index = (index + 1) % input1;
        }

        removed[index] = true;
        countOfRemoved++;
      } else {
        while (removed[index]) {
          index = (index + 1) % input1;
        }
        count++;
        index = (index + 1) % input1;
      }
    }

    while (removed[index]) {
      index = (index + 1) % input1;
    }

    return index + 1;
  }


  // Question 2
  public int balloons(int[] input1, int input2) {
    // Write code here...

    if (input1 == null || input1.length == 0) {
      return 0;
    }

    int[][] dp = new int[input1.length][input1.length];

    for(int left = input1.length - 1; left >= 0; left--) {
      for(int length = 1; length <= input1.length - left; length++) {
        int right = left + length - 1;

        int leftCoins = left == 0 ? 1 : input1[left - 1];
        int rightCoins = right == input1.length - 1 ? 1 : input1[right + 1];

        for(int index = left; index <= right; index++) {
          int dpOfLeft = index != left ? dp[left][index - 1] : 0;
          int dpOfRight = index != right ? dp[index + 1][right] : 0;
          int currentCoins = leftCoins * rightCoins * input1[index];

          int currentDP = dpOfLeft + dpOfRight + currentCoins;
          dp[left][right] = Math.max(dp[left][right], currentDP);
        }
      }
    }

    return dp[0][input1.length - 1];
  }
}
