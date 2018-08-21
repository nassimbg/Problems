import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AllOneTest {

   @Test
   public void inc() {
      AllOne allOne = new AllOne();

      allOne.inc("a");
      allOne.inc("b");
      allOne.inc("b");
      allOne.inc("c");
      allOne.inc("c");
      allOne.inc("c");
      allOne.dec("b");
      allOne.dec("b");

      assertEquals("a", allOne.getMinKey());

      allOne.dec("a");
      assertEquals("c", allOne.getMaxKey());
      assertEquals("c", allOne.getMinKey());
   }


   @Test
   public void inc2() {
      AllOne allOne = new AllOne();

      allOne.inc("a");
      allOne.inc("b");
      allOne.inc("a");
      allOne.dec("b");
      allOne.inc("a");
      allOne.inc("c");

      assertEquals("a", allOne.getMaxKey());
      allOne.dec("a");
      allOne.dec("a");
      allOne.dec("a");
      assertEquals("c", allOne.getMaxKey());

   }

   @Test
   public void inc3() {
      AllOne allOne = new AllOne();

      allOne.inc("a");
      allOne.inc("a");
      allOne.inc("a");
      allOne.inc("b");
      allOne.inc("b");
      allOne.dec("b");
      allOne.dec("b");

      assertEquals("a", allOne.getMaxKey());
      assertEquals("a", allOne.getMinKey());

   }
}