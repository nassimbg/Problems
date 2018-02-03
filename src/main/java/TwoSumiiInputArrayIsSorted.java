public class TwoSumiiInputArrayIsSorted {
   public static int[] twoSum(int[] numbers, int target) {

      int start = 0;
      int end = numbers.length - 1;

      while(start < end) {
         int find = target - numbers[start];

         while(numbers[end] > find) {
            --end;
         }
         if (numbers[end] == find) {
            return new int[]{start + 1, end + 1};
         }
         ++start;
      }

      return new int[]{};
   }
}
