import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BrickWallTest {

   @Test
   public void leastBricks() {
      List<List<Integer>> ints = Arrays.asList( Arrays.asList( 1, 2, 2, 1 ), Arrays.asList( 3, 1, 2 ), Arrays.asList( 1, 3, 2 ), Arrays.asList( 2, 4 ), Arrays.asList( 3, 1, 2 ), Arrays.asList( 1, 3, 1, 1 ) );
      
      
      assertEquals(2, BrickWall.leastBricks(ints));
   }
}