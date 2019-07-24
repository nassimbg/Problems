public class BattleshipsInABoard {
   public int countBattleships(char[][] board) {

      int count = 0;
      for (int row = 0; row < board.length; row++) {
         for (int col = 0; col < board[0].length; col++) {
            if (board[row][col] == 'X') {
               if ((row == 0 || board[row - 1][col] != 'X') && (col == 0 || board[row][col - 1] != 'X')) {
                  count++;
               }
            }
         }
      }

      return count;
   }
}
