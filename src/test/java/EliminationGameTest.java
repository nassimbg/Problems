import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EliminationGameTest {

   @Test
   public void lastRemaining() {
      assertEquals(6, EliminationGame.lastRemaining(9));
   }

   @Test
   public void lastRemaining2() {
      assertEquals(2, EliminationGame.lastRemaining(5));
   }
   @Test
   public void lastRemaining3() {
      assertEquals(54, EliminationGame.lastRemaining(100));
   }

}