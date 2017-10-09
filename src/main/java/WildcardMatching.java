public class WildcardMatching {

   public static boolean isMatch(String s, String p) {

      boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
      dp[s.length()][p.length()] = true;

      for (int pIndex = p.length() - 1; pIndex >= 0; --pIndex) {
         for (int sIndex = s.length(); sIndex >= 0; --sIndex) {
            char pChar = p.charAt(pIndex);

            boolean isStar = pChar == '*';
            boolean isWildCard = pChar == '?';

            if (isStar) {
               dp[sIndex][pIndex] = dp[sIndex][pIndex + 1] || (sIndex < s.length() && (dp[sIndex + 1][pIndex]|| dp[sIndex + 1][pIndex + 1]));

            } else if (sIndex != s.length()){
               dp[sIndex][pIndex] = (isWildCard || pChar == s.charAt(sIndex)) && dp[sIndex + 1][pIndex + 1];
            }
         }
      }

      return dp[0][0];
   }
}
