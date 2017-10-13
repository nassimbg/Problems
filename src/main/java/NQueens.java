import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

   public static List<List<String>> solveNQueens(int n) {


      // initialize the combinations list with all combinations of the last row
      List<List<Integer>> combinations = initializeWithCombinationsOfLastRow(n);

      //start with before the last row and back track upwards
      for(int row = n - 2 ; row >= 0; --row) {
         List<List<Integer>> newCombinations = new ArrayList<>();

         for (int column = 0; column < n; column++) {
            for (List<Integer> combination : combinations) {
               if (valid(combination, column)) {
                  List<Integer> validNewCombination = new ArrayList<>(combination);
                  validNewCombination.add(column);
                  newCombinations.add(validNewCombination);
               }
            }

         }
         combinations = newCombinations;
      }

      return createValidQueensMatrix(n, combinations);
   }

   private static List<List<Integer>> initializeWithCombinationsOfLastRow(int n) {
      List<List<Integer>> combinations = new ArrayList<>();

      for (int column = 0; column < n; column++) {
         List<Integer> validNewCombination = new ArrayList<>();
         validNewCombination.add(column);

         combinations.add(validNewCombination);
      }

      return combinations;
   }

   //check if any column in the previous row is equal to the current column or we have a slope of 1 which means that the two positions are on a diagonal
   // => the place of the current queen is not valid
   private static boolean valid(List<Integer> combination, int column) {
      for (int indexOfPreviousRow = 0; indexOfPreviousRow < combination.size(); indexOfPreviousRow++) {
         Integer columnIndex = combination.get(indexOfPreviousRow);
         if (columnIndex == column || isSlopeOne(column, columnIndex, combination.size() - indexOfPreviousRow)) {
            return false;
         }
      }
      return true;
   }

   private static boolean isSlopeOne(int column, int columnIndex, int diffOfRows) {
      return Math.abs(column - columnIndex) == Math.abs(diffOfRows);
   }

   private static List<List<String>> createValidQueensMatrix(int n, List<List<Integer>> combinations) {
      List<List<String>> Queens = new ArrayList<>();
      char[] chars = new char[n];
      Arrays.fill(chars, '.');

      for (List<Integer> validCombination : combinations) {
         List<String> queen = new ArrayList<>();
         for (int row = validCombination.size() - 1; row >= 0; row--) {
            Integer column = validCombination.get(row);
            chars[column] = 'Q';
            queen.add(new String(chars));
            chars[column] = '.';
         }
         Queens.add(queen);
      }
      return Queens;
   }
}
