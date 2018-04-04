public class SuperUglyNumber {
   public static int nthSuperUglyNumber(int n, int[] primes) {
      int[] index = new int[primes.length];

      int[] values = new int[n];
      values[0] = 1;

      for (int i = 1; i < n; i++) {
         int min = Integer.MAX_VALUE;
         for (int j = 0; j < primes.length; j++) {
            int currentValue = primes[j] * values[index[j]];
            if (min > currentValue) {
               min = currentValue;
            }
         }

         for (int j = 0; j < primes.length; j++) {
            int currentValue = primes[j] * values[index[j]];
            if (min == currentValue) {
               index[j]++;
            }
         }

         values[i] = min;
      }

      return values[n - 1];
   }
}
