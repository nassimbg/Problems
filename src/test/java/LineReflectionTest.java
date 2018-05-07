import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LineReflectionTest {

   @Test
   public void solve() {
      int[][] points = new int[][] {
        {1,1},
        {-1,1}
      };
      assertTrue(LineReflection.solve(points));
   }

   @Test
   public void solve2() {
      int[][] points = new int[][] {
        {1,1},
        {-1,-1}
      };
      assertFalse(LineReflection.solve(points));
   }

   @Test
   public void solve3() {
      int[][] points = new int[][] {
        {1,1},
        {0,1},
        {-1,1}
      };
      assertTrue(LineReflection.solve(points));
   }
}