public class ScrambleString {

   //check notes or even some submissions on leetcode for information about why its solved in this way
   public static boolean isScramble(String s1, String s2) {
      int[][][] dp = new int[s1.length()][s1.length()][s1.length()];
      return isScrambleRec(dp, s1, 0, s1.length() - 1, s2, 0, s2.length() - 1);
   }

   private static boolean isScrambleRec(int[][][] dp, String s1, int startS1, int endS1, String s2, int startS2, int endS2) {
      int size = endS1 - startS1;

      if(dp[startS1][startS2][size] != 0) {
         return dp[startS1][startS2][size] == 1;
      }

      if (size == 0) {
         boolean areEqual = s1.charAt(startS1) == s2.charAt(startS2);
         dp[startS1][startS2][size] = areEqual ? 1 : -1;

         return areEqual;
      }

      for (int length = 1; length <= size; ++length) {

         boolean isScramble = (isScrambleRec(dp, s1, startS1, startS1 + length -1, s2, startS2, startS2 + length - 1) && isScrambleRec(dp, s1, startS1 + length, endS1, s2, startS2 + length, endS2)) ||
           (isScrambleRec(dp, s1, startS1, startS1 + length -1, s2, endS2 - (length - 1), endS2) && isScrambleRec(dp, s1, startS1 + length, endS1, s2, startS2, endS2 - length));

         if(isScramble) {
            dp[startS1][startS2][size] = 1;
            return true;
         }
      }

      dp[startS1][startS2][size] = -1;
      return false;
   }
}
