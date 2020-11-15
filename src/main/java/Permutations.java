import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Permutations {

   public static List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> results = new ArrayList<>();

      bk(nums, results, new ArrayDeque<>(), new boolean[nums.length]);
      return results;
   }

   private static void bk(int[] nums, List<List<Integer>> results, Deque<Integer> values, boolean[] taken) {
      if (values.size() == nums.length) {
         results.add(new ArrayList<>(values));
      } else {
         for (int i = 0; i < nums.length; i++) {
            if (!taken[i]) {
               taken[i] = true;
               values.addLast(nums[i]);
               bk(nums, results, values, taken);
               values.pollLast();
               taken[i] = false;
            }
         }
      }
   }

   public static List<List<Integer>> permute2(int[] nums) {
      List<List<Integer>> rightList = new ArrayList<>(nums.length);
      List<Integer> emptyPermutation = new ArrayList<>(nums.length);
      for (int i = 0; i < nums.length; i++) {
         emptyPermutation.add(null);
      }
      rightList.add(emptyPermutation);

      for (int index = nums.length -1; index >= 0; index--) {
         List<List<Integer>> leftList = new ArrayList<>(nums.length);

         for (int permutationIndex = 0; permutationIndex < nums.length; permutationIndex++) {

            for (List<Integer> listPerCellInRight : rightList) {
               //we check if the value is null, so that we know that this index is still empty and haven't been taken
               if (listPerCellInRight.get(permutationIndex) == null) {
                  List<Integer> permutation = new ArrayList<>(listPerCellInRight);
                  permutation.set(permutationIndex, nums[index]);
                  leftList.add(permutation);

               }
            }

         }
         rightList = leftList;
      }

      return rightList;
   }

   public List<List<Integer>> permute1(int[] nums) {
      List<List<List<Integer>>> rightList = new ArrayList<>(3);

      for (int index = nums.length -1; index >= 0; index--) {
         List<List<List<Integer>>> leftList = new ArrayList<>(3);

         for (int permutationIndex = 0; permutationIndex < nums.length; permutationIndex++) {
            List<List<Integer>> listPerCell = new ArrayList<>();

            if (rightList.isEmpty()) {
               List<Integer> permutation = new ArrayList<>(3);
               for (int i = 0; i < nums.length; i++) {
                  permutation.add(null);
               }
               permutation.set(permutationIndex, nums[index]);

               listPerCell.add(permutation);
            } else {
               for (int rightIndex = 0; rightIndex < rightList.size(); rightIndex++) {
                  if (permutationIndex != rightIndex) {

                     for (List<Integer> listPerCellInRight : rightList.get(rightIndex)) {
                        if (listPerCellInRight.get(permutationIndex) == null) {
                           List<Integer> permutation = new ArrayList<>(listPerCellInRight);
                           permutation.set(permutationIndex, nums[index]);

                           listPerCell.add(permutation);
                        }
                     }
                  }
               }
            }
            leftList.add(permutationIndex, listPerCell);
         }

         rightList = leftList;
      }

      List<List<Integer>> answer = new ArrayList<>();

      for (int permutationIndex = 0; permutationIndex < nums.length; permutationIndex++) {
         answer.addAll(rightList.get(permutationIndex));
      }
      return answer;
   }

}
