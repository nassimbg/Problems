public class AndroidUnlockPatterns {
   public static int  numberOfPatterns(int m, int n) {
      boolean [][] pattern = new boolean[3][3];


      // 1,3,9,7 has the same count
      // 4,9,6,2 has the same count
      // 5 has the same count

      int result = 4 * dfs(1, m ,n,  pattern, 0, 0, 0 ,0 )+
        4 * dfs(1,m ,n,    pattern, 0, 1, 0 ,0 ) +
        dfs(1,m, n ,  pattern, 1, 1, 0 ,0 );

      return result;

   }

   private static int dfs(int level, int m, int n, boolean[][] pattern, int row, int column, int rowIncrement, int columnIncrement) {

      if (level > n) {
         return 0;
      }

      while (true) {
         if (row < 0 || row >= pattern.length || column < 0 || column >= pattern[0].length) {
            return 0;
         }
         if (pattern[row][column]) {
            row += rowIncrement;
            columnIncrement += columnIncrement;
         } else {
            break;
         }
      }


      int count = 0;
      if (level++ >= m) {
         count++;
      }

      pattern[row][column] = true;

      int value = dfs(level, m,n, pattern, row, column, -1, -1) +
        dfs(level, m,n, pattern, row , column, -1,0) +
        dfs(level, m,n, pattern, row , column, -1, 1) +
        dfs(level, m,n, pattern, row, column, 0 , -1) +
        dfs(level, m,n, pattern, row, column, 0 ,1) +
        dfs(level, m,n, pattern, row, column, 1, -1) +
        dfs(level, m,n, pattern, row , column , 1, 0) +
        dfs(level, m,n, pattern, row, column, 1, 1);
      pattern[row][column] = false;

      return value + count;

   }
}
