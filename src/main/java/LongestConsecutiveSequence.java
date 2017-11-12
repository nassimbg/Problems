import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("Duplicates")
public class LongestConsecutiveSequence {

   public static int longestConsecutive(int[] nums) {

      Map<Integer, Integer> counters = new HashMap<>(nums.length);
      int maxLength = 0;

      for (int index = 0; index < nums.length; index++) {
         int value = nums[index];

         int length = counters.computeIfAbsent(value, k -> {
            Integer lengthOfLeft = counters.getOrDefault(value - 1, 0);
            Integer lengthOfRight = counters.getOrDefault(value + 1, 0);

            int lengthOfCurrent = lengthOfLeft + lengthOfRight + 1;

            counters.put(value + lengthOfRight, lengthOfCurrent);
            counters.put(value - lengthOfLeft, lengthOfCurrent);

            return lengthOfCurrent;
         });

         if (maxLength < length) {
            maxLength = length;
         }
      }

      return maxLength;

   }

   public static int longestConsecutive1(int[] nums) {

      Map<Integer, List<Integer>> counters = new HashMap<>(nums.length);
      int maxLength = 0;

      for (int index = 0; index < nums.length; index++) {
         int value = nums[index];

         List<Integer> range = counters.computeIfAbsent(value, k -> {
            List<Integer> getListOfPreviousValue = counters.get(value - 1);
            List<Integer> getListOfNextValue = counters.get(value + 1);

            int minValue =getListOfPreviousValue != null ? getListOfPreviousValue.get(0) : k;
            int maxValue =getListOfNextValue != null ? getListOfNextValue.get(1) : k;

            List<Integer> listOfCurrentValue = Arrays.asList(minValue, maxValue);

            List<Integer> minList = counters.get(minValue);
            if (minList != null) {
               minList.set(1, maxValue);
            }

            List<Integer> maxList = counters.get(maxValue);
            if (maxList != null) {
               maxList.set(0, minValue);
            }

            return listOfCurrentValue;
         });

         int length = range.get(1) - range.get(0) + 1;

         if (maxLength < length) {
            maxLength = length;
         }
      }

      return maxLength;

   }
}
