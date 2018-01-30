public class PaintHouseII {

   public int minCostII(int[][] costs) {

      if (costs == null || costs.length == 0) {
         return 0;
      }

      int min = -1;
      int min2 = -1;
      for (int i = 0; i < costs.length; i++) {
         int[] house = costs[i];

         int minTemp = 0;
         int min2Temp = 1;

         for (int k = 0; k < house.length; k++) {
            int currentCost = (i == 0 ? 0 : costs[i - 1][(min != k ? min : min2)]) + costs[i][k];

            if (costs[i][minTemp] > currentCost) {
               min2Temp = minTemp;
               minTemp = currentCost;
            } else if (costs[i][min2Temp] > currentCost) {
               min2Temp = currentCost;
            }
         }

         min = minTemp;
         min2 = min2Temp;
      }

      return costs[costs.length - 1][min];
   }
}
