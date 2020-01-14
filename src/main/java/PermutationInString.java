import static common.Utils.lowerCaseCharToInt;

public class PermutationInString {

   //todo do in as in the pattern
   public static boolean checkInclusion(String s1, String s2) {
      if (s1 == null || s2 == null || s1.length() > s2.length()) {
         return false;
      }

      int[] charsFreq = new int[26];

      int s1Length = s1.length();
      for (int index = 0; index < s1Length; index++) {
         charsFreq[lowerCaseCharToInt(s1.charAt(index))]++;
      }

      int charsFound = 0;

      int left = 0;
      int right = -1;

      int s2Length = s2.length();
      while (right < s2Length - 1) {

         int currentFreq = 1;
         while (right < s2Length - 1 && currentFreq > 0) {
            int currentChar = lowerCaseCharToInt(s2.charAt(++right));
            charsFound++;
            currentFreq = --charsFreq[currentChar];
         }

         if (currentFreq == 0 && charsFound == s1Length) {
            return true;
         }

         while (left <= right && ++charsFreq[lowerCaseCharToInt(s2.charAt(left++))] != 0) {
            charsFound--;
            if (currentFreq == 0 && charsFound == s1Length) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean checkInclusion2(String s1, String s2) {
      if (s1 == null || s2 == null || s1.length() > s2.length()) {
         return false;
      }

      int[] charsFreq = new int[26];

      int s1Length = s1.length();
      for (int index = 0; index < s1Length; index++) {
         charsFreq[lowerCaseCharToInt(s1.charAt(index))]++;
      }

      int charsFound = 0;

      int left = 0;
      int right = 0;

      while (left <= right && right < s2.length()) {
         int currentChar = lowerCaseCharToInt(s2.charAt(right));
         charsFound++;

         int currentFreq = --charsFreq[currentChar];
         if (currentFreq < 0) {
            while (left <= right) {
               charsFound--;
               if (++charsFreq[lowerCaseCharToInt(s2.charAt(left++))] == 0) {
                  break;
               }
            }
         }

         if (charsFound == s1Length) {
            return true;
         }
         right++;
      }

      return false;
   }

}
