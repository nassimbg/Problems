public class PaintFence {
   public int numWays(int n, int k) {

      if (n <=0) {
         return 0;
      }

      int paintLikePrevious = 0;
      int dontPaintLikePrevious = k;


      for (int i = 1; i < n; i++) {
         int currentPaintLikePrevious = dontPaintLikePrevious;
         dontPaintLikePrevious = (k - 1) * (dontPaintLikePrevious + paintLikePrevious);
         paintLikePrevious = currentPaintLikePrevious;
      }

      return paintLikePrevious + dontPaintLikePrevious;
   }
}
