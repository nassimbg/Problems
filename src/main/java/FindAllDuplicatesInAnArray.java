import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {

   public List<Integer> findDuplicates(int[] nums) {
      List<Integer> results = new ArrayList<>();

      for (int index = 0; index < nums.length; index++) {
         int appearedVal = Math.abs(nums[index]) - 1;

         if (nums[appearedVal] < 0) {
            results.add(appearedVal + 1);
         } else {
            nums[appearedVal] *= (-1);
         }
      }

      return results;
   }
}
