import static org.junit.Assert.*;

import org.junit.Test;

public class StringCompressionTest {

   @Test
   public void compress() {
      int compress = StringCompression.compress(new char[] { 'a', 'a', 'b', 'b', 'c', 'c', 'c' });

      assertEquals(6, compress);
   }

   @Test
   public void compress2() {
      int compress = StringCompression.compress(new char[] { 'a'});

      assertEquals(1, compress);
   }

   @Test
   public void compress3() {
      int compress = StringCompression.compress(new char[] {'a','b','b','b','b','b','b','b','b','b','b','b','b' });

      assertEquals(4, compress);
   }

   @Test
   public void compress4() {
      int compress = StringCompression.compress(new char[] {'a','a', 'b', 'b', 'a', 'a'});

      assertEquals(6, compress);
   }
}