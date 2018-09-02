import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal {




   public static String fractionToDecimal(int numerator, int denominator) {
      if (denominator == 0) {
         return "";
      }
      if (numerator == 0) {
         return "0";
      }
      StringBuilder str = new StringBuilder();

      if (numerator < 0 ^ denominator < 0) {
         str.append("-");
      }

      long deno = Math.abs((long)denominator);
      long nume = Math.abs((long)numerator);

      str.append( nume/ deno);
      long rem = nume % deno;

      Map<Long, Integer> positionOfRem = new HashMap<>();

      if (rem != 0) {
         str.append('.');
      }

      while(rem != 0 && !positionOfRem.containsKey(rem)) {

         positionOfRem.put(rem, str.length());
         rem *= 10;
         str.append((rem/deno));
         rem = rem % deno;
      }

      if (rem != 0) {
         int indexToInsert = positionOfRem.get(rem);
         str.insert(indexToInsert, "(");
         str.append(")");
      }


      return str.toString();

   }
























   public static String fractionToDecimal2(int numerator, int denominator) {
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
