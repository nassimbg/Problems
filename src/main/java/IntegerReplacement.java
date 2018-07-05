public class IntegerReplacement {

   public static int integerReplacement(int n) {
      int number = integerReplacementRec(n);

      return number == Integer.MAX_VALUE ? 0 : number;
   }

   private static int integerReplacementRec(long n) {
      if (n < 1) {
         return Integer.MAX_VALUE;
      }

      if (n == 1) {
         return 0;
      }

      if ((n & 1) == 0) {
         return addValue(n/2);
      } else {
         int min = Integer.MAX_VALUE;

         if (n < Long.MAX_VALUE) {
            min = addValue(n + 1);
         }

         return Math.min(min, addValue(n - 1));
      }
   }

   private static int addValue(long n) {
      int numberOfReplacements = integerReplacementRec(n);
      return numberOfReplacements == Integer.MAX_VALUE ? numberOfReplacements : 1 + numberOfReplacements;
   }
}
