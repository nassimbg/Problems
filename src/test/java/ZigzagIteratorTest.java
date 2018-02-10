import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ZigzagIteratorTest {

   @Test
   public void next() {
      List<Integer> expected = Arrays.asList(1, 3, 2, 4, 5, 6);
      Iterator<Integer> iterator = expected.iterator();

      ZigzagIterator zigzagIterator = new ZigzagIterator(Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4, 5, 6)));


      while (zigzagIterator.hasNext()) {
         assertEquals(iterator.next(), zigzagIterator.next());
      }

      assertFalse(iterator.hasNext());
   }

}