import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class CountOfSmallerNumbersAfterSelfTest {

   @Test
   public void countSmaller() {
      assertEquals(Arrays.asList(2, 1, 1, 0), CountOfSmallerNumbersAfterSelf.countSmaller(new int[] { 5, 2, 6, 1 }));
   }

}