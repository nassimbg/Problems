public class MajorityElement {
   public int majorityElement(int[] nums) {
      int counter = 1;
      int majorityelement = nums[0];

      for (int i = 1; i < nums.length; i++) {
          if (majorityelement == nums[i]) {
            ++counter;
         } else {
            --counter;
         }

         if (counter == 0) {
            ++counter;
            majorityelement = nums[i];
         }
      }

      return majorityelement;
   }
}
