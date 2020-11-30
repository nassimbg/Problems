import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthOfPairChain {
  public static int findLongestChain(int[][] pairs) {
    Arrays.sort(pairs, Comparator.<int[]>comparingInt(t -> t[0]).thenComparingInt(t -> t[1]));

    int maxChain = 1;
    int[] dp = new int[pairs.length];

    for (int i = pairs.length - 1; i >= 0; i--) {
      int end = pairs[i][1];

      int maxCount = 0;
      for (int j = i + 1; j < pairs.length; j++) {
        if (end < pairs[j][0]) {
          maxCount = Math.max(maxCount, dp[j]);
        }
      }

      dp[i] = 1 + maxCount;

      maxChain = Math.max(dp[i], maxChain);
    }

    return maxChain;
  }
}
