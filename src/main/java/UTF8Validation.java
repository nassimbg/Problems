public class UTF8Validation {


   static boolean validUtf8(int[] data) {
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
