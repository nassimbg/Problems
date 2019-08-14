import static org.junit.Assert.*;

import org.junit.Test;

public class BeautifulArrangementTest {

   @Test
   public void countArrangement() {
      assertEquals(2, BeautifulArrangement.countArrangement(2));
   }


   @Test
   public void countArrangement2() {
      //1 2 3
      //3 2 1
      //2 1 3
      assertEquals(3, BeautifulArrangement.countArrangement(3));
   }
}