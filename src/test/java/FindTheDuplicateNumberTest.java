import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindTheDuplicateNumberTest {

   @Test
   public void findDuplicate() {
      assertEquals(3, FindTheDuplicateNumber.findDuplicate(new int[] { 1, 2, 3, 3, 3, 5 }));
   }


   @Test
   public void findDuplicate1() {
      assertEquals(5, FindTheDuplicateNumber.findDuplicate(new int[] { 1,5,5,6,2,8,4,7,5,5 }));
   }

   @Test
   public void findDuplicate2() {
      assertEquals(4, FindTheDuplicateNumber.findDuplicate(new int[] {1,4,4,2,4}));
   }
   @Test
   public void findDuplicate3() {
      assertEquals(9, FindTheDuplicateNumber.findDuplicate(new int[] {2,5,9,6,9,3,8,9,7,1}));
   }


   @Test
   public void findDuplicate4() {
      assertEquals(3, FindTheDuplicateNumber.findDuplicate(new int[] {2,5,4,3,3}));
   }
}