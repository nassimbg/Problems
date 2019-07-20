import static org.junit.Assert.*;

import org.junit.Test;

public class NumberComplementTest {

   @Test
   public void findComplement() {
      assertEquals(2, NumberComplement.findComplement(5));
   }

   @Test
   public void findComplement2() {
      assertEquals(0, NumberComplement.findComplement(1));
   }
}