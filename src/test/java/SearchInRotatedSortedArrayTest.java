import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchInRotatedSortedArrayTest {
   @Test
   public void minPosition() throws Exception {

      assertEquals(4, SearchInRotatedSortedArray.minPosition(new int[] {4,5,6,7,0,1,2}, 0, 6));
   }

   @Test
   public void minPosition2() throws Exception {

      assertEquals(3, SearchInRotatedSortedArray.minPosition(new int[] {4,5,6,0,1,2,3}, 0, 6));
   }

   @Test
   public void minPosition3() throws Exception {

      assertEquals(1, SearchInRotatedSortedArray.minPosition(new int[] {6,0,1,2,3,4,5}, 0, 6));
   }

   @Test
   public void minPosition4() throws Exception {

      assertEquals(2, SearchInRotatedSortedArray.minPosition(new int[] {6,7,1}, 0, 2));
   }

   @Test
   public void minPosition5() throws Exception {

      assertEquals(1, SearchInRotatedSortedArray.minPosition(new int[] {6,1}, 0, 1));
   }


   @Test
   public void find1() throws Exception {

      assertEquals(6, SearchInRotatedSortedArray.search(new int[] {4,5,6,7,0,1,2}, 2));
   }

   @Test
   public void find2() throws Exception {

      assertEquals(1, SearchInRotatedSortedArray.search(new int[] {4,5,6,7,0,1,2}, 5));
   }

   @Test
   public void find3() throws Exception {

      assertEquals(-1, SearchInRotatedSortedArray.search(new int[] {}, 5));
   }

   @Test
   public void find4() throws Exception {

      assertEquals(0, SearchInRotatedSortedArray.search(new int[] {5}, 5));
   }

   @Test
   public void find5() throws Exception {

      assertEquals(-1, SearchInRotatedSortedArray.search(new int[] {5}, 4));
   }

   @Test
   public void find6() throws Exception {

      assertEquals(1, SearchInRotatedSortedArray.search(new int[] {5,6}, 6));
   }

   @Test
   public void find7() throws Exception {

      assertEquals(3, SearchInRotatedSortedArray.search(new int[] {1,2,3,4,5,6}, 4));
   }
}