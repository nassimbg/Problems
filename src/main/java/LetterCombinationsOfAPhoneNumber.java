import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {

   private final static Map<Character, String> LETTER_TO_NUMBERS;

   static {
      LETTER_TO_NUMBERS = new HashMap<>();
      LETTER_TO_NUMBERS.put('1', "");
      LETTER_TO_NUMBERS.put('2', "abc");
      LETTER_TO_NUMBERS.put('3', "def");
      LETTER_TO_NUMBERS.put('4', "ghi");
      LETTER_TO_NUMBERS.put('5', "jkl");
      LETTER_TO_NUMBERS.put('6', "mno");
      LETTER_TO_NUMBERS.put('7', "pqrs");
      LETTER_TO_NUMBERS.put('8', "tuv");
      LETTER_TO_NUMBERS.put('9', "wxyz");
   }

   public static List<String> letterCombinations(String digits) {

      List<String> results = new ArrayList<>();
      results.add("");

      for (int i = 0; i < digits.length(); i++) {
         String val = LETTER_TO_NUMBERS.get(digits.charAt(i));

         int initialSize = results.size();
         for (int valIndex = 1; valIndex < val.length(); valIndex++) {
            for (int initialIndex = 0; initialIndex < initialSize; initialIndex++) {
               results.add(results.get(initialIndex) + val.charAt(valIndex));
            }
         }

         for (int initialIndex = 0; initialIndex < initialSize; initialIndex++) {
            results.set(initialIndex, results.get(initialIndex) + val.charAt(0));
         }
      }

      return results;

   }

}
