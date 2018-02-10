import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class WiggleSortTest {

   @Test
   public void sort() {
      assertArrayEquals(new int[]{3,5,1,6,2,4}, WiggleSort.sort(new int[]{3, 5, 2, 1, 6, 4}));
   }

}