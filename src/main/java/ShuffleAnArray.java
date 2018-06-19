import java.util.Arrays;
import java.util.Random;

public class ShuffleAnArray {
   class Solution {

      private final int[] nums;
      private final Random random;
      private final int[] shuffledArray;

      public Solution(int[] nums) {

         this.nums = nums;
         this.random = new Random();
         this.shuffledArray = Arrays.copyOf(nums, nums.length);
      }

      /** Resets the array to its original configuration and return it. */
      public int[] reset() {
         return this.nums;
      }

      /** Returns a random shuffling of the array. */
      public int[] shuffle() {

         for (int index = 0; index < shuffledArray.length; index++) {
            int randomIndex = random.nextInt(shuffledArray.length - index) + index;
            swap(this.shuffledArray, randomIndex, index);
         }

         return shuffledArray;
      }

      private void swap(int[] values, int firstIndex, int secondIndex) {
         int t = values[firstIndex];
         values[firstIndex] = values[secondIndex];
         values[secondIndex] = t;
      }
   }
}
