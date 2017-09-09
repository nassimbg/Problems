public class ContainerWithMostWater {

   public static int maxArea(int[] height) {

      int increasingIndex = 0;
      int decreasingIndex = height.length -1;

      int max = 0;

      while (increasingIndex < decreasingIndex) {

         int increasingHeight = height[increasingIndex];
         int decreasingHeight = height[decreasingIndex];

         int minHeight = decreasingHeight;
         if (increasingHeight < decreasingHeight) {
            minHeight = increasingHeight;
            ++increasingIndex;
         } else {
            --decreasingIndex;
         }

         max = Math.max(max, (decreasingIndex - increasingIndex + 1) * minHeight);
      }

      return max;
   }
}
