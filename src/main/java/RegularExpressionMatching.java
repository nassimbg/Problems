public class RegularExpressionMatching {

   static boolean isMatch(String s, String p) {
      int[][] dp = new int[s.length() + 1][p.length() + 1];
      return isMatching(dp, s, 0, p, 0);
   }

   private static boolean isMatching(int[][] dp, String s, int indexS, String p, int indexP) {

      if (dp[indexS][indexP] != 0) {
         return dp[indexS][indexP] == 1;
      }

      if (indexS == s.length() && indexP == p.length() ) {
         dp[indexS][indexP] = 1;
         return true;
      }

      if (indexP == p.length()) {
         dp[indexS][indexP] = 2;
         return false;
      }

      if (indexS == s.length()) {
         for (int i = indexP; i < p.length(); i+=2) {
            if(!isStar(p, i)) {
               return false;
            }
         }

         return true;
      }

      char pChar = p.charAt(indexP);
      char sChar = s.charAt(indexS);
      boolean charsAreEqual = pChar == sChar;

      boolean isWildCard = pChar == '.';
      boolean isStar = isStar(p, indexP);

      if (!isWildCard && !charsAreEqual && !isStar ) {
         return false;
      }


      int incrementIndex = isStar ? 2 : 1;
      boolean result = (isWildCard || charsAreEqual) && isMatching(dp, s, indexS + 1, p, indexP + incrementIndex);

      if(isStar) {
         result |= (isWildCard || charsAreEqual) && isMatching(dp, s, indexS + 1, p, indexP);
         result |= isMatching(dp, s, indexS, p, indexP + incrementIndex);
      }

      dp[indexS][indexP] = result ? 1 : 2;

      return result;

   }

   private static boolean isStar(String p, int indexP) {
      return indexP < p.length() -1 && p.charAt(indexP + 1) == '*';
   }
}
