import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MoveZeroesTest {

   @Test
   public void moveZeroes() {
      int[] values = new int[]{0, 1, 0, 3, 12};

      MoveZeroes.moveZeroes(values);

      assertArrayEquals(new int[] {1, 3, 12, 0, 0}, values);
   }


   @Test
   public void moveZeroes1() {
      int[] values = new int[]{};

      MoveZeroes.moveZeroes(values);

      assertArrayEquals(new int[] {}, values);
   }

}