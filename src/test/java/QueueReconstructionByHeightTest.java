import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QueueReconstructionByHeightTest {

   @Test
   public void reconstructQueue() {
      int[][] persons = new int[][] {
        {7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}
      };

      int[][] actual = QueueReconstructionByHeight.reconstructQueue(persons);


      int[][] expected = new int[][] {
        {5,0}, {7,0}, {5,2}, {6,1}, {4,4}, {7,1}
      };

      assertArrayEquals(expected, actual);
   }
}