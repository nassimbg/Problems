import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
   public List<Integer> findDisappearedNumbers(int[] nums) {

      for (int index = 0; index < nums.length; index++) {
         int val = Math.abs(nums[index]);

         if (nums[val - 1] > 0) {
            nums[val - 1] *= (-1);
         }
      }

      List<Integer> results = new ArrayList<>();

      for (int index = 0; index < nums.length; index++) {
         if (nums[index] > 0) {
            results.add(index + 1);
         }
      }

      return results;
   }
}
