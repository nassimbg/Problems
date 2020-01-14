import static org.junit.Assert.*;

import org.junit.Test;

public class DeleteOperationForTwoStringsTest {

   @Test
   public void minDistance() {
      int minDistance = DeleteOperationForTwoStrings.minDistance("sea", "eat");

      assertEquals(2, minDistance);
   }

   @Test
   public void minDistance2() {
      int minDistance = DeleteOperationForTwoStrings.minDistance("b", "");

      assertEquals(1, minDistance);
   }
}