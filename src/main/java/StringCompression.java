public class StringCompression {
   public static int compress(char[] chars) {

      int slowIndex = 0;
      int fastIndex = 0;
      int indexReachedToFill = 0;

      while (fastIndex < chars.length) {
         while (fastIndex < chars.length && chars[fastIndex] == chars[slowIndex]) {
            fastIndex++;
         }

         int numberOfOccurancesOfChar = fastIndex - slowIndex;

         chars[indexReachedToFill++] = chars[slowIndex];

         if (numberOfOccurancesOfChar > 1) {
            String occ = String.valueOf(numberOfOccurancesOfChar);

            for (int i = 0; i < occ.length(); i++) {
               chars[indexReachedToFill++] = occ.charAt(i);
            }
         }
         slowIndex = fastIndex;
      }

      return indexReachedToFill;
   }
}
