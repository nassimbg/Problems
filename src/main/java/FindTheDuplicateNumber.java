public class FindTheDuplicateNumber {
   public static int findDuplicate(int[] nums) {
      int start = 0;
      int end = nums.length - 1;

      while (start < end) {
         int mid = (start + end)/2;

         int numberEqualsMid = 0;
         int totalUntilMid = 0;
         int numberLessThan = 0;
         for (int num : nums) {
            if (num == mid) {
               ++numberEqualsMid;
               if (numberEqualsMid > 1) {
                  return mid;
               }
            }

            if (num < mid && num >= start) {
               totalUntilMid += num;
               ++numberLessThan;
            }

         }


         int summationBetweenStartAndExcludeMid = (mid * (mid - 1)) / 2 - (start * (start - 1) /2);

         if (numberLessThan > mid - start || (numberLessThan == mid - start && summationBetweenStartAndExcludeMid != totalUntilMid)) {
            end = mid - 1;
         } else {
            start = mid + 1;
         }
      }

      return start;

   }
}
