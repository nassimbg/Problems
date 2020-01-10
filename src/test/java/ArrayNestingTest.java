import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayNestingTest {

   @Test
   public void arrayNesting() {
      assertEquals(4, ArrayNesting.arrayNesting(new int[] {5,4,0,3,1,6,2}));
   }
}