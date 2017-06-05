import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by nboughannam on 6/5/2017.
 */
public class TwoSum {

   /**
    * The two sum problem is solved using A Map where the key is the value in the in an array
    * and the value of the map is a list of indexes where this value is in the array.
    *
    * @param nums the list of numbers
    * @param target the target values that we need to reach
    * @return array of two indexes that sum to the target
    */
   public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, List<Integer>> values = fillMap(nums);

      for (Integer integer : values.keySet()) {
         int secondValue = target - integer;


         List<Integer> count = values.getOrDefault(secondValue, new ArrayList<>());

         if((count.size() > 0 && secondValue != integer)) {
            return new int[]{values.get(integer).get(0), count.get(0)};
         }
         if(secondValue == integer && count.size() > 1) {
            return new int[]{count.get(0), count.get(1)};
         }

      }
      throw new NullPointerException();
   }

   private HashMap<Integer, List<Integer>> fillMap(int[] nums) {
      HashMap<Integer, List<Integer>> values = new HashMap<>();

      for(int i = 0; i < nums.length; i++) {
         List<Integer> indecies = values.get(nums[i]);
         if (indecies != null) {
            indecies.add(i);
         } else {
            List<Integer> list = new ArrayList<>();
            list.add(i);
            values.put(nums[i], list);
         }
      }
      return values;
   }
}
