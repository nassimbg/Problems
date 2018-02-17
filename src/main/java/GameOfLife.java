
public class GameOfLife {
   public void gameOfLife(int[][] board) {

      for (int x = 0; x < board.length; x++) {
         for (int y = 0; y < board[0].length; y++) {

            boolean currentState = board[x][y] == 1;
            int numberOfAliveNeighbors = getNumberOfAliveNeighbors(board, x, y);

            if (currentState && numberOfAliveNeighbors == 2 || numberOfAliveNeighbors == 3) {
               board[x][y] = board[x][y] | 1 << 1;
            }

         }
      }

      for (int x = 0; x < board.length; x++) {
         for (int y = 0; y < board[0].length; y++) {

            board[x][y] = board[x][y] >> 1;

         }
      }

   }

   private static int getNumberOfAliveNeighbors(int[][] board, int x, int y) {
      int numberOFAliveNeighbors = 0;


         if (y > 0) {
            numberOFAliveNeighbors += wasAlive(board[x][y - 1]);
         }

         if (y < board[x].length - 1) {
            numberOFAliveNeighbors += wasAlive(board[x][y + 1]);
         }

         if (x > 0) {
            numberOFAliveNeighbors += wasAlive(board[x - 1][y]);

            if (y > 0) {
               numberOFAliveNeighbors += wasAlive(board[x - 1][y - 1]);
            }

            if (y < board[x].length - 1) {
               numberOFAliveNeighbors += wasAlive(board[x - 1][y + 1]);
            }
         }

         if (x < board.length - 1) {
            numberOFAliveNeighbors += wasAlive(board[x + 1][y]);

            if (y > 0) {
               numberOFAliveNeighbors += wasAlive(board[x + 1][y - 1]);
            }

            if (y < board[x].length - 1) {
               numberOFAliveNeighbors += wasAlive(board[x + 1][y + 1]);
            }
         }


      return numberOFAliveNeighbors;

   }

   private static int wasAlive(int x) {
      return x & 1;
   }


}
