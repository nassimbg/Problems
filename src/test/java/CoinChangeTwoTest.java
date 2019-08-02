import static org.junit.Assert.*;

import org.junit.Test;

public class CoinChangeTwoTest {

   @Test
   public void change() {
      assertEquals(4, CoinChangeTwo.change(5, new int[] { 1, 2, 5 }));
   }
}