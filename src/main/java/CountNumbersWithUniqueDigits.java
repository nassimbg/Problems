public class CountNumbersWithUniqueDigits {


   public static int countNumbersWithUniqueDigits(int n) {
      int uniqueCounts = 1;

      for (int digits = 1; digits <=n; ++digits) {
         int currentDigit = digits;
         int currentCount = 9;

         int maxPremutation = 9;
         while (--currentDigit > 0) {
            currentCount *=maxPremutation;
            --maxPremutation;
         }
         uniqueCounts +=currentCount;
      }

      return uniqueCounts;
   }

   public static int countNumbersWithUniqueDigitsBrootForce(int n) {
      int uniqueCount = 0;
      double pow = Math.pow(10, n);
      for (int value = 0; value < pow; value++) {
         int valuesPresent = 0;

         ++uniqueCount;
         int currentNumber = value;
         while (currentNumber > 0) {
            int digit = currentNumber % 10;

            if ((valuesPresent & 1 << digit) != 0) {
               --uniqueCount;
               break;
            } else {
               valuesPresent |= 1 << digit;
            }
            currentNumber /= 10;
         }

      }

      return uniqueCount;
   }
}
