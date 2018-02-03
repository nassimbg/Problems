public class CountPrimes {
   public int countPrimes(int n) {
      boolean[] notPrime = new boolean[n];

      int numberOfPrime = 1;
      for (int i = 2; i < n; i++) {
         if (!notPrime[i]) {
            for (int j = 2; j * i< n; j++) {
               notPrime[j*i] = true;
            }
            ++numberOfPrime;
         }
      }

      return numberOfPrime;
   }
}
