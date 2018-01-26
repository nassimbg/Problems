public class FractionToRecurringDecimal {
   public static String fractionToDecimal(int numerator, int denominator) {
      double value = (1.0 * numerator) / denominator;
      String val = String.valueOf(value);
      String[] split = val.split("\\.");
      StringBuilder stringBuilder = new StringBuilder(split[0]);

      if (split.length > 1 ) {
         StringBuilder fraction = new StringBuilder();
         String stringVal = split[1];
         int index = 0;
         while (index < stringVal.length()) {
            char charAt = stringVal.charAt(index);
            if (fraction.length() > 0 && checkIfRepeat(stringVal, index, fraction.toString())) {
               return stringBuilder.append("(").append(fraction.toString()).append(")").toString();
            }
            fraction.append(charAt);
            ++index;
         }
         String fractionString = fraction.toString();
         if (!fractionString.equals("0")) {
            stringBuilder.append(".").append(fractionString);
         }
      }

      return stringBuilder.toString();
   }

   private static boolean checkIfRepeat(String stringVal, int index, String toString) {
      int internalIndex = index;
      int stringBuilderLength = toString.length();
      while (internalIndex + stringBuilderLength < stringVal.length()) {
         if (!stringVal.substring(internalIndex, internalIndex + stringBuilderLength).equals(toString)) {
            return false;
         }
         internalIndex = internalIndex + stringBuilderLength;
      }
      return true;
   }
}
