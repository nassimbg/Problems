public class TrappingRainWater {

   public static int trap(int[] height) {
      int leftIndex = 0;
      int rightIndex= height.length - 1;

      int area = 0;
      int minHeight = 0;
      while (leftIndex < rightIndex) {
         int leftHeight = height[leftIndex];
         int rightHeight = height[rightIndex];

         int currentMin = Math.min(leftHeight, rightHeight);
         if (currentMin > minHeight) {
            area += (rightIndex - leftIndex - 1) * (currentMin - minHeight);
            minHeight = currentMin;
         }

         int newIndex;
         if (leftHeight > rightHeight) {
            --rightIndex;

            newIndex = rightIndex;
         } else {
            ++leftIndex;
            newIndex = leftIndex;

         }
         //to remove the new area of the block from the total area of water
         if (area > 0 && leftIndex < rightIndex) {
            area -= Math.min(height[newIndex], minHeight);
         }
      }

      return area;
   }
}
