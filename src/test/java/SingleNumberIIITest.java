import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SingleNumberIIITest {

   @Test
   public void singleNumber() {
      int[] nums = new int[] { -1638685546, -2084083624, -307525016, -930251592, -1638685546, 1354460680, 623522045, -1370026032, -307525016, -2084083624, -930251592, 472570145, -1370026032, 1063150409, 160988123, 1122167217, 1145305475, 472570145, 623522045, 1122167217, 1354460680, 1145305475 };

      assertArrayEquals(new int[] { 1063150409, 160988123 }, SingleNumberIII.singleNumber(nums));
   }
}