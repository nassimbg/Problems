import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTrailingZeroesTest {
   @Test
   public void trailingZeroes() throws Exception {
      assertEquals(24, FactorialTrailingZeroes.trailingZeroes(100));
   }

   @Test
   public void trailingZeroes1() throws Exception {
      assertEquals(6, FactorialTrailingZeroes.trailingZeroes(29));
   }
}