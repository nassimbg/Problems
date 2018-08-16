public class SentenceScreenFitting {
   public static int wordsTyping(String[] sentence, int rows, int cols) {
      int counter = 0;
      int wordIndex = 0;
      int row = 0;

      while (row < rows) {
         int columnsUsed = 0;

         while (columnsUsed < cols) {

            if (columnsUsed > 0) {
               ++columnsUsed;
            }

            if (wordIndex == sentence.length) {
               wordIndex = 0;
               counter++;
            }

            int lengthOfWord = sentence[wordIndex].length();
            if (cols - columnsUsed >= lengthOfWord) {
               columnsUsed += lengthOfWord;
               wordIndex++;
            } else {
               break;
            }
         }

         ++row;
      }

      return counter;
   }
}
