public class GasStation {
   public static int canCompleteCircuit(int[] gas, int[] cost) {
      if (gas == null || cost == null) {
         return -1;
      }

      int startingStation = 0;
      int reachedStation = 0;

      int currentRemainingGas = 0;

      while (startingStation < gas.length) {
         while (currentRemainingGas >= 0) {
            currentRemainingGas += (gas[reachedStation] - cost[reachedStation]);
            reachedStation = (reachedStation + 1) % gas.length;

            if (reachedStation == startingStation) {
               break;
            }
         }

         if (reachedStation == startingStation && currentRemainingGas >= 0) {
            return startingStation;
         }

         while (currentRemainingGas < 0 && startingStation < gas.length) {
            currentRemainingGas -= (gas[startingStation] - cost[startingStation]);
            startingStation++;
         }
      }

      return -1;
   }
}
