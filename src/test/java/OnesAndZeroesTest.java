import static org.junit.Assert.*;

import org.junit.Test;

public class OnesAndZeroesTest {

   @Test
   public void findMaxForm() {
      int maxForm = OnesAndZeroes.findMaxForm(new String[] { "10", "0001", "111001", "1", "0" }, 5, 3);

      assertEquals(4, maxForm);
   }

   @Test
   public void findMaxForm2() {
      int maxForm = OnesAndZeroes.findMaxForm(new String[] { "10", "0", "1" }, 1, 1);

      assertEquals(2, maxForm);
   }

   @Test
   public void findMaxForm3() {
      int maxForm = OnesAndZeroes.findMaxForm(new String[] { "10","0001","111001","1","0"}, 3, 4);

      assertEquals(3, maxForm);
   }

}