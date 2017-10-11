import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SpiralMatrixTest {
   @Test
   public void spiralOrder() throws Exception {

      int[][] matrix = new int[][]{
         {1,2,3},
         {4,5,6},
         {7,8,9}
      };

      assertEquals(Arrays.asList(1,2,3,6,9,8,7,4,5), SpiralMatrix.spiralOrder(matrix));
   }

   @Test
   public void spiralOrder1() throws Exception {

      int[][] matrix = new int[][]{
        {1,2,3,10},
        {4,5,6,11},
        {7,8,9,12}
      };

      assertEquals(Arrays.asList(1,2,3,10,11,12,9,8,7,4,5,6), SpiralMatrix.spiralOrder(matrix));
   }

   @Test
   public void spiralOrder2() throws Exception {

      int[][] matrix = new int[][]{
        {1, 2, 3, 10},
        {4, 5, 6, 11},
        {7, 8, 9, 12},
        {16,15,14,13},
        {17,18,19,20}
      };

      assertEquals(Arrays.asList(1,2,3,10,11,12,13,20,19,18,17,16,7,4,5,6,9,14,15,8), SpiralMatrix.spiralOrder(matrix));
   }

   @Test
   public void spiralOrder3() throws Exception {

      int[][] matrix = new int[][]{};

      assertEquals(new ArrayList<>(), SpiralMatrix.spiralOrder(matrix));
   }

   @Test
   public void spiralOrder4() throws Exception {

      int[][] matrix = new int[][]{{}};

      assertEquals(new ArrayList<>(), SpiralMatrix.spiralOrder(matrix));
   }

   @Test
   public void spiralorder5() throws Exception {

      int[][] matrix = new int[][]{
        {1},
        {2},
        {3},
        {4},
        {5},
        {6},
        {7},
        {8},
        {9},
        {10}
      };

      assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), SpiralMatrix.spiralOrder(matrix));
   }

   @Test
   public void spiralorder6() throws Exception {

      int[][] matrix = new int[][]{
        {1,11},
        {2,12},
        {3,13},
        {4,14},
        {5,15},
        {6,16},
        {7,17},
        {8,18},
        {9,19},
        {10,20}};

      assertEquals(Arrays.asList(1, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2), SpiralMatrix.spiralOrder(matrix));
   }




}