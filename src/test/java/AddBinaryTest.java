import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddBinaryTest {
   @Test
   public void addBinary() throws Exception {

      assertEquals("100", AddBinary.addBinary("11", "1"));
   }

   @Test
   public void addBinary2() throws Exception {

      assertEquals("1010", AddBinary.addBinary("111", "11"));
   }

   @Test
   public void addBinary3() throws Exception {

      assertEquals("11", AddBinary.addBinary("", "11"));
   }

   @Test
   public void addBinary4() throws Exception {

      assertEquals("10001", AddBinary.addBinary("111", "1010"));
   }


}