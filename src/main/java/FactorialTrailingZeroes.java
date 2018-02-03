public class FactorialTrailingZeroes {
   public static int trailingZeroes(int n) {
      int x = n;
      int sumOfDigits = 0;
      while (x > 0) {
         sumOfDigits += x % 5;
         x /=5;
      }

      return (n - sumOfDigits)/4;
   }
}
