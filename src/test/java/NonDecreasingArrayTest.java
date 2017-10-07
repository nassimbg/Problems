import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NonDecreasingArrayTest {
   @Test
   public void checkPossibility1() throws Exception {

      assertTrue(NonDecreasingArray.checkPossibility(new int[]{4,2,3}));
   }

   @Test
   public void checkPossibility2() throws Exception {

            assertFalse(NonDecreasingArray.checkPossibility(new int[]{4,2,1}));
   }


   @Test
   public void checkPossibility3() throws Exception {

      assertFalse(NonDecreasingArray.checkPossibility(new int[]{3,4,2,3}));
   }

   @Test
   public void checkPossibility4() throws Exception {

      assertTrue(NonDecreasingArray.checkPossibility(new int[]{2,3,3,2,4}));
   }

}