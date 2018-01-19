public class BasicCalculator {

   int index = 0;
   public int calculate(String s) {

      boolean isAddition = true;
      int sum = 0;
      while(index < s.length()) {
         char c = s.charAt(index);

         if (c == ')') {
            break;
         }

         if (!Character.isWhitespace(c)) {

            if (c == '(') {
               ++index;
               sum = applyCalculation(sum, isAddition, calculate(s));
            }

            if (Character.isDigit(c) ) {
               int number = 0;
               while (index < s.length() && Character.isDigit(s.charAt(index))) {
                  number = number * 10 + translateToNumber(s.charAt(index));
                  ++index;
               }
               --index;

               sum = applyCalculation(sum, isAddition, number);
            }

            if (c == '+') {
               isAddition = true;
            } else if (c == '-') {
               isAddition = false;
            }
         }

         ++index;
      }
      return sum;
   }


   private static int translateToNumber(char c) {
      return c - '0';
   }

   private static int applyCalculation(int sum, boolean isAddition, int number) {
      return isAddition ? sum + number : sum - number;
   }
}
