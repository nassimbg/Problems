public class BasicCalculatorII {

   int index = 0;
   public int calculate(String s) {
      int sum = 0;
      int operation = 0;
      while (index < s.length()) {
         char c = s.charAt(index);
         if (!Character.isWhitespace(c)) {

            if (Character.isDigit(s.charAt(index))) {
               sum = operation(operation, sum, getNumber(s));
            }

            if(c == '+') {
               ++index;
               sum += calculate(s);

            } else if (c == '-') {
               ++index;
               sum -= calculate(s);
            } else if (c == '*') {
               operation = 2;
            } else if (c == '/') {
               operation = 3;
            }
         }
            ++index;
      }

      return sum;
   }

   private int operation(int operation, int sum, int number) {
      switch (operation) {
         case 0:
            sum +=number;
            break;
         case 1:
            sum -= number;
            break;
         case 2:
            sum *= number;
            break;
         case 3:
            sum /= number;
            break;
      }
      return sum;
   }

   private int getNumber(String s) {
         int number = 0;

         //todo add it to sum
         while (index < s.length() && Character.isDigit(s.charAt(index))) {
            number = number * 10 + (s.charAt(index++) - '0');
         }
         --index;
      return number;
   }
}
