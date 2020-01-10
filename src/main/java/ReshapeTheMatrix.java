public class ReshapeTheMatrix {
   public static int[][] matrixReshape(int[][] nums, int r, int c) {
      if (nums.length == 0 || nums[0].length == 0) {
         return nums;
      }

      int rows = nums.length;
      int cols = nums[0].length;

      if (rows * cols < r * c) {
         return nums;
      }

      int[][] newNums = new int[r][c];
      int nr = 0;
      int nc = 0;
      for (int or = 0; or < rows; or++) {
         for (int oc = 0; oc < cols; oc++) {

            newNums[nr][nc++] = nums[or][oc];

            if (nc == c) {
               nr++;
               nc = 0;
               if (nr == r) {
                  return newNums;
               }
            }
         }
      }

      return newNums;
   }
}
