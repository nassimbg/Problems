public class CountingBits {
   public static int[] countBits(int num) {

      int counter = 0;
      int[] result = new int[num + 1];

      int[] bits = new int[32];
      for (int i = 1; i <= num ; i++) {

         int bitIndex = 0;
         while (bitIndex < 32 && bits[bitIndex] == 1) {
            bits[bitIndex] = 0;
            --counter;
            ++bitIndex;
         }

         if (bitIndex < 32) {
            bits[bitIndex] = 1;
            ++counter;
         }
         result[i] = counter;

      }

      return result;
   }
}
