import static org.junit.Assert.*;

import org.junit.Test;

public class SingleElementInASortedArrayTest {

   @Test
   public void singleNonDuplicate() {
      assertEquals(2, SingleElementInASortedArray.singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8}));
   }

   @Test
   public void singleNonDuplicate2() {
      assertEquals(10, SingleElementInASortedArray.singleNonDuplicate(new int[] {3,3,7,7,10,11,11}));
   }


   @Test
   public void singleNonDuplicate3() {
      assertEquals(3, SingleElementInASortedArray.singleNonDuplicate(new int[] {1,1,2,2,3}));
   }
}