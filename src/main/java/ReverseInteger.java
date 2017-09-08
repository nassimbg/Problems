public class ReverseInteger {

   static int reverse(long value) {
      boolean isPositive = value > 0;
      int maxValue = isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      int reversedValue = 0;

      while (value != 0) {
         int digit  = (int) value%10;

         if ((reversedValue > (maxValue - digit)/10.) == isPositive) {
            return 0;
         }
         reversedValue = (reversedValue*10) + digit;

         value/=10;
      }

      return reversedValue;
   }
}
