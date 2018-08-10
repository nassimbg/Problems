import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

public class PacificAtlanticWaterFlowTest {

   @Test
   public void pacificAtlantic() {
      int[][] matrix = new int[][] {
        {1,2,2,3,5},
        {3,2,3,4,4},
        {2,4,5,3,1},
        {6,7,1,4,5},
        {5,1,1,2,4}
      };

      List<int[]> answer = PacificAtlanticWaterFlow.pacificAtlantic(matrix);

      Set<List<Integer>> expected = new HashSet<>(Arrays.asList(Arrays.asList(0, 4), Arrays.asList(1, 3), Arrays.asList(1, 4), Arrays.asList(2, 2), Arrays.asList(3, 0), Arrays.asList(3, 1), Arrays.asList(4, 0)));

      Set<List<Integer>> lists = answer.stream()
        .map(array -> Arrays.stream(array).boxed().collect(Collectors.toList()))
        .collect(Collectors.toSet());

      assertEquals(expected, lists);
   }
}