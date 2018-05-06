import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RussianDollEnvelopesTest {

   @Test
   public void maxEnvelopes() {
      int[][] envelops = new int[][] {
        {5,4},{6,4},{6,7},{2,3}
      };
      assertEquals(3, RussianDollEnvelopes.maxEnvelopes(envelops));
   }


   @Test
   public void maxEnvelopes2() {
      int[][] envelops = new int[][] {
        {5,4},{5,4}
      };
      assertEquals(1, RussianDollEnvelopes.maxEnvelopes(envelops));
   }


   @Test
   public void maxEnvelopes3() {
      int[][] envelops = new int[][] {
        {5,4},{6,4}
      };
      assertEquals(1, RussianDollEnvelopes.maxEnvelopes(envelops));
   }

   @Test
   public void maxEnvelopes4() {
      int[][] envelops = new int[][] {

      };
      assertEquals(0, RussianDollEnvelopes.maxEnvelopes(envelops));
   }
}