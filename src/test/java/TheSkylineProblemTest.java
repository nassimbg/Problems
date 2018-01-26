import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TheSkylineProblemTest {
   @Test
   public void getSkyline() throws Exception {
      int[][] buildings =  new int[][] {
         new int[]{2 ,9 ,10}, new int[]{3 ,7 ,15}, new int[]{5 ,12 ,12}, new int[]{15 ,20 ,10}, new int[]{19 ,24 ,8}
      };

      List<int[]> skyline = TheSkylineProblem.getSkyline(buildings);
      List<int[]> expected = Arrays.asList(new int[] { 2, 10 }, new int[] { 3, 15 }, new int[] { 7, 12 }, new int[] { 12, 0 }, new int[] { 15, 10 }, new int[] { 20, 8 }, new int[] { 24, 0 });

      assertEquals(skyline.size(), expected.size());

      for (int i = 0; i < skyline.size(); i++) {
         assertArrayEquals(expected.get(i), skyline.get(i));
      }
   }


   @Test
   public void getSkyline2() throws Exception {
      int[][] buildings =  new int[][] {
        new int[]{0,2,3}, new int[]{2,5,3}
      };

      List<int[]> skyline = TheSkylineProblem.getSkyline(buildings);
      List<int[]> expected = Arrays.asList(new int[] { 0,3}, new int[] { 5,0});

      assertEquals(skyline.size(), expected.size());

      for (int i = 0; i < skyline.size(); i++) {
         assertArrayEquals(expected.get(i), skyline.get(i));
      }
   }

   @Test
   public void getSkyline3() throws Exception {
      int[][] buildings =  new int[][] {

        new int[]{1,2,1}, new int[]{1,2,2}, new int[]{1,2,3}
      };

      List<int[]> skyline = TheSkylineProblem.getSkyline(buildings);
      List<int[]> expected = Arrays.asList(new int[] { 1,3}, new int[] { 2,0});

      assertEquals(skyline.size(), expected.size());

      for (int i = 0; i < skyline.size(); i++) {
         assertArrayEquals(expected.get(i), skyline.get(i));
      }
   }

}