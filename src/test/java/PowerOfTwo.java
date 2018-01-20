public class PowerOfTwo {
   public boolean isPowerOfTwo(int n) {
      return Integer.bitCount(n) <= 1;
   }
}
