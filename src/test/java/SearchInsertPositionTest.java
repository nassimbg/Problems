import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchInsertPositionTest {
   @Test
   public void searchInsert() throws Exception {
      assertEquals(3, SearchInsertPosition.searchInsert(new int[] {1,2,3,4,5}, 4));
   }



   @Test
   public void searchInsert1() throws Exception {
      assertEquals(3, SearchInsertPosition.searchInsert(new int[] {1,2,3,5}, 4));
   }

   @Test
   public void searchInsert2() throws Exception {
      assertEquals(0, SearchInsertPosition.searchInsert(new int[] {}, 4));
   }
}