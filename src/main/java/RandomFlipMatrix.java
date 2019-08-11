import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomFlipMatrix {
   class Solution {

      private final int n_rows;
      private final int n_cols;
      private final int totalNumberOfCeils;
      private Set<Integer> flipped;
      private Random random;

      public Solution(int n_rows, int n_cols) {

         this.n_rows = n_rows;
         this.n_cols = n_cols;
         totalNumberOfCeils = n_rows * n_cols;
         random = new Random();


         reset();

      }

      public int[] flip() {

         int nextInt;
         do {
            nextInt = random.nextInt(totalNumberOfCeils);
         } while (flipped.contains(nextInt));

         flipped.add(nextInt);
         int row = nextInt / n_cols;
         int col = nextInt % n_cols;

         return new int[] { row, col };
      }

      public void reset() {
         flipped = new HashSet<>();
      }
   }
}
