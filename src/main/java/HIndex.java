import java.util.Arrays;

public class HIndex {
   public static int hIndex(int[] citations) {
      Arrays.sort(citations);

      int rank = 1;
      for (int i = citations.length - 1; i>=0 ; i--) {

         if (rank > citations[i]) {
            break;
         }
         ++rank;

      }

      return rank - 1;


   }
}
