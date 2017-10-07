import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountAndSayTest {
   @Test
   public void countAndSay1() throws Exception {

      assertEquals("1", CountAndSay.countAndSay(1));
   }

   @Test
   public void countAndSay2() throws Exception {

      assertEquals("1211", CountAndSay.countAndSay(4));
   }

}