public class AddStrings {

   public String addStrings(String num1, String num2) {

      int length1 = num1.length();
      int length2 = num2.length();
      int maxLength = Math.max(length1, length2);

      StringBuilder number = new StringBuilder();
      int carry = 1;
      for (int i = 0; i < maxLength; i++) {

         int digit1 = getDigit(num1, length1 - 1 - i);
         int digit2 = getDigit(num2, length2 - 1 - i);

         int newDigit = carry + digit1 + digit2;

         carry = newDigit > 9 ? 1 : 0;
         number.append(newDigit % 10);
      }

      if (carry == 1) {
         number.append(carry);
      }


      return number.reverse().toString();

   }

   private int getDigit(String num1, int index1) {
      return index1 >= 0 ? num1.charAt(index1) - '0' : 0;
   }
}
