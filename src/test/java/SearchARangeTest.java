import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchARangeTest {
   @Test
   public void minBinarySearch() throws Exception {

      assertEquals(3, SearchARange.minBinarySearch(new int[]{5, 7, 7, 8, 8, 10}, 0, 5, 8));
   }

   @Test
   public void minBinarySearc2() throws Exception {

      assertEquals(1, SearchARange.minBinarySearch(new int[]{5, 7, 7, 8, 8, 10}, 0, 5, 7));
   }

   @Test
   public void maxBinarySearch() throws Exception {

      assertEquals(4, SearchARange.maxBinarySearch(new int[]{5, 7, 7, 8, 8, 10}, 0, 5, 8));
   }

   @Test
   public void maxBinarySearc2() throws Exception {

      assertEquals(2, SearchARange.maxBinarySearch(new int[]{5, 7, 7, 8, 8, 10}, 0, 5, 7));
   }


   @Test
   public void search() throws Exception {

      assertArrayEquals(new int[] {3,4}, SearchARange.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
   }

   @Test
   public void search2() throws Exception {

      assertArrayEquals(new int[] {1,2}, SearchARange.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 7));
   }

   @Test
   public void search3() throws Exception {

      assertArrayEquals(new int[] {0,5}, SearchARange.searchRange(new int[]{7, 7, 7, 7,7,7}, 7));
   }


   @Test
   public void search4() throws Exception {

      assertArrayEquals(new int[] {1,1}, SearchARange.searchRange(new int[]{5, 7, 8, 8, 8, 10}, 7));
   }


   @Test
   public void search9() throws Exception {

      assertArrayEquals(new int[] {-1,-1}, SearchARange.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 9));
   }

}