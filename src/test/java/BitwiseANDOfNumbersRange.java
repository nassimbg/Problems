public class BitwiseANDOfNumbersRange {
   public static int rangeBitwiseAnd(int m, int n) {

      int result = 0;
      int temp = 0;
      for (int i = 0; i < 32; ++i) {
         int powerofTwo = 1 << i;
         if ((m & powerofTwo) != 0) {
            int removeBelowBits = m - temp;
            if (n - removeBelowBits < powerofTwo) {
               result +=powerofTwo;
            }
            temp +=powerofTwo;
         }
      }

      return result;
   }
}
