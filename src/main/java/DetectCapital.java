public class DetectCapital {
   public boolean detectCapitalUse(String word) {
      for (int i = 1; i < word.length();i++) {
         char c = word.charAt(i);

         if (Character.isUpperCase(c)) {
            if (Character.isLowerCase(word.charAt(i - 1)) || (i + 1 < word.length() && Character.isLowerCase(word.charAt(i + 1)))) {
               return false;
            }
         }
      }

      return true;
   }
}
