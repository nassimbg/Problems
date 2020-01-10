public class ArrayNesting {
   public static int arrayNesting(int[] nums) {

      boolean[] used = new boolean[nums.length];

      int max = 0;
      for (int i = 0; i < nums.length; ++i) {
         if (!used[i]) {

            int currentIndex = i;
            int currentSize = 0;

            do {

               used[currentIndex] = true;
               currentIndex = nums[currentIndex];
               currentSize++;
            } while(i != currentIndex);

            max = Math.max(max, currentSize);
         }
      }

      return max;
   }

}
