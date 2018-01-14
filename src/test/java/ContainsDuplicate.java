import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
   public boolean containsDuplicate(int[] nums) {

      Set<Integer> availableValues = new HashSet<>();

      for (int index = 0; index < nums.length; index++) {
         if (availableValues.contains(nums[index])) {
            return true;
         }
         availableValues.add(nums[index]);
      }

      return false;
   }
}
