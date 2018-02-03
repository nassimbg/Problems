public class OneEditDistance {
   public boolean isOneEditDistance(String s, String t) {
      int indexInS = 0;
      int indesInT = 0;

      boolean numberOfDifference = false;
      while(indexInS < s.length() && indesInT < t.length()) {
         if (s.charAt(indexInS) == t.charAt(indesInT)) {
            ++indesInT;
            ++indexInS;
         } else {
            if (numberOfDifference) {
               return false;
            }
            numberOfDifference = true;
            if (s.length() >= t.length()) {
               ++indexInS;
            }

            if (s.length() <= t.length()) {
               ++indesInT;
            }
         }
      }

      if (indesInT + 1 == t.length() || indexInS + 1 == s.length()) {
         return !numberOfDifference;
      }

      return false;
   }
}
