import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShortestWordDistanceII {
   Map<String, List<Integer>> occurences = new HashMap<>();

   public ShortestWordDistanceII(String[] words) {

      for (int i = 0; i < words.length; i++) {
         occurences.computeIfAbsent(words[i], k -> new ArrayList<>()).add(i);
      }
   }


   public int shortest(String word1, String word2) {
      List<Integer> firstList = occurences.get(word1);
      List<Integer> secondList = occurences.get(word2);

      int i = 0;
      int j = 0;

      int shortest = Integer.MAX_VALUE;
      while (i< firstList.size() && j<secondList.size()) {
         int firstWordPlace = firstList.get(i);
         int secondWordPlace = secondList.get(j);
         shortest = Math.min(shortest, Math.abs(firstWordPlace - secondWordPlace));

         if (firstWordPlace < secondWordPlace) {
            ++i;
         } else {
            ++j;
         }
      }
      return shortest;
   }
}
