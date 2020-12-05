import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FrogJump {

   public boolean canCrossOptimized(int[] stones) {

      if (stones.length == 0) {
         return false;
      }

      if (stones.length < 2) {
         return true;
      }


      Map<Integer, Set<Integer>> reached = new HashMap<>();
      reached.computeIfAbsent(stones[0] + 1, k -> new HashSet<>()).add(1);
      for (int i = 1; i < stones.length - 1; i++) {

         int stonePosition = stones[i];

         final Set<Integer> jumpsNeeded = reached.get(stonePosition);

         if (jumpsNeeded != null) {
            for (final Integer currentJumpNeeded : jumpsNeeded) {
               reached.computeIfAbsent(stonePosition + currentJumpNeeded, ky -> new HashSet<>()).add(currentJumpNeeded);

               if (currentJumpNeeded > 1) {
                  reached.computeIfAbsent(stonePosition + currentJumpNeeded - 1, ky -> new HashSet<>())
                      .add(currentJumpNeeded - 1);
               }
               reached.computeIfAbsent(stonePosition + currentJumpNeeded + 1, ky -> new HashSet<>()).add(currentJumpNeeded + 1);
            }
         }
      }

      return reached.containsKey(stones[stones.length - 1]);
   }

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
