public class UniqueSubstringsInWraparoundString {
   public static int findSubstringInWraproundString(String p) {

      int numberOfSubStrings = 0;
      int[] maxSpanPerChar = new int[26];

      int leftPointer = 0;
      int rightPointer = 1;

      while (rightPointer <= p.length()) {
         while (rightPointer < p.length() && (p.charAt(rightPointer - 1) - 'a' + 1) % 26 == p.charAt(rightPointer) - 'a') {
            rightPointer++;
         }

         // do calculations

         int length = rightPointer - leftPointer;
         int currentNumberOfSub = getCurrentNumberOfSub(length);

         int startIndex = p.charAt(leftPointer) - 'a';

         int tempLength = length;
         while (tempLength > 0) {
            if (maxSpanPerChar[startIndex] <= tempLength) {
               currentNumberOfSub -= maxSpanPerChar[startIndex];
               maxSpanPerChar[startIndex] = tempLength;
               tempLength--;
               startIndex = (startIndex + 1) % 26;
            } else {
               currentNumberOfSub -= getCurrentNumberOfSub(tempLength);
               break;
            }
         }


         numberOfSubStrings += currentNumberOfSub;

         leftPointer = rightPointer;
         rightPointer++;
      }

      return numberOfSubStrings;
   }

   private static int getCurrentNumberOfSub(int length) {
      return (int) ((length) * (length + 1) * 0.5);
   }
}
