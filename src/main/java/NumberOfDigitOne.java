public class NumberOfDigitOne {

   /**
    * assume we have 3842
    * number of 1s =
    *   3 * (number of 1s in _ _ _) + 1000
    * + 8 * (number of 1s in _ _) + 100
    * + 4 * (number of 1s in _) + 10
    * + 2 * (number of 1s in ) + 1
    *
    * number of 1s in.... is the variable {@code previousAllPossibleNumber}
    * ex : (number of 1s in _ _ _) = 10 * (number of 1s in _ _ ) + 100
    *
    * the (+ 1000) on the first line is usually not always like that.
    * Here we have an if statement if 3 was 1 => it will be (+ 842)
    * and if we hace 0 => it will be (+ 0)
    *
    *
    * @param n
    * @return
    */
   public static int countDigitOne(int n) {
      int previousAllPossibleNumber = 0;
      int total = 0;


      int digit;
      int temp = n;
      int powerOfTen = 1;
      while (temp > 0) {
         digit = temp % 10;
         temp /=10;
         total += digit * previousAllPossibleNumber + (digit == 1 ? (n % powerOfTen ) + 1: digit > 1 ? powerOfTen : 0);
         previousAllPossibleNumber = 10 * previousAllPossibleNumber + powerOfTen;
         powerOfTen *=10;
      }

      return total;

   }
}
