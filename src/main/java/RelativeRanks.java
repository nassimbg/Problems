import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {
   public static String[] findRelativeRanks(int[] nums) {
      //todo are they sorted? No
      //todo do we have duplicates? yes
      // todo what is the complexity needed? O(n)

      int[] ints = Arrays.copyOf(nums, nums.length);

      Arrays.sort(ints);

      Map<Integer, Integer> rank = new HashMap<>();
      for (int i = 0; i < ints.length; i++) {
         rank.put(ints[i], ints.length - i);
      }

      String[] scores = new String[nums.length];
      for (int i = 0; i < nums.length; i++) {
         int score = rank.getOrDefault(nums[i], -1);
         if (score > 3) {
            scores[i] = "" + score;
         } else if (score == 1) {
            scores[i] = "Gold Medal";
         } else if (score == 2) {
            scores[i] = "Silver Medal";
         } else {
            scores[i] = "Bronze Medal";
         }
      }

      return scores;
   }
}
