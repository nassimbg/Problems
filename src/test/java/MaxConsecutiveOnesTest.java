import static org.junit.Assert.*;

import org.junit.Test;

public class MaxConsecutiveOnesTest {

   @Test
   public void findMaxConsecutiveOnes() {
      int maxConsecutiveOnes = MaxConsecutiveOnes.findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 });

      assertEquals(3, maxConsecutiveOnes);
   }
}