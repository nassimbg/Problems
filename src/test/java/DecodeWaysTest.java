import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecodeWaysTest {
   @Test
   public void numDecodings() throws Exception {
      assertEquals(2, DecodeWays.numDecodings("12"));
   }

   @Test
   public void numDecoding2() throws Exception {
      assertEquals(3, DecodeWays.numDecodings("212"));
   }

   @Test
   public void numDecoding3() throws Exception {
      assertEquals(0, DecodeWays.numDecodings(""));
   }

   @Test
   public void numDecoding4() throws Exception {
      assertEquals(1, DecodeWays.numDecodings("2"));
   }

   @Test
   public void numDecoding5() throws Exception {
      assertEquals(0, DecodeWays.numDecodings("0"));
   }

   @Test
   public void numDecoding6() throws Exception {
      assertEquals(1, DecodeWays.numDecodings("10"));
   }

   @Test
   public void numDecoding7() throws Exception {
      assertEquals(1, DecodeWays.numDecodings("202"));
   }

   @Test
   public void numDecoding8() throws Exception {
      assertEquals(2, DecodeWays.numDecodings("26"));
   }

}