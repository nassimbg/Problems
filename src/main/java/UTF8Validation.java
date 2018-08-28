public class UTF8Validation {


   public static boolean validUtf8(int[] data) {
      int maxMaskShouldBe = 15 << 4;
      int maxMask = 31 << 3;
      int otherMask = 3 << 6;
      int otherMaskShouldBe = 1 << 7;

      int index = 0;
      while (index < data.length) {
         int tempMaskShouldBe = maxMaskShouldBe;
         int tempMask = maxMask;

         int numberOfBytes = 3;

         while((data[index] & tempMask)!= tempMaskShouldBe) {
            tempMaskShouldBe &= (tempMaskShouldBe - 1);
            tempMask &= (tempMask - 1);
            numberOfBytes--;
         }

         if (numberOfBytes == 0 || numberOfBytes < -1) {
            return false;
         }

         while (numberOfBytes > 0) {
            if (++index == data.length || (data[index] & otherMask) !=  otherMaskShouldBe) {
               return false;
            }
            numberOfBytes--;
         }


         index++;

      }

      return true;
   }

   static boolean validUtf82(int[] data) {
      int[][] prefixes = new int[][]{{0,0}, {2, 6}, {3, 14}, {4,30}};
      int index = 0;

      while (index < data.length) {
         int firstByte = data[index];

         int numberOfBytes = 0;


         for(int prefixIndex = 0; prefixIndex < prefixes.length; ++prefixIndex) {
            int[] prefix = prefixes[prefixIndex];
            if (firstByte>>(8-(prefix[0] +1)) == prefix[1]) {
               numberOfBytes = prefixIndex + 1;
               break;
            }
         }

         if (numberOfBytes == 0) {
            return false;
         }

         for (int byteIndex = 1; byteIndex < numberOfBytes; byteIndex++) {

            if (++index == data.length || (data[index]>> 6 != 2)) {
               return false;
            }
         }

         ++index;
      }

      return true;
   }
}
