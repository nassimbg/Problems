import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InsertDeleteGetRandomTest {

   @Test
   public void testing1() {
      InsertDeleteGetRandom.RandomizedSet randomizedSet = new InsertDeleteGetRandom.RandomizedSet();

      assertTrue(randomizedSet.insert(1));
      assertFalse(randomizedSet.remove(2));
      assertTrue(randomizedSet.insert(2));
      assertTrue(randomizedSet.remove(1));
      assertFalse(randomizedSet.insert(2));
      assertEquals(2, randomizedSet.getRandom());

   }
}