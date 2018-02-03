import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PalindromePermutationII {
   public static List<String> generatePalindromes(String s) {
      Map<Character, Integer> freqOfChars = new HashMap<>();

      int countNumberOfOdds =0;

      for (int index = 0; index < s.length(); index++) {
         char c = s.charAt(index);

         int occurance = freqOfChars.compute(c, (k, v) -> v == null ? 1 : ++v);

         countNumberOfOdds += (occurance % 2 == 0 ? -1 : 1);
      }
      List<String> result = new ArrayList<>();

      if (countNumberOfOdds > 1) {
         return result;
      }

      permutePlaindrom(freqOfChars, new char[s.length()], 0, result);
      return result;
   }



   private static void permutePlaindrom(Map<Character, Integer> freqOfChars, char[] stack, int indexReached, List<String> result) {

      int indexFromRight = stack.length - 1 - indexReached;
      if(indexReached > indexFromRight) {
         result.add(new String(stack));
         return;
      }

      for (Character character : freqOfChars.keySet()) {
         int occurenceLeft = freqOfChars.get(character);
         if (occurenceLeft > 1 || occurenceLeft == 1 && indexReached == indexFromRight) {

            freqOfChars.computeIfPresent(character, (k, v) -> v-=2);

            stack[indexReached] = character;
            stack[indexFromRight] = character;

            permutePlaindrom(freqOfChars, stack, indexReached + 1, result);
            freqOfChars.computeIfPresent(character, (k, v) -> v+=2);

         }
      }

   }
}
