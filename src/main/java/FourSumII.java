import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FourSumII {

   // O(AB + CD)
   public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

      int count = 0;

      Map<Integer, Integer> comb = new HashMap<>();

      for (int d : D) {
         for (int c : C) {
            int add = c + d;
            int countComb = comb.getOrDefault(add, 0);
            comb.put(add, countComb + 1);
         }
      }

      for (int a : A) {
         for (int b : B) {
            count += comb.getOrDefault(-(a + b), 0);
         }
      }

      return count;
   }


   // O(ABC (logD + D))
   public static int fourSumCount1(int[] A, int[] B, int[] C, int[] D) {

      int count = 0;

      Arrays.sort(D);

      for (int a : A) {
         for (int b : B) {
            for (int c : C) {
               int index = Arrays.binarySearch(D, -(a + b + c));
               if (index >= 0) {
                  count++;

                  int rightIndex = index + 1;
                  while (rightIndex < D.length && D[rightIndex] == D[index]) {
                     count++;
                     rightIndex++;
                  }

                  int leftIndex = index - 1;
                  while (leftIndex >= 0 && D[leftIndex] == D[index]) {
                     count++;
                     leftIndex--;
                  }

               }
            }
         }
      }

      return count;
   }
}
