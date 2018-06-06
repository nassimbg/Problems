public class SumOfTwoIntegers {
   public static int getSum(int a, int b) {
      int bitIndex = 1;
      int carry = 0;
      int result = 0;
      for(int index = 0; index < 32; ++index) {
         int bitInA = a & bitIndex;
         int bitInB = b & bitIndex;

         int XORofInput =  bitInA ^ bitInB;
         int valueOfCurrentBit = XORofInput ^ carry;
         result |= valueOfCurrentBit;

         carry = ((bitInA & bitInB) | carry & XORofInput) << 1;
         bitIndex <<=1;

      }

      return result;
   }
}

