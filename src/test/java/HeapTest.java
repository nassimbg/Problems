import static org.junit.Assert.assertEquals;

import java.util.Comparator;

import org.junit.Test;

public class HeapTest {

   @Test
   public void pollAndInitiate() {
      Integer[] arrays = new Integer[] {5, 3, 100, 2, 0, -1};

      Heap<Integer> integerHeap = new Heap<>(arrays, Comparator.naturalOrder());

      Integer[] expected = new Integer[] {-1, 0, 2, 3, 5, 100};
      for (int i = 0; i < arrays.length; i++) {
         assertEquals(expected[i], integerHeap.poll());
      }
   }



   @Test
   public void add() {
      Integer[] arrays = new Integer[] {5, 3, 100, 2, 0, -1};

      Heap<Integer> integerHeap = new Heap<>(arrays, Comparator.naturalOrder());
      integerHeap.add(11);
      integerHeap.add(-2);

      Integer[] expected = new Integer[] {-2, -1, 0, 2, 3, 5, 11, 100};
      for (int i = 0; i < arrays.length; i++) {
         assertEquals(expected[i], integerHeap.poll());
      }
   }

   @Test
   public void remove() {
      Integer[] arrays = new Integer[] {5, 3, 100, 2, 0, -1};

      Heap<Integer> integerHeap = new Heap<>(arrays, Comparator.naturalOrder());

      integerHeap.remove(2);

      Integer[] expected = new Integer[] {-1, 0, 3, 5, 100};
      for (int i = 0; i < expected.length; i++) {
         assertEquals(expected[i], integerHeap.poll());
      }
   }
}