public class PlusOne {

   public static int[] plusOne(int[] digits) {

      int caret = 1;
      for(int index = digits.length - 1; index>= 0 ; --index) {
         if (digits[index] == 9) {
            digits[index] = 0;
         } else {
            digits[index] += caret;
            return digits;
         }
      }

      int[] newDigits = new int[digits.length + 1];
      newDigits[0] = 1;
      System.arraycopy(digits, 0, newDigits, 1, digits.length);
      return newDigits;
   }
}
