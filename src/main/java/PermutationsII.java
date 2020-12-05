import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Objects;

public class PermutationsII {
   public static List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> results = new ArrayList<>();
      Arrays.sort(nums);
      dfs(nums, results, new boolean[nums.length], new ArrayDeque<>());
      return results;
   }

   private static void dfs(int[] nums, List<List<Integer>> results, boolean[] taken, Deque<Integer> values) {
      if (values.size() == nums.length) {
         results.add(new ArrayList<>(values));
      } else {
         for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !taken[i - 1]) {
               continue;
            }

            if (!taken[i]) {
               taken[i] = true;
               values.addLast(nums[i]);
               dfs(nums, results, taken, values);
               values.pollLast();
               taken[i] = false;
            }
         }
      }
   }

   public static List<List<Integer>> permuteOld(int[] nums) {

      Arrays.sort(nums);
      List<List<Integer>> rightList = new ArrayList<>(nums.length);
      List<Integer> emptyPermutation = new ArrayList<>(nums.length);
      for (int i = 0; i < nums.length; i++) {
         emptyPermutation.add(null);
      }
      rightList.add(emptyPermutation);

      for (int index = nums.length - 1; index >= 0; index--) {
         List<List<Integer>> leftList = new ArrayList<>(nums.length);

         for (int permutationIndex = 0; permutationIndex < nums.length; permutationIndex++) {

            for (List<Integer> listPerCellInRight : rightList) {
               int valueToAdd = nums[index];
               if (listPerCellInRight.get(permutationIndex) == null && !findOccurrence(listPerCellInRight, permutationIndex, valueToAdd)) {
                  List<Integer> permutation = new ArrayList<>(listPerCellInRight);
                  permutation.set(permutationIndex, valueToAdd);
                  leftList.add(permutation);

               }
            }

         }
         rightList = leftList;
      }

      return rightList;
   }

   private static boolean findOccurrence(List<Integer> listPerCellInRight, int permutationIndex, int valueToAdd) {
      for (int i = 0; i < permutationIndex; i++) {
         Integer integer = listPerCellInRight.get(i);
         if(Objects.equals(valueToAdd, integer)) {
            return true;
         }
      }
      return false;
   }
}
