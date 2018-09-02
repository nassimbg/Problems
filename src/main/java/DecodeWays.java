public class DecodeWays {

   public static int numDecodings(String s) {

      if (s.isEmpty()) {
         return 0;
      }
      int nextDP = 1;
      int secondNextDP = 0;

      for(int index = s.length() - 1; index >= 0; --index) {

         boolean isCurrentZero = s.charAt(index) == '0';
         int currentWays = isCurrentZero ? 0 : nextDP;

         if (!isCurrentZero && index < s.length() - 1) {

            int value = Integer.parseInt(s.substring(index, index + 2));
            if( value > 0 && value <= 26) {
               currentWays += secondNextDP;
            }
         }

         secondNextDP = nextDP;
         nextDP = currentWays;
      }

      return nextDP;
   }



   public static int numDecodings2(String s) {

      int secondStepAhead = 1;
      int firstStepAhead = s.isEmpty() || s.charAt(s.length() - 1) == '0' ? 0 : 1;

      for (int index = s.length() - 2; index >=0; --index) {
         int tempResult = 0;

         char charAt = s.charAt(index);
         if (charAt == '2' && s.charAt(index + 1) <= '6' || charAt == '1') {
            tempResult = secondStepAhead;
         }

         tempResult = charAt != '0' ? tempResult + firstStepAhead : 0;

         secondStepAhead = firstStepAhead;
         firstStepAhead = tempResult;
      }

      return firstStepAhead;
   }

}
