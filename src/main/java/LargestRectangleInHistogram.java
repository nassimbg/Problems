@SuppressWarnings("Duplicates")
public class LargestRectangleInHistogram {



   /**
    * The below explanation can be based on {LargestRectangleInHistogramTest#largestRectangleArea5}
    * @param heights
    * @return
    */
   public static int largestRectangleArea(int[] heights) {

      if(heights.length == 0) {
         return 0;
      }

      /*
         - This stack is used to put all the indexes of the heights that we encounter
           upon passing through the array and that are greater than the last height inserted to the array.
         - So the stack basically will contain only the heights that are larger than the previous heights inserted (sorted values)

         - Moreover, This stack is used to know how much a specific height, that was pushed, can expand in the direction of iteration
           since upon iteration we check if the height of the current index is less than the height of the last push height in the stack
           if it is we pop the last height an calculate the area from the starting of this height to the current index
       */

      int popIndex = 0;
      int[] heightsStack = new int[heights.length];
      heightsStack[popIndex] = heights.length - 1;

      // This array is used to indicate the possible expansion limit (indicated by the index)
      // of the current index's height in the backward direction of the iteration
      // (to accommodate for backward expansion)
      int[] rightExpansion = new int[heights.length];
      rightExpansion[heights.length - 1] = heights.length - 1;

      /*
            - we start iteration from before the last index and downward to reach index 0.
            - Upon iteration:
                - we assume for now that the max expansion to the right is the current index itself
                - then we look at the heightsStack to check if the last element pushed is larger than the current index's height.
                   - If it is, we pop it from the stack since we can't expand the popped height towards the left anymore
                   because the current height is smaller than the popped height.
                   - Then we calculate the area representing the popped height which is equal to the
                   height * (distance from the current index to the max right expansion index of this height).
                   - We check the calculated area if its larger than the max Area calculated previously to set it as a new max Area
                   - we set the popped index from the stack as the new right expansion of the current index
                   since the current height is smaller than the popped height so the current height can expand to the right.
                - repeat step 2 until the current height is larger than the last element in the stack

       */
      int maxArea = 0;
      for (int index = heights.length - 2; index >= 0; --index) {
         int currentHeight = heights[index];

         rightExpansion[index] = index;
         //even though we have here a while the total cost will be amortized O(n) (think of the stack amortization problem)
         while (popIndex > -1 && currentHeight <= heights[heightsStack[popIndex]]) {
            int indexOfLastHeight = heightsStack[popIndex];
            maxArea = Math.max(maxArea, heights[indexOfLastHeight] * (rightExpansion[indexOfLastHeight] - index));
            --popIndex;

            rightExpansion[index] = rightExpansion[indexOfLastHeight];
         }

         heightsStack[++popIndex] = index;
      }

      /*
         - After reaching the beginning of the array (finishing the iterations) we check if we still have any heights in the stack to calculate their area.
       */
      while (popIndex > -1) {
         int indexOfLastHeight = heightsStack[popIndex];
         maxArea = Math.max(maxArea, heights[indexOfLastHeight] * (rightExpansion[indexOfLastHeight] + 1));
         --popIndex;
      }

      return maxArea;
   }
}
