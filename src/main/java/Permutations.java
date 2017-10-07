import java.util.ArrayList;
import java.util.List;

public class Permutations {

   public static List<List<Integer>> permute(int[] nums) {
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
