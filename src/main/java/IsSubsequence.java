public class IsSubsequence {




   public static boolean isSubsequence(String s, String t) {

      int indexS = 0;
      int indexT = 0;

      while (indexS < s.length() && indexT < t.length()) {

         if (t.charAt(indexT) == s.charAt(indexS)) {
            ++indexS;
         }
         ++indexT;
      }

      return indexS == s.length();
   }
}
