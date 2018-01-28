public class PaintHouse {
   public int minCost(int[][] costs) {

      int costCurrentRed = costs[0][0];
      int costCurrentGreen = costs[0][1];
      int costCurrentBlue = costs[0][2];

      for (int i = 1; i < costs.length; i++) {

         int tempRed = costs[i][0] + Math.min(costCurrentBlue, costCurrentGreen);
         int tempGreen= costs[i][1] + Math.min(costCurrentBlue, costCurrentRed);
         int tempBlue = costs[i][2] + Math.min(costCurrentGreen, costCurrentRed);

         costCurrentRed = tempRed;
         costCurrentGreen = tempGreen;
         costCurrentBlue = tempBlue;
      }

      return Math.min(costCurrentRed, Math.min(costCurrentBlue, costCurrentGreen));
   }
}
