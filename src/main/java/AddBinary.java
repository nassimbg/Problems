public class AddBinary {

   public static String addBinary(String a, String b) {

      StringBuilder stringBuilder = new StringBuilder();
      int index = 0;

      int caret = 0;
      while (index < a.length() && index < b.length()) {
         int aChar = a.charAt(a.length() - 1 - index) - '0';
         int bChar = b.charAt(b.length() - 1 - index) - '0';
         int sum = caret + aChar + bChar;

         caret = handleSum(stringBuilder, sum);
         ++index;
      }

      caret = appendResidue(a, stringBuilder, index, caret);
      caret = appendResidue(b, stringBuilder, index, caret);

      if (caret == 1) {
         stringBuilder.append('1');
      }

      return stringBuilder.reverse().toString();

   }

   private static int appendResidue(String a, StringBuilder stringBuilder, int index, int caret) {
      while (index < a.length()) {
         int aChar = a.charAt(a.length() - 1 - index) - '0';
         int sum = aChar + caret;

         caret = handleSum(stringBuilder, sum);
         ++index;
      }

      return caret;
   }

   private static int handleSum(StringBuilder stringBuilder, int sum) {
      stringBuilder.append(sum % 2);
      return sum > 1 ? 1:0;
   }
}
