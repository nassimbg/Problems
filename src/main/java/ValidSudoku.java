import java.util.function.BiFunction;

public class ValidSudoku {

   public static boolean isValidSudoku(char[][] board) {
      return checkSquares(board) && checkPerOrdinate(board, (x, y) -> board[x][y]) && checkPerOrdinate(board, (x,y) -> board[y][x]);
   }

   private static boolean checkPerOrdinate(char[][] board, BiFunction<Integer, Integer, Character> charLookUp) {
      for (int x = 0; x < board.length; x++) {
         int validation = 0;
         for (int y = 0; y < board.length; y++) {
            char c = charLookUp.apply(x, y);

            if (c != '.') {
               int val = c - '0';

               if (val > 9 || (validation >> val & 1) == 1) {
                  return false;
               }

               validation |= 1 << val;
            }
         }
      }
      return true;
   }

   private static boolean checkSquares(char[][] board) {
      for (int x = 0; x < 3; x++) {
         for (int y = 0; y < 3; y++) {
            int validation=0;

            int staringPointOnX = 3*x;
            int startingPointOnY = 3*y;
            for (int i = staringPointOnX; i < staringPointOnX + 3; i++) {
               for (int j = startingPointOnY; j < startingPointOnY + 3; j++) {
                  char c = board[i][j];

                  if (c != '.') {
                     int val = c - '0';

                     if (val > 9 || (validation>>val & 1) == 1) {
                        return false;
                     }

                     validation |= 1<< val;
                  }
               }
            }
         }
      }
      return true;
   }
}
