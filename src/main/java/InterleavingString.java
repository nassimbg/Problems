/**
 * Two DP implementations for this problem
 *  1- Topo DP
 *  2- Recursive + Memo
 */
public class InterleavingString {

   public static boolean isInterleave1(String s1, String s2, String s3) {
      if (s1.length() + s2.length() != s3.length()) {
         return false;
      }
      boolean[] right = new boolean[s2.length() + 1];

      for (int oneIndex = s1.length(); oneIndex >= 0; --oneIndex) {
         boolean[] left = new boolean[s2.length() + 1];
         for (int twoIndex = s2.length(); twoIndex >= 0; --twoIndex) {
            if (oneIndex == s1.length()) {
               left[twoIndex] = twoIndex == s2.length() || (left[twoIndex + 1] && s2.charAt(twoIndex) == s3.charAt(twoIndex + s1.length()));
            } else if (twoIndex == s2.length()) {
               left[twoIndex] = right[twoIndex] && s1.charAt(oneIndex) == s3.charAt(oneIndex + s2.length());
            } else {
               left[twoIndex] = (right[twoIndex] && s1.charAt(oneIndex) == s3.charAt(oneIndex + twoIndex)) || (left[twoIndex + 1] && s2.charAt(twoIndex) == s3.charAt(oneIndex + twoIndex));
            }
         }
         right = left;
      }
      return right[0];
   }

   // as you see you don't need a dimension for s3 you just need two dimenstions since index s3 = index s1 + index s2
   public static boolean isInterleave(String s1, String s2, String s3) {
      int[][] dp = new int[s1.length() + 1][s2.length() + 1];
      return isInterleaveRecursively(dp, s1, 0, s2, 0, s3, 0);
   }

   private static boolean isInterleaveRecursively(int[][]dp, String s1, int oneIndex, String s2, int twoIndex, String s3, int threeIndex) {
      if (dp[oneIndex][twoIndex]!= 0) {
         return dp[oneIndex][twoIndex]== 1;
      }
      while (threeIndex < s3.length() && (oneIndex < s1.length() || twoIndex < s2.length())) {
         char charThree = s3.charAt(threeIndex);

         boolean foundInOne = oneIndex < s1.length() && charThree == s1.charAt(oneIndex);
         boolean foundInTwo = twoIndex < s2.length() && charThree == s2.charAt(twoIndex);
         if (foundInOne || foundInTwo) {
            ++threeIndex;
            if (foundInOne && foundInTwo) {
               boolean isTrue = isInterleaveRecursively(dp, s1, oneIndex + 1, s2, twoIndex, s3, threeIndex) || isInterleaveRecursively(dp, s1, oneIndex, s2, twoIndex + 1, s3, threeIndex);
               dp[oneIndex][twoIndex]= setValueAtCurrentIndex(isTrue);
               return isTrue;
            } else if (foundInOne) {
               ++oneIndex;
            } else {
               ++twoIndex;
            }
         } else {
            dp[oneIndex][twoIndex] = -1;
            return false;
         }
      }

      boolean isTrue = threeIndex == s3.length() && oneIndex == s1.length() && twoIndex == s2.length();
      dp[oneIndex][twoIndex]= setValueAtCurrentIndex(isTrue);
      return isTrue;
   }

   private static int setValueAtCurrentIndex(boolean isTrue) {
      return isTrue ? 1 : -1;
   }
}
