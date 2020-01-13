import static org.junit.Assert.*;

import org.junit.Test;

public class OutOfBoundaryPathsTest {

   @Test
   public void findPaths() {
      int paths = OutOfBoundaryPaths.findPaths(2, 2, 2, 0, 0);

      assertEquals(6, paths);
   }

   @Test
   public void findPaths2() {
      int paths = OutOfBoundaryPaths.findPaths(1, 3, 3, 0, 1);

      assertEquals(12, paths);
   }

   @Test
   public void findPaths3() {
      int paths = OutOfBoundaryPaths.findPaths(8, 7, 16, 1, 5);

      assertEquals(102984580, paths);
   }

   @Test
   public void findPaths4() {
      int paths = OutOfBoundaryPaths.findPaths(8, 50, 23, 5, 26);

      assertEquals(914783380, paths);
   }

   @Test
   public void findPaths5() {
      int paths = OutOfBoundaryPaths.findPaths(45, 35, 47, 20, 31);

      assertEquals(951853874, paths);
   }
}