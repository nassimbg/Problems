import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrogJump {
   public static boolean canCross(int[] stones) {
      if (stones.length == 0) {
         return false;
      }

      List<List<Integer>> reachabilityToStones = new ArrayList<>();
      reachabilityToStones.add(Arrays.asList(0));

      for(int currentPosition = 1; currentPosition < stones.length; ++currentPosition) {
         List<Integer> currentStoneReachability = findReachabilityFromPreviousStone(stones, reachabilityToStones, currentPosition);

         reachabilityToStones.add(currentStoneReachability);
      }

      return !reachabilityToStones.get(stones.length - 1).isEmpty();
   }

   private static List<Integer> findReachabilityFromPreviousStone(int[] stones, List<List<Integer>> reachabilityToStones, int currentPositionIndex) {
      List<Integer> currentStoneReachability = new ArrayList<>();
      int currentStonePosition = stones[currentPositionIndex];

      for (int previousStone = 0; previousStone < currentPositionIndex; ++previousStone) {
         int stepsToReachCurrentStone = currentStonePosition - stones[previousStone];

         for (int stepsToReachPreviousStone : reachabilityToStones.get(previousStone)) {
            if (Math.abs(stepsToReachPreviousStone - stepsToReachCurrentStone) <= 1) {
               currentStoneReachability.add(stepsToReachCurrentStone);
               break;
            }
         }
      }
      return currentStoneReachability;
   }
}
