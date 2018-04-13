import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePairs {
   public static List<List<Integer>> palindromePairs(String[] words) {

      List<List<Integer>> result = new ArrayList<>();

      for (int i = 0; i < words.length; i++) {
         for (int j = i+1; j < words.length; j++) {
            if (i != j) {
               checkPal(words, result, i, j);
               checkPal(words, result, j, i);
            }
         }
      }

      return result;

   }

   private static void checkPal(String[] words, List<List<Integer>> result, int i, int j) {
      String first = words[i];
      String second = words[j];

      int firstLength = first.length();
      int secondLength = second.length();

      int start = 0;
      int end = firstLength + secondLength -1;

      boolean ispalindrom = true;
      while (start < end) {
         char startCar = start < firstLength ? first.charAt(start) : second.charAt(start - firstLength);
         char endCar = end >= firstLength ? second.charAt(end - firstLength) : first.charAt(end);

         if (startCar != endCar) {
            ispalindrom = false;
            break;
         }
         ++start;
         --end;
      }

      if (ispalindrom) {
         result.add(Arrays.asList(i, j));
      }
   }
}
