import java.util.Arrays;

public class OnesAndZeroes {

   // from solutions
   public static int findMaxForm(String[] strs, int m, int n) {
   int l = strs.length;
   int[][] dp = new int[m+1][n+1];

    for (int i = 0; i < m+1; i++) {
      Arrays.fill(dp[i], 0);
   }

   int[] nums = new int[]{0,0};
    for (String str : strs) {
      nums = calculate(str);
      for (int j = m; j >= nums[0]; j--) {
         for (int k = n; k >= nums[1]; k--) {
            if (j>=nums[0] && k>=nums[1]) {
               dp[j][k] = Math.max(dp[j][k], dp[j-nums[0]][k-nums[1]]+1);
            } else {
               dp[j][k] = dp[j][k];
            }
         }
      }
   }

    return dp[m][n];
}

   private static int[] calculate(String str) {
      int[] res = new int[2];
      Arrays.fill(res, 0);

      for (char ch : str.toCharArray()) {
         if (ch == '0') {
            res[0]++;
         } else if (ch == '1') {
            res[1]++;
         }
      }

      return res;
   }
   public static int findMaxForm2(String[] strs, int m, int n) {

      int[][] freq = new int[strs.length][2];

      for (int i = 0; i < strs.length; i++) {

         for (int charIndex = 0; charIndex < strs[i].length(); charIndex++) {
            if (strs[i].charAt(charIndex) == '1') {
               freq[i][1]++;
            } else {
               freq[i][0]++;
            }
         }
      }

      return dfs(freq, 0, m, n, 0);
   }

   private static int dfs(int[][] freq, int index, int zeroLeft, int oneLeft, int stringsTaken) {

      int numberOfCom = 0;

      if (index < freq.length) {
         // dont take it
         numberOfCom = Math.max(numberOfCom, dfs(freq, index + 1, zeroLeft, oneLeft, stringsTaken));

         //take it
         zeroLeft -= freq[index][0];
         oneLeft -= freq[index][1];


         stringsTaken++;
         if (zeroLeft == 0 && oneLeft == 0) {
            numberOfCom = Math.max(numberOfCom, stringsTaken);
         } else {
            numberOfCom = Math.max(numberOfCom, dfs(freq, index + 1, zeroLeft, oneLeft, stringsTaken));
         }
      }

      return numberOfCom;
   }
}
