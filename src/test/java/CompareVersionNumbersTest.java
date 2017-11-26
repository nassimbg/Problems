import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CompareVersionNumbersTest {
   @Test
   public void compareVersion() throws Exception {
      assertEquals(1, CompareVersionNumbers.compareVersion("1.1", "0.1"));
   }

   @Test
   public void compareVersion1() throws Exception {
      assertEquals(-1, CompareVersionNumbers.compareVersion("0.1", "1.1"));
   }

   @Test
   public void compareVersion2() throws Exception {
      assertEquals(-1, CompareVersionNumbers.compareVersion("2.3", "13.42"));
   }

   @Test
   public void compareVersion3() throws Exception {
       assertEquals(1, CompareVersionNumbers.compareVersion("1.20", "1.13"));
   }

   @Test
   public void compareVersion4() throws Exception {
      assertEquals(1, CompareVersionNumbers.compareVersion("0.123.42", "0.0.23"));
   }

   @Test
   public void compareVersion5() throws Exception {
      assertEquals(-1, CompareVersionNumbers.compareVersion("1", "1.1"));
   }

   @Test
   public void compareVersion6() throws Exception {
      assertEquals(-1, CompareVersionNumbers.compareVersion("1.34", "1.1455"));
   }

   @Test
   public void compareVersion7() throws Exception {
      assertEquals(1, CompareVersionNumbers.compareVersion("0.1", "0.0.1"));
   }

   @Test
   public void compareVersion8() throws Exception {
      assertEquals(0, CompareVersionNumbers.compareVersion("1", "1.0"));
   }
}