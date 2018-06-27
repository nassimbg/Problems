import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PerfectRectangleTest {

   @Test
   public void isRectangleCover() {

      int[][] rec = new int[][] {
        {1,1,3,3},
        {3,1,4,2},
        {3,2,4,4},
        {1,3,2,4},
        {2,3,3,4}
      };

      assertTrue(PerfectRectangle.isRectangleCover(rec));
   }


   @Test
   public void isRectangleCover2() {

      int[][] rec = new int[][] {
        {1,1,2,3},
        {1,3,2,4},
        {3,1,4,2},
        {3,2,4,4}
      };

      assertFalse(PerfectRectangle.isRectangleCover(rec));
   }

   @Test
   public void isRectangleCover3() {

      int[][] rec = new int[][] {
        {1,1,3,3},
        {3,1,4,2},
        {1,3,2,4},
        {3,2,4,4}
      };

      assertFalse(PerfectRectangle.isRectangleCover(rec));
   }

   @Test
   public void isRectangleCover4() {

      int[][] rec = new int[][] {
        {1,1,3,3},
        {3,1,4,2},
        {1,3,2,4},
        {2,2,4,4}
      };

      assertFalse(PerfectRectangle.isRectangleCover(rec));
   }

   @Test
   public void isRectangleCover5() {

      int[][] rec = new int[][] {
        {0,0,4,1},
        {0,0,4,1}
      };

      assertFalse(PerfectRectangle.isRectangleCover(rec));
   }

   @Test
   public void isRectangleCover6() {

      int[][] rec = new int[][] {{1,2,4,4},{1,0,4,1},{0,2,1,3},{0,1,3,2},{3,1,4,2},{0,3,1,4},{0,0,1,1}};

      assertTrue(PerfectRectangle.isRectangleCover(rec));
   }

}