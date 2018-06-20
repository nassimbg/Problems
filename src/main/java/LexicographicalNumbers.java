import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {
   public static List<Integer> lexicalOrder(int n) {
      List<Integer> result = new ArrayList<>();

      findNumbersUsingImplesitTrie(n, 0, result);

      return result;
   }

   private static void findNumbersUsingImplesitTrie(int limit, int currentNumber, List<Integer> result) {
      for(int digit = 0; digit < 10; ++digit) {
         if (digit != 0 || currentNumber != 0) {
            currentNumber = (currentNumber *10) + digit;

            if (currentNumber > limit) {
               return;
            }

            result.add(currentNumber);
            findNumbersUsingImplesitTrie(limit, currentNumber, result);
            currentNumber /=10;
         }
      }
   }
}

