public class DivideTwoIntegers {
   public static int divide(int dividend, int divisor) {

      boolean isNegative = dividend < 0 ^ divisor < 0;

      if (dividend == Integer.MIN_VALUE) {

         if (!isNegative && divisor == -1) {
            return Integer.MAX_VALUE;
         }
      }


      if (dividend > 0) {
         dividend *= -1;
      }

      if (divisor > 0) {
         divisor *= -1;
      }

      int factor = 0;
      while (dividend <= divisor) {
         int count = 1;

         int mult = divisor;
         while (mult + mult >= dividend) {
            mult <<=1;
            count <<=1;
         }

         factor += count;
         dividend -= mult;
      }

      if (isNegative) {
         factor *= -1;
      }
      return factor;
   }
}
