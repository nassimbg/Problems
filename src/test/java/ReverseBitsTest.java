import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseBitsTest {
   @Test
   public void reverseBits() throws Exception {
      assertEquals(964176192, ReverseBits.reverseBits(43261596));
   }


}