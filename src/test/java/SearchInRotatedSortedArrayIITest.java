import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SearchInRotatedSortedArrayIITest {


   @Test
   public void find1() throws Exception {

      assertTrue(SearchInRotatedSortedArrayII.search(new int[] {4,5,6,7,0,1,2}, 2));
   }

   @Test
   public void find2() throws Exception {

      assertTrue(SearchInRotatedSortedArrayII.search(new int[] {4,5,6,7,0,1,2}, 5));
   }

   @Test
   public void find3() throws Exception {

      assertFalse(SearchInRotatedSortedArrayII.search(new int[] {}, 5));
   }

   @Test
   public void find4() throws Exception {

      assertTrue(SearchInRotatedSortedArrayII.search(new int[] {5}, 5));
   }

   @Test
   public void find5() throws Exception {

      assertFalse(SearchInRotatedSortedArrayII.search(new int[] {5}, 4));
   }

   @Test
   public void find6() throws Exception {

      assertTrue( SearchInRotatedSortedArrayII.search(new int[] {5,6}, 6));
   }

   @Test
   public void find7() throws Exception {

      assertTrue(SearchInRotatedSortedArrayII.search(new int[] {1,2,3,4,5,6}, 4));
   }
   @Test
   public void find8() throws Exception {

      assertTrue(SearchInRotatedSortedArrayII.search(new int[] {5,5,6,1,2,3,3}, 3));
   }


   @Test
   public void find9() throws Exception {

      assertTrue(SearchInRotatedSortedArrayII.search(new int[] {1,2,1}, 2));
   }

   @Test
   public void find10() throws Exception {

      assertTrue(SearchInRotatedSortedArrayII.search(new int[] {3,1}, 1));
   }

   @Test
   public void find11() throws Exception {

      assertFalse(SearchInRotatedSortedArrayII.search(new int[] {1,1}, 0));
   }

   @Test
   public void find12() throws Exception {

      assertTrue(SearchInRotatedSortedArrayII.search(new int[] {1,1,3,1}, 3));
   }

   @Test
   public void find13() throws Exception {

      assertTrue(SearchInRotatedSortedArrayII.search(new int[] {3,1,1,1,1}, 3));
   }

   @Test
   public void find14() throws Exception {

      assertTrue(SearchInRotatedSortedArrayII.search(new int[] {1,3,1,1}, 3));
   }
}