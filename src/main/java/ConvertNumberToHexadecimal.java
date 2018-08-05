public class ConvertNumberToHexadecimal {

   public static String toHex(int num) {
      int base = 16;
      int totalNumberOfBits = 32;

      int[] rep = createDefaultArrayRep(base, totalNumberOfBits);
      int count = buildRep(num, base, rep);

      return buildHexString(rep, count);
   }

   private static int[] createDefaultArrayRep(int base, int totalNumberOfBits) {
      int numberOfBits = (int) (Math.log(base) / Math.log(2));
      int arrayLength = totalNumberOfBits / numberOfBits;
      return new int[arrayLength];
   }

   private static int buildRep(int num, int base, int[] rep) {
      int count = buildAbsoluteValueRep(num, rep);
      return buildActualValue(num, base, rep, count);
   }

   private static int buildAbsoluteValueRep(int num, int[] rep) {
      long absoluteValue = Math.abs((long)num);
      int count = 0;

      if (absoluteValue == 0) {
         count++;
      }

      while (absoluteValue > 0) {
         int remainder = (int) (absoluteValue % 16);
         absoluteValue /= 16;

         rep[count++] = remainder;
      }
      return count;
   }

   private static int buildActualValue(int num, int base, int[] rep, int count) {
      if (num < 0) {
         int carry = 1;
         count = 0;
         for (; count < rep.length; count++) {
            rep[count] = (base - 1) - rep[count] + carry;

            carry = 0;

            if (rep[count] == base) {
               rep[count] = 0;
               carry = 1;
            }
         }
      }
      return count;
   }

   private static String buildHexString(int[] rep, int count) {
      StringBuilder stringBuilder = new StringBuilder();
      for (int index = count - 1; index >= 0; --index) {

         if (rep[index] > 9 ) {
            stringBuilder.append(((char)('a' + (rep[index] - 10))));
         } else {
            stringBuilder.append(rep[index]);
         }
      }

      return stringBuilder.toString();
   }
}
