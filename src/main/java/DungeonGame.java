public class DungeonGame {
   public static int calculateMinimumHP(int[][] dungeon) {
      int[] dp = new int[dungeon.length];

      for (int col = dungeon[0].length - 1; col >= 0; --col) {
         for (int row = dungeon.length - 1; row >= 0; --row) {

            if (row == dungeon.length - 1 && col == dungeon[0].length - 1) {
               dp[row] = dungeon[row][col] > 0 ? 0 : dungeon[row][col];
            } else {
               int val = Integer.MIN_VALUE;

               if (row < dungeon.length - 1) {
                  val = dp[row + 1];
               }

               if (col < dungeon[0].length - 1) {
                  val = Math.max(val, dp[row]);
               }

               int addition = dungeon[row][col];

               dp[row] = addition + val > 0 ? 0 : val + addition;
            }
         }
      }
      return (dp[0] > 0 ? 0 : -dp[0]) + 1;
   }
}
