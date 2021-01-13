import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AQuestions {

  public static int solution1(int[] A) {
    if (A == null || A.length == 0) {
      return 0;
    }

    Map<Integer, Integer> freqPerValue = new HashMap<>();
    int longestSpike = A.length;
    int maxValue = Integer.MIN_VALUE;

    for (int currentValue : A) {
      maxValue = Math.max(maxValue, currentValue);

      int currentValueFreq = freqPerValue.compute(currentValue, (k, v) -> v == null ? 1 : v + 1);

      if (currentValueFreq > 2) {
        longestSpike--;
      }
    }

    if (freqPerValue.get(maxValue) > 1) {
      longestSpike--;
    }

    return longestSpike;
  }


  /**
   * looks similar to https://www.geeksforgeeks.org/find-a-mother-vertex-in-a-graph/
   * @param A
   * @param B
   * @return
   */
  public static int solution2(int[] A, int[] B) {
    // write your code in Java SE 8

    if (isEmptyOrNull(A) || isEmptyOrNull(B)) {
      return -1;
    }

    final Map<Integer, List<Integer>> reverseAdjList = buildReverseAdjList(A, B);

    return findRome(reverseAdjList);
  }

  private static Map<Integer, List<Integer>> buildReverseAdjList(int[] A, int[] B) {
    final int length = A.length;

    Map<Integer, List<Integer>> reverseAdjList = new HashMap<>();
    for (int index = 0; index < length; index++) {
      reverseAdjList.computeIfAbsent(B[index], k -> new ArrayList<>()).add(A[index]);
      reverseAdjList.computeIfAbsent(A[index], k -> new ArrayList<>());
    }

    return reverseAdjList;
  }

  private static boolean isEmptyOrNull(int[] array) {
    return array == null || array.length == 0;
  }


  private static int findRome(Map<Integer, List<Integer>> reverseAdjList) {
    int assumedRome = findAssumedRome(reverseAdjList);

    return checkAssumedRomeIsCorrect(reverseAdjList, assumedRome);
  }

  private static int findAssumedRome(final Map<Integer, List<Integer>> reverseAdjList) {
    Set<Integer> visitedCities = new HashSet<>();
    int assumedRome = -1;

    for (final int city : reverseAdjList.keySet()) {
      if (!visitedCities.contains(city)) {
        dfs(reverseAdjList, city, visitedCities);
        assumedRome = city;
      }
    }

    return assumedRome;
  }

  private static void dfs(Map<Integer, List<Integer>> reverseAdjList, int currentCity, Set<Integer> visitedCities) {
    visitedCities.add(currentCity);

    for (int reverseReachableCity : reverseAdjList.get(currentCity)) {
      if (!visitedCities.contains(reverseReachableCity)) {
        dfs(reverseAdjList, reverseReachableCity, visitedCities);
      }
    }
  }

  /**
   * Now that we have city that is assumed to be Rome, we need to check that it's actually Rome
   * by doing a one more dfs starting from {@code assumedRome} and traversing the whole graph to see
   * if we reach all the cities
   * @param reverseAdjList is the reverse adj list of the cities
   * @param assumedRome is the value of the assumed city to be Rome
   * @return the value of the actual Rome after proving that {@code assumedRome} exists else -1
   */
  private static int checkAssumedRomeIsCorrect(final Map<Integer, List<Integer>> reverseAdjList, final int assumedRome) {
    Set<Integer> citiesReachableFromAssumedRome = new HashSet<>();

    dfs(reverseAdjList, assumedRome, citiesReachableFromAssumedRome);
    for (Integer city : reverseAdjList.keySet()) {
      if (!citiesReachableFromAssumedRome.contains(city)) {
        return -1;
      }
    }
    return assumedRome;
  }
}
