import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestDistanceFromAllBuildingsTest {

    @Test
    public void solution() {
        int[][] matrix = new int[][] {
                {1,0,2,0,1},
                {0,0,0,0,0},
                {0,0,1,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };

        assertEquals(7, ShortestDistanceFromAllBuildings.SolutionDFS(matrix));
    }
}