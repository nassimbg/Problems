import java.util.Collections;
import java.util.List;

public class IncrementArrayUntilUnique {
   public static int getMinimumUniqueSum(List<Integer> arr) {
      // Write your code here

      if (arr == null || arr.size() < 2) {
         return 0;
      }

      Collections.sort(arr);

      int sum = arr.get(0);

      for (int currentIndex = 1; currentIndex < arr.size(); currentIndex++) {

         // increment current value
         if (arr.get(currentIndex) <= arr.get(currentIndex - 1)) {
            int increment = arr.get(currentIndex - 1) - arr.get(currentIndex) + 1;

            arr.set(currentIndex, arr.get(currentIndex) + increment);
         }

         // get sum after incrementing the current value
         sum += arr.get(currentIndex);
      }

      return sum;
   }
}
