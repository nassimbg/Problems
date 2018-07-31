public class RemoveKDigits {
   public static String removeKdigits(String num, int k) {
      if (k <= 0) {
         return num;
      }

      if (num.length() <= 1) {
         return "0";
      }

      StringBuilder stringBuilder = new StringBuilder();
      int index = 0;
      int numberOfDeletedDigits = 0;

      while (num.length() > numberOfDeletedDigits && k > 0) {
         int lastIndexAppended = stringBuilder.length() - 1;

         if (lastIndexAppended < 0 || (index < num.length() && stringBuilder.charAt(lastIndexAppended) <=  num.charAt(index) )) {
            char c = num.charAt(index);
            stringBuilder.append(c);
            ++index;
         } else {
            stringBuilder.deleteCharAt(lastIndexAppended);
            ++numberOfDeletedDigits;
            --k;
         }
      }

      if (index < num.length()) {
         stringBuilder.append(num.substring(index));
      }

      int trailingZeros = 0;
      while (trailingZeros < stringBuilder.length() && stringBuilder.charAt(trailingZeros) == '0') {
         ++trailingZeros;
      }

      if (trailingZeros > 0) {
         stringBuilder.delete(0, trailingZeros);
      }

      return stringBuilder.length() == 0 ? "0" : stringBuilder.toString();
   }
}
