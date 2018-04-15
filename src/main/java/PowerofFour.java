public class PowerofFour {
   public static boolean isPowerOfFour(int num) {

      return Integer.bitCount(num) == 1&&  Integer.numberOfTrailingZeros(num) % 2 == 0;
   }
}
