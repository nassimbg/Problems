public class SherlockAndCost {

   public static int findMaxValue(int[] B) {
      int lowValue = 0;
      int highValue = 0;
      for(int index = B.length - 2; index >= 0; --index) {
         int prevLowValue = lowValue;
         lowValue = Math.max(prevLowValue, Math.abs(B[index + 1] - 1) + highValue);
         highValue = Math.max(Math.abs(B[index] - 1) + prevLowValue, Math.abs(B[index] - B[index + 1]) + highValue);
      }

      return Math.max(lowValue, highValue);
   }
}
