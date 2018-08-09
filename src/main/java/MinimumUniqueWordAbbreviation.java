import java.util.Optional;

public class MinimumUniqueWordAbbreviation {
   public static String minAbbreviation(String target, String[] dictionary) {

      if (target == null) {
         return null;
      }

      for(int numberOfCharsToRemove = target.length(); numberOfCharsToRemove >= 0; --numberOfCharsToRemove) {
         Optional<String> minAbbreviation = findMinAbbreviation(dictionary, numberOfCharsToRemove, 0, target, 0, 0);

         if (minAbbreviation.isPresent()) {
            return minAbbreviation.get();
         }
      }

      return "";
   }


   private static Optional<String> findMinAbbreviation(String[] dict, int numberOfCharsToRemove, int numberRemoved, String target, int index, int chars) {

      if (numberRemoved == numberOfCharsToRemove) {

         String abb = generateAbb(target, chars);

         return isAbbNotAvailableInDict(dict, abb);

      } else if (target.length() == index) {
         return Optional.empty();
      }else {
         Optional<String> firstAbb = findMinAbbreviation(dict, numberOfCharsToRemove, numberRemoved, target, index + 1, chars);

         if (firstAbb.isPresent()) {
            return firstAbb;
         }

         chars |= 1<<index;
         return findMinAbbreviation(dict, numberOfCharsToRemove, numberRemoved + 1, target, index + 1, chars);
      }
   }

   private static String generateAbb(String target, int chars) {
      StringBuilder abbBuilder = new StringBuilder();

      int countOfCharsRemoved = 0;
      for(int charIndex = 0; charIndex < target.length(); ++charIndex) {
         if ((chars & 1) == 1) {
            countOfCharsRemoved++;
         } else {
            countOfCharsRemoved = addCountToString(abbBuilder, countOfCharsRemoved);

            abbBuilder.append(target.charAt(charIndex));
         }

         chars >>=1;
      }

      addCountToString(abbBuilder, countOfCharsRemoved);

      return abbBuilder.toString();
   }

   private static int addCountToString(StringBuilder abbBuilder, int countOfCharsRemoved) {
      if (countOfCharsRemoved > 0) {
         abbBuilder.append(countOfCharsRemoved);
         countOfCharsRemoved = 0;
      }
      return countOfCharsRemoved;
   }

   private static Optional<String> isAbbNotAvailableInDict(String[] dict, String abb) {
      for(String word : dict) {
         if (isAbbOfWord(abb, word)) {
            return Optional.empty();
         }
      }

      return Optional.of(abb);
   }

   private static boolean isAbbOfWord(String abb, String word) {

      int indexOfWord = 0;
      for (int indexOfAbb = 0; indexOfAbb < abb.length(); indexOfAbb++) {
         if (indexOfWord >= word.length()) {
            return false;
         }

         char c = abb.charAt(indexOfAbb);

         if (Character.isDigit(c)) {
            indexOfWord += (c - '0') - 1;
         } else if (c != word.charAt(indexOfWord)){
            return false;
         }
         ++indexOfWord;
      }

      return indexOfWord == word.length();
   }
}
