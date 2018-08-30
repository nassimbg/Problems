public class FlipBitToWin {

   public static int flip(int n){
      int firstZero = -1;
      int secondZero = -1;

      int index = 0;
      int mask = 1;
      int longestSequence = 0;

      while(index < 32) {
         if ((mask & n) == 0) {
            longestSequence = Math.max(longestSequence, index - secondZero - 1);
            secondZero = firstZero;
            firstZero = index;
         }
         mask <<= 1;
         ++index;
      }

      return Math.max(longestSequence, index - secondZero - 1);
   }

   static int flip2(int n) {
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
