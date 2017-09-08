public class StringToInteger {

   static int atoi(String str) {

      int value = 0;
      boolean isPositive = true;
      boolean numberStarted = false;
      for(int index = 0; index < str.length(); ++index) {
         char ch = str.charAt(index);
         boolean isDigit = Character.isDigit(ch);

         if (isDigit) {
            int digit = ch - '0';
            int newvalue = (value*10) + digit;
            if(newvalue < 0 || (newvalue - digit)/10. != value) {
               return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            value = newvalue;
            numberStarted = true;
         } else {
            if (!numberStarted) {
               if ((ch == '-' || ch == '+')) {
                  isPositive = ch == '+';
                  numberStarted = true;
               } else if(!Character.isWhitespace(ch)) {
                  break;
               }
            } else {
               break;
            }
         }
      }

      return getAnInt(value, isPositive);
   }

   private static int getAnInt(int value, boolean isPositive) {
      return isPositive ? value : -value;
   }
}
