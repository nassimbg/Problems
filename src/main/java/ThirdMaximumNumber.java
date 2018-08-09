public class ThirdMaximumNumber {
   public int thirdMax(int[] nums) {

      long first = Long.MIN_VALUE;
      long second = Long.MIN_VALUE;
      long third = Long.MIN_VALUE;

      for(int number : nums) {

         if (number >= first) {
            if (number != first) {
               third = second;
               second = first;
            }
            first = number;
         } else if (number >= second) {
            if (number != second) {
               third = second;
            }
            second = number;
         } else if (number >= third) {
            third = number;
         }
      }

      return (int)(third == Long.MIN_VALUE ? first : third);
   }
}
