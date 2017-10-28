public class DecodeWays {

   public static int numDecodings(String s) {

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
