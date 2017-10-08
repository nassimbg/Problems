public class Pow {

   public static double myPow(double x, int n) {

      if (n < 0) {
         x = 1/x;
         n = -1 * n;
      }
      double va = x;

      int i;
      for ( i = 2; i <= n; i = 2 * i) {
         va= va * va;
      }



      if (n > 1) {
         for (int j = 0; j < n - i / 2; j++) {
            va *= x;
         }

      }
      return n == 0 ? 1 : va;

   }
}
