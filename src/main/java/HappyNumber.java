import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

   public static boolean isHappy(int n) {

      Set<Integer> values = new HashSet<>();
      int result = n;

      while(!values.contains(result)) {
         values.add(result);

         int val = result;
         result = 0;
         while (val > 0) {
            int digit = val% 10;

            result += (digit * digit);
            val /= 10;
         }

         if (result == 1) {
            return true;
         }
      }


      return false;

   }
}
