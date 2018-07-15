public class FlipBitToWin {
   static int flip(int n) {
      int lastZero = -1;
      int currentLength = 0;
      int maxLength = 0;

      int index = 1;

      for(int i = 0; i < 32; ++i) {
         int valueI = index & n;

         ++currentLength;
         if (valueI ==0) {
            if (lastZero > i - currentLength) {
               currentLength = i - lastZero;
            }

            lastZero = i;
         }


         maxLength = Math.max(maxLength, currentLength);
         index <<=1;
      }
      return maxLength;
   }
}
