import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerReplacementTest {

   @Test
   public void integerReplacement() {
      assertEquals(3, IntegerReplacement.integerReplacement(8));
   }

   @Test
   public void integerReplacement1() {
      assertEquals(4, IntegerReplacement.integerReplacement(7));
   }

   @Test
   public void integerReplacement2() {
      assertEquals(0, IntegerReplacement.integerReplacement(-1));
   }


   @Test
   public void integerReplacement3() {
      assertEquals(32, IntegerReplacement.integerReplacement(Integer.MAX_VALUE));
   }
}