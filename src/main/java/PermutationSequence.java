import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

   public static String getPermutation(int n, int k) {
      List<Integer> arrayNumbers = createArrayNumbers(n);

      int factorial = 1;
      int i = 1;

      for (; i <= n; i++) {
         factorial *=i;
         if (factorial >= k) {
            break;
         }

      }

      if (factorial < k) {
         return "";
      }
      StringBuilder result = new StringBuilder();
      for (int j = 0; j < n - i; j++) {
         result.append(arrayNumbers.remove(0));
      }

      while (i > 0) {
         factorial /= i;
         --i;
         int multipleOf = (int) Math.ceil(k / (factorial * 1.0)) - 1;
         result.append(arrayNumbers.remove(multipleOf));

         k = k - (factorial * multipleOf);
      }

      return result.toString();
   }

   private static List<Integer> createArrayNumbers(int n) {
      List<Integer> numbers = new ArrayList<>(n);
      for (int j = 1; j <= n; j++) {
         numbers.add(j);
      }

      return numbers;
   }
}
