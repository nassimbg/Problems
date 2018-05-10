import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WiggleSortII {



   public static void wiggleSort(int[] nums) {
      Arrays.sort(nums);


      int end = nums.length % 2 == 0 ? nums.length - 2 : nums.length - 1;

      int start = 1;

      while (start < end) {
         int t = nums[end];
         nums[end] = nums[start];
         nums[start] = t;

         start +=2;
         end -=2;
      }
   }

   public static void wiggleSort2(int[] nums) {
      HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();

      for (int num : nums) {
         integerIntegerHashMap.compute(num, (k, v) -> v == null ? 1 : ++v);
      }

      int index = 0;
      while (!integerIntegerHashMap.isEmpty()) {
         Iterator<Map.Entry<Integer, Integer>> iterator = integerIntegerHashMap.entrySet().iterator();

         while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> next = iterator.next();
            nums[index++] = next.getKey();
            next.setValue(next.getValue() - 1);
            if (next.getValue() == 0) {
               iterator.remove();
            }
         }
      }

      for (int i = 0; i < nums.length - 1; i++) {


         if (i % 2 == 0) {
            if (nums[i] > nums[i + 1]) {
               swap(nums, i, i+1);
            }
         } else {
            if (nums[i] < nums[i + 1]) {
               swap(nums, i, i+1);
            }
         }
      }
   }

   private static void swap(int[] nums, int index1, int index2) {
      int t = nums[index1];
      nums[index1] = nums[index2];
      nums[index2] = t;
   }
}
