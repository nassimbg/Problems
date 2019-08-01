import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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



   // another way using a set to check if we used this value before
   // in fact we dont need this set since we should be sure if A[i-1] > A[i] => we used A[i] before
   public int minIncrementForUnique(int[] A) {
      Arrays.sort(A);
      Set<Integer> used = new HashSet<>();
      int res = 0;
      for(int i=0; i<A.length; i++){
         if(used.contains(A[i])){
            res+=A[i-1]+1-A[i];
            A[i]=A[i-1]+1;
         }
         used.add(A[i]);
      }
      return res;
   }
}
