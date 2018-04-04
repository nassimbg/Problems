import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuperUglyNumberTest {

   @Test
   public void test1() {

      assertEquals(2, SuperUglyNumber.nthSuperUglyNumber(2, new int[] { 2, 3, 5 }));
   }

   @Test
   public void test2() {

      assertEquals(32, SuperUglyNumber.nthSuperUglyNumber(12, new int[] { 2,7,13,19}));
   }
}