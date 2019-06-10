public class WordSearch {


   public static boolean exist(char[][] board, String word) {

      for(int row = 0; row < board.length; ++row) {
         for(int column = 0; column < board[0].length; ++column) {
            if (recursiveSearch(board, word, row, column, 0)) {
               return true;
            }
         }
      }
      return false;
   }

   private static boolean recursiveSearch(char[][] board, String word, int row, int column, int indexInString) {

      if (indexInString == word.length()) {
         return true;
      }

      if (row < 0 || row == board.length || column < 0 || column == board[0].length) {
         return false;
      }

      boolean found = false;
      if (board[row][column] == word.charAt(indexInString)) {
         char temp = board[row][column];
         board[row][column] = '*';

         found = recursiveSearch(board, word, row + 1, column, indexInString + 1) ||
           recursiveSearch(board, word, row - 1, column, indexInString + 1) ||
           recursiveSearch(board, word, row, column + 1, indexInString + 1) ||
           recursiveSearch(board, word, row, column - 1, indexInString + 1);

         board[row][column] = temp;
      }

      return found;

   }
}
