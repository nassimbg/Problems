import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {


   private static int[][] directions = new int[][] { { 1, 0 },  { -1, 0 },  { 0, 1 },  { 0, -1 }};


   public static List<int[]> pacificAtlantic(int[][] matrix) {
      List<int[]> result = new ArrayList<>();

      if(matrix.length == 0 || matrix[0].length == 0) {
         return result;
      }

      int[][] visited = new int[matrix.length][matrix[0].length];

      dfs(matrix, Integer.MAX_VALUE, 0, 0, visited, true, result);
      dfs(matrix, Integer.MAX_VALUE, matrix.length - 1, matrix[0].length - 1, visited, false, result);

      return result;
   }

   private static void dfs(int[][] matrix, int parentHeight, int row, int column, int[][] visited, boolean isPacific, List<int[]> result) {
      if (row >= 0 && row < matrix.length && column >= 0 && column < matrix[0].length
        && (isPacific ? 1 & visited[row][column] : 2 & visited[row][column]) == 0) {


         if ((isPacific ? (row == 0 || column == 0) : (row == matrix.length - 1 || column == matrix[0].length - 1))
           || parentHeight <= matrix[row][column]) {

            visited[row][column] += (isPacific ? 1 : 2);

            if (visited[row][column] == 3) {
               result.add(new int[] {row, column});
            }
            for(int[] dir : directions) {
               dfs(matrix, matrix[row][column], row + dir[0], column + dir[1], visited, isPacific, result);
            }
         }
      }
   }



   public static List<int[]> pacificAtlantic2(int[][] matrix) {
      List<int[]> result = new ArrayList<>();
      int rows = matrix.length;

      if (rows == 0 || matrix[0].length == 0) {
         return result;
      }
      int columns = matrix[0].length;

      boolean[][] passedBy = new boolean[rows][columns];
      for (int row = 0; row < rows; row++) {
         for (int column = 0; column < columns; column++) {
            if (dfs(matrix, row, column, passedBy) == 3) {
               result.add(new int[]{row, column});
            }
         }
      }

      return result;
   }

   /**
    * reached pacific => code = 1
    * reached atlantic => code = 2
    * reached both => code = 3
    * @param matrix
    * @param row
    * @param column
    * @param passedBy
    * @return
    */
   private static int dfs(int[][] matrix, int row, int column, boolean[][] passedBy) {

      int reachabilityFromChildren = 0;
      if (row == 0 || column == 0) {
         reachabilityFromChildren =  1;
      }

      if (row == matrix.length - 1 || column == matrix[row].length - 1) {
         reachabilityFromChildren |= 2;
      }

      passedBy[row][column] = true;

      for (int i = 0; i < directions.length && reachabilityFromChildren != 3 ; i++) {
         int[] direction = directions[i];
         reachabilityFromChildren |=  dfsOnSide(matrix, row, column, passedBy, direction[0], direction[1]);
      }

      passedBy[row][column] = false;


      return reachabilityFromChildren;
   }

   private static int dfsOnSide(int[][] matrix, int row, int column, boolean[][] passedBy, int additionRow, int additionColumn) {
      int nextRow = row + additionRow;
      int nextColumn = column + additionColumn;
      if (nextRow >= 0 && nextRow < matrix.length && nextColumn >= 0 && nextColumn < matrix[row].length && !passedBy[nextRow][nextColumn] &&  matrix[row][column] >= matrix[nextRow][nextColumn]) {
         return dfs(matrix, nextRow, nextColumn, passedBy);
      }
      return 0;
   }
}
