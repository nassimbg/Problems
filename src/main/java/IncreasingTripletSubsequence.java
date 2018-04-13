import java.util.Arrays;

public class IncreasingTripletSubsequence {
   public static boolean increasingTriplet(int[] nums) {

      int[] values = new int[3];
      int size = 0;
      for (int number : nums) {
         int index = Arrays.binarySearch(values, 0, size, number);

         if (index < 0) {
            index = -(index + 1);
         }

         values[index] = number;
         if (index == size) {
            if (++size == 3) {
               return true;
            }

         }
      }
      return false;
   }
}
