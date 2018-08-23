import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Comparator;

import org.junit.Test;

public class QuickSortTest {

   @Test
   public void sort() {

      Integer[] values = new Integer[] {5, 23, 1, 400, 0, 7, 2, 3, 4, -1};


      QuickSort.sort(values, Comparator.naturalOrder());

      assertArrayEquals(new Integer[] { -1, 0, 1, 2, 3, 4, 5, 7, 23, 400} , values);
   }


   @Test
   public void quickSelect() {

      Integer[] values = new Integer[] {5, 23, 1, 400, 0, 7, 2, 3, 4, -1};

      Integer quickSelect = QuickSort.quickSelect(values, Comparator.naturalOrder(), 8);

      assertEquals(7, quickSelect.intValue());
   }
}